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
case class NewCustomer(isManager:Int,name:String,phone:String,points:Int,email:String,address:String,state:String,zip:String,username:String,password:String)
case class NewOrder(name:String,foodId:Int,price:BigDecimal,description:String)
case class Login(username:String,password:String)

//TODO add change functionality
//TODO add manager functionality

@Singleton
class RestaurantController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {
  
  var language = 1
  
  val newFoodForm = Form(mapping(
    "name" -> nonEmptyText,
    "description" -> nonEmptyText,
    "price" -> bigDecimal(5,2),
    "type" -> nonEmptyText,
    "lan" -> number)(NewFood.apply)(NewFood.unapply))
    
  val loginForm = Form(mapping(
    "username" -> nonEmptyText,
    "password" -> nonEmptyText)(Login.apply)(Login.unapply))
    
  def login = Action.async { implicit request =>
    Future(Ok(views.html.login(loginForm)))
  }
  
  def menu = Action.async { implicit request =>
    val menuFuture = RestaurantQueries.allFood(db)
    menuFuture.map(menu => Ok(views.html.menu(menu, newFoodForm, language)))
  }
  
  def home = Action.async { implicit request =>
    Future(Ok(views.html.home(false)))
  }
  
  def changeLang = Action.async { implicit request =>
    language = (language % 2) + 1
    val menuFuture = RestaurantQueries.allFood(db)
    menuFuture.map(menu => Ok(views.html.menu(menu, newFoodForm, language)))
  }
  
  def credentials = Action.async { implicit request =>
    request.body.asFormUrlEncoded match {
      case Some(formData) =>
        val username = formData("username").head.toString
        val password = formData("password").head.toString
        val userFuture = RestaurantQueries.findUser(db,username,password)
        if(!username.isEmpty && !password.isEmpty){
          userFuture.map(user =>
            Ok(views.html.home()).withSession("uss" -> username, "pss" -> password, "user" -> user.get.isManager.toString)
          )
        }
        else{
          Future(Redirect(routes.RestaurantController.login))
        }
        
      case None =>
        Future(Redirect(routes.RestaurantController.login))
    }
  }
  
}