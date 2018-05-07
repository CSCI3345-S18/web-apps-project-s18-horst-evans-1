package controllers

import javax.inject._
import play.api.mvc._
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import slick.jdbc.JdbcProfile
import slick.jdbc.JdbcCapabilities
import slick.jdbc.MySQLProfile.api._
import models.RestaurantQueries
import scala.concurrent.ExecutionContext
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import scala.concurrent.Future

case class NewFood(name:String,description:String,price:BigDecimal,foodType:String,language:Int)
case class NewCustomer(name:String,phone:String,email:String,address:String,state:String,zip:String,username:String,password:String)
case class NewOrder(username:String,password:String,food:String,price:BigDecimal,description:String)
case class Login(username:String,password:String)

//TODO add change functionality
//TODO add manager functionality

@Singleton
class RestaurantController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {
  
  var language = 1
  
  val newUserForm = Form(mapping(
    "name" -> nonEmptyText,
    "phone" -> nonEmptyText,
    "email" -> nonEmptyText,
    "address" -> nonEmptyText,
    "state" -> nonEmptyText,
    "zip" -> nonEmptyText,
    "username" -> nonEmptyText,
    "password" -> nonEmptyText)(NewCustomer.apply)(NewCustomer.unapply))
  
  val newFoodForm = Form(mapping(
    "name" -> nonEmptyText,
    "description" -> nonEmptyText,
    "price" -> bigDecimal(5,2),
    "type" -> nonEmptyText,
    "lan" -> number)(NewFood.apply)(NewFood.unapply))
    
  val loginForm = Form(mapping(
    "username" -> nonEmptyText,
    "password" -> nonEmptyText)(Login.apply)(Login.unapply))
    
  def allCustomers = Action.async { implicit request =>
    val usersFuture = RestaurantQueries.allUsers(db)
    usersFuture.map(customers => Ok(views.html.login(customers, loginForm, newUserForm)))
  }
    
  def newCustomer = Action.async { implicit request =>
    newUserForm.bindFromRequest().fold(
        formWithErrors => {
          val usersFuture = RestaurantQueries.allUsers(db)
          usersFuture.map(customers => BadRequest(views.html.login(customers, loginForm, formWithErrors)))
        },
        newUser => {
          val addFuture = RestaurantQueries.newCustomer(newUser, db)
          addFuture.map { cnt =>
            if(cnt == 1) Redirect(routes.RestaurantController.login).flashing("message" -> "New User added.")
            else Redirect(routes.RestaurantController.login).flashing("error" -> "failed to add user.")
          }
        })
  }
   
  
  def login = Action.async { implicit request =>
    val usersFuture = RestaurantQueries.allUsers(db)
    usersFuture.map(users => Ok(views.html.login(users,loginForm,newUserForm)))
  }
  
  def menu = Action.async { implicit request =>
    val menuFuture = RestaurantQueries.allFood(db)
    menuFuture.map(menu => {
      var nMenu = menu.groupBy(c=>c.foodType)
      var man = request.session.get("user") match {
        case Some(str) => str
        case None => "0"
      }
      if(language == 1) Ok(views.html.menu(nMenu, newFoodForm, language,man))
      else Ok(views.html.menuSpanish(nMenu, newFoodForm, language,man))
    })
  }
  
  def home = Action.async { implicit request =>
    Future(Ok(views.html.home()).withSession(request.session +("user" -> "0")))
  }
  
  def changeLang = Action.async { implicit request =>
    language = (language % 2) + 1
    val menuFuture = RestaurantQueries.allFood(db)
    menuFuture.map(menu => {
      var nMenu = menu.groupBy(c=>c.foodType)
      var man = request.session.get("user") match {
        case Some(str) => str
        case None => "0"
      }
      if(language == 1) Ok(views.html.menu(nMenu, newFoodForm, language, man))
      else Ok(views.html.menuSpanish(nMenu, newFoodForm, language, man))
    })
  }
  
  def credentials = Action.async { implicit request =>
    request.body.asFormUrlEncoded match {
      case Some(formData) =>
        val username = formData("username").head.toString
        val password = formData("password").head.toString
        val userFuture = RestaurantQueries.findUser(db,username,password)
        if(!username.isEmpty && !password.isEmpty){
          userFuture.map(user => {
            user match {
              case Some(u) => Ok(views.html.home()).withSession("uss" -> username, "pss" -> password, "user" -> user.get.isManager.toString)
              case None => Redirect(routes.RestaurantController.login).flashing("error" -> "Failed to log in.")
            }
          })
        }
        else{
          Future(Redirect(routes.RestaurantController.login))
        }
        
      case None =>
        Future(Redirect(routes.RestaurantController.login))
    }
  }
  
