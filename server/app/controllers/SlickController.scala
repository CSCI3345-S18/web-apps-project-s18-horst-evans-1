package controllers

import javax.inject._
import play.api.mvc._
import play.api.db.slick.DatabaseConfigProvider
import play.api.db.slick.HasDatabaseConfigProvider

import slick.jdbc.JdbcProfile
import slick.jdbc.JdbcCapabilities
import slick.jdbc.MySQLProfile.api._
import models.TaskQueries
import scala.concurrent.ExecutionContext
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import scala.concurrent.Future

case class NewTask(task: String)
case class Login(username: String, password: String)

//TODO CHANGE GETS TO POSTS?
//TODO empty login fields

@Singleton
class SlickController @Inject() (
  protected val dbConfigProvider: DatabaseConfigProvider,
  mcc: MessagesControllerComponents)(implicit ec: ExecutionContext)
  extends MessagesAbstractController(mcc) with HasDatabaseConfigProvider[JdbcProfile] {

  val loginForm = Form(mapping(
    "username" -> nonEmptyText,
    "password" -> nonEmptyText)(Login.apply)(Login.unapply))
  
  val newTaskForm = Form(mapping(
    "task" -> nonEmptyText)(NewTask.apply)(NewTask.unapply))
      
  def login = Action { implicit request =>
    Ok(views.html.login(loginForm))
  }
  
  def allTasks = Action.async { implicit request =>
    request.body.asFormUrlEncoded match {
      case Some(formData) =>
        val username = formData("username").head.toString
        val password = formData("password").head.toString
        val tasksFuture = TaskQueries.allTasks(db)
        
        if(!username.isEmpty && !password.isEmpty){
          tasksFuture.map(tasks =>
            Ok(views.html.taskTable(username,password,tasks,newTaskForm)).withSession("uss" -> username, "pss" -> password)
          )
        }
        else{
          tasksFuture.map(tasks =>
            Redirect(routes.SlickController.login)
          )
        }
        
      case None =>
        val tasksFuture = TaskQueries.allTasks(db)
        tasksFuture.map(tasks =>
          Ok(views.html.taskTable(request.session.get("uss").get,request.session.get("pss").get,tasks,newTaskForm))
        )
    }
  }
  
  def addTask = Action.async { implicit request =>
    newTaskForm.bindFromRequest().fold(
      formWithErrors => {
        val tasksFuture = TaskQueries.allTasks(db)
        tasksFuture.map(tasks => BadRequest(views.html.taskTable(request.session.get("uss").get,request.session.get("pss").get,tasks,formWithErrors)))
      },
      newTask => {
        val addFuture = TaskQueries.addTask(newTask,request.session.get("uss").get,request.session.get("pss").get, db)
        addFuture.map { cnt =>
          if(cnt == 1) Redirect(routes.SlickController.allTasks).flashing("message" -> "New Task added.")
          else Redirect(routes.SlickController.allTasks).flashing("error" -> "Failed to add book.")
        }
      })
  }
  
  def removeTask = Action.async { implicit request =>
    newTaskForm.bindFromRequest().fold(
      formWithErrors => {
        val tasksFuture = TaskQueries.allTasks(db)
        tasksFuture.map(tasks => BadRequest(views.html.taskTable(request.session.get("uss").get,request.session.get("pss").get,tasks,formWithErrors)))
      },
      newTask => {
        val addFuture = TaskQueries.removeTask(newTask,request.session.get("uss").get,request.session.get("pss").get,db)
        addFuture.map { cnt =>
            if(cnt == 1) Redirect(routes.SlickController.allTasks).flashing("message" -> "Task removed.")
          else Redirect(routes.SlickController.allTasks).flashing("error" -> "Failed to remove book.")
        }
      })
  }
  
}