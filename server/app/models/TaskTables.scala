package models

object TaskTables extends {
  val profile = slick.jdbc.MySQLProfile
  import profile.api._
  
  class Tasks(tag: Tag) extends Table[Task](tag, "todos"){
    def task = column[String]("todo")
    def username = column[String]("username")
    def password = column[String]("password")
    def * = (task,username,password) <> (Task.tupled, Task.unapply)
  }
  val tasks = TableQuery[Tasks]
}