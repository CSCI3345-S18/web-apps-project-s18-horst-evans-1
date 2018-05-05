package controllers

import javax.inject._
import play.api.mvc._
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import slick.jdbc.JdbcProfile
import slick.jdbc.JdbcCapabilities
import slick.jdbc.MySQLProfile.api._
import models.MenuQueries
import scala.concurrent.ExecutionContext
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import scala.concurrent.Future

case class NewFood(name:String,description:String,price:BigDecimal,foodType:String,language:Int)
case class NewCustomer(isManager:String,name:String,phone:String,points:Int,email:String,address:String,state:String,zip:String,username:String,password:String)
case class NewOrder(name:String,foodId:Int,price:BigDecimal,description:String)

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
    
  def menu = Action.async { implicit request =>
    val menuFuture = MenuQueries.allFood(db)
    menuFuture.map(menu => Ok(views.html.menu(menu, newFoodForm, language)))
  }
  
  def home = Action { implicit request =>
    Ok(views.html.home())
  }
  
  def changeLang = Action.async { implicit request =>
    language = (language % 2) + 1
    val menuFuture = MenuQueries.allFood(db)
    menuFuture.map(menu => Ok(views.html.menu(menu, newFoodForm, language)))
  }
  
}