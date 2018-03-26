package controllers

import javax.inject._
import play.api.mvc._
import play.api.mvc.MessagesAbstractController
import play.api.mvc.MessagesControllerComponents
import play.api.mvc.MessagesRequestHeader
import swiftvis2.plotting.renderer.SVGRenderer
import swiftvis2.plotting.Plot
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms.nonEmptyText

case class Loginformation(username:String, password:String)

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  
  val loginForm = Form(mapping("username" -> nonEmptyText(20),
                       "password" -> nonEmptyText(20))
                       (Loginformation.apply)(Loginformation.unapply)
                  )
  
  var tasks:Map[(String,String),List[String]]= Map(
      ("username1","password") -> List("Laundry","Dishes"),
      ("username2","qwerty") -> List("Laundry","Dishes")
      )
                  
  def index = Action { implicit request =>
    Ok(views.html.index("Your new application is ready."))
  }

  def plot = Action {
	  val plot = Plot.scatterPlot(1 to 10, (1 to 10).map(i => i*i), "Plot", "X", "Y")
    
    Ok(SVGRenderer.stringValue(plot, 800, 600)).as("image/svg+xml")
  }
  
  def phone(phoneNumber: String) = Action {
    Ok(phoneNumber)
  }
  
  def todo = TODO
  
  def ajaxTest = Action { implicit request =>
    Ok(views.html.ajaxTest())
  }
  
  def ajaxResponse = Action {
    Ok("It worked.")
  }
  
  def login = Action { implicit request =>
    Ok(views.html.login(loginForm))
  }
  
  def newUser = Action{ implicit request =>
    Ok(views.html.newUser())
  }
  
  def taskList() = Action { implicit request =>
    request.body.asFormUrlEncoded match {
      case Some(formData) =>
        val username = formData("username").head.toString
        val password = formData("password").head.toString
        tasks.get((username,password)) match {
          case Some(value) =>
            Ok(views.html.taskList(username,password,value))
          case None =>
            Redirect(routes.HomeController.login)
        }
      case None =>
        Redirect(routes.HomeController.login)
    }
  }
  
  def newTaskList() = Action { implicit request =>
    request.body.asFormUrlEncoded match {
      case Some(formData) =>
        val username = formData("username").head.toString
        val password = formData("password").head.toString
        tasks.get((username,password)) match {
          case Some(value) =>
            Ok(views.html.taskList(username,password,value))
          case None =>
            tasks += ((username,password) -> List())
            Ok(views.html.taskList(username,password,List()))
        }
      case None =>
        Redirect(routes.HomeController.login)
    }
  }
  
  def addItem(username:String,password:String) = Action { implicit request =>
    request.body.asFormUrlEncoded match {
      case Some(itemData) =>
        val item = itemData("add").head.toString
        tasks.get((username,password)) match{
          case Some(value) =>
            tasks += ((username,password) -> (item::value))
            Ok(views.html.taskList(username,password,(item::value)))
          case None =>
            Redirect(routes.HomeController.login)
        }
      case None =>
        Redirect(routes.HomeController.login)
    }
  }
  
  def removeItem(username:String,password:String) = Action { implicit request =>
    request.body.asFormUrlEncoded match {
      case Some(itemData) =>
        val item = itemData("remove").head.toString
        tasks.get((username,password)) match {
          case Some(value) =>
            val nv = value.filterNot(_.equals(item))
            tasks += ((username,password) -> nv)
            Ok(views.html.taskList(username,password,nv))
          case None =>
            Redirect(routes.HomeController.login) //FIX
        }
      case None =>
        Redirect(routes.HomeController.login)
    }
  }

}
