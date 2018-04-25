package models

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import controllers.NewTask

case class Task(task: String, username: String, password:String)
  
object TaskQueries {
  import TaskTables._
  def allTasks(db: Database)(implicit ec: ExecutionContext):Future[Seq[Task]] = {
    db.run(tasks.result)
  }
  
  def addTask(nt: NewTask, username:String, password:String, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run{
      tasks += Task(nt.task,username,password)
    }
  }
  
  def findByUsername(username:String, password:String, db: Database)(implicit ec: ExecutionContext): Future[Option[Task]] = {
    db.run{
      val users = tasks.filter(_.username === username)
      users.filter(_.password === password).result.headOption
    }
  }
  
  def removeTask(nt: NewTask, username:String, password:String, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    val ts = tasks.filter(_.task === nt.task)
    val del = ts.filter(_.username === username)
    val action = del.delete
    val sql = action.statements.head
    db.run(action)
  }
  
}