  def addFood = Action.async { implicit request =>
    newFoodForm.bindFromRequest().fold(
      formWithErrors => {
        val foodFuture = RestaurantQueries.allFood(db)
        foodFuture.map(menu => {
          var nMenu = menu.groupBy(c=>c.foodType)
          var man = request.session.get("user") match {
            case Some(str) => str
            case None => "0"
          }
          BadRequest(views.html.menu(nMenu, formWithErrors, language, man))
        })
      },
      newFood => {
        val addFuture = RestaurantQueries.addFood(newFood, db)
        addFuture.map { cnt =>
          if(cnt == 1) Redirect(routes.RestaurantController.menu).flashing("message" -> "New Food added.")
          else Redirect(routes.RestaurantController.menu).flashing("error" -> "Failed to add Food.")
        }
      })
  }
  
  def removeFood(name:String) = Action.async { implicit request =>
    val removeFuture = RestaurantQueries.removeFood(name,db)
    removeFuture.map { cnt =>
      if(cnt == 1) Redirect(routes.RestaurantController.menu).flashing("message" -> "Food removed.")
      else Redirect(routes.RestaurantController.menu).flashing("error" -> "Failed to remove Food.")
    }
  }
  
  def showHome = Action{implicit request =>
    Ok(views.html.home("Homepage"))
  }
  
  def showAbout = Action{implicit request =>
    Ok(views.html.about())
  }
    
  def addToCheckout(name:String,price:Double,desc:String) = Action.async { implicit request =>
    val uss = request.session.get("uss") match {
      case Some(str) => str
      case None => "guest"
    }
    val pss = request.session.get("pss") match {
      case Some(str) => str
      case None => "guest"
    }
    val checkoutFuture = RestaurantQueries.addOrder(name,price,desc,uss,pss,db)
    checkoutFuture.map { cnt =>
      if(cnt == 1) Redirect(routes.RestaurantController.menu).flashing("message" -> "order added.")
      else Redirect(routes.RestaurantController.menu).flashing("error" -> "Failed to add order.")
    }
  }
  
  def checkout = Action.async { implicit request =>
    val uss = request.session.get("uss") match {
      case Some(str) => str
      case None => "guest"
    }
    val pss = request.session.get("pss") match {
      case Some(str) => str
      case None => "guest"
    }
    val checkoutFuture = RestaurantQueries.allOrders(uss,pss,db)
    checkoutFuture.map(orders => {
    var total = 0.0
    for(o <- orders) total = total + o.price
    Ok(views.html.checkout(orders,BigDecimal(total).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble))
    })
  }
  //About page
   def showAboutE = Action{implicit request => 
     Ok(views.html.restInfo(0))
     }
   
   def spanish = Action{implicit request =>
     Ok(views.html.restInfo(1))
         }

  def clear = Action.async { implicit request =>
    val uss = request.session.get("uss") match {
      case Some(str) => str
      case None => "guest"
    }
    val pss = request.session.get("pss") match {
      case Some(str) => str
      case None => "guest"
    }
    val clearFuture = RestaurantQueries.clearOrders(uss,pss,db)
    clearFuture.map { cnt =>
      if(cnt == 1) Redirect(routes.RestaurantController.menu).flashing("message" -> "checkout successful.")
      else Redirect(routes.RestaurantController.menu).flashing("error" -> "Failed to checkout.")
    }
  }
  
  def editFood(name:String,desc:String,ft:String,price:Double,language:Int) = Action { implicit request =>
    Ok(views.html.edit(name,desc,ft,price,language,newFoodForm))
  }
  
  def editQuery(name:String) = Action.async { implicit request =>
    newFoodForm.bindFromRequest().fold(
      formWithErrors => {
        val foodFuture = RestaurantQueries.allFood(db)
        foodFuture.map(menu => {
          var nMenu = menu.groupBy(c=>c.foodType)
          var man = request.session.get("user") match {
            case Some(str) => str
            case None => "0"
          }
          BadRequest(views.html.menu(nMenu, formWithErrors, language, man))
        })
      },
      newFood => {
        val addFuture = RestaurantQueries.editFood(newFood, name, db)
        addFuture.map { cnt =>
          if(cnt == 1) Redirect(routes.RestaurantController.menu).flashing("message" -> "Food edited.")
          else Redirect(routes.RestaurantController.menu).flashing("error" -> "Failed to edit Food.")
        }
      })
  }
  
  def logout = Action.async { implicit request =>
    Future(Ok(views.html.home()).withNewSession)
  }
  
}