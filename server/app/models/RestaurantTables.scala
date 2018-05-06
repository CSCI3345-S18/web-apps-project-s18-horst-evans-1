package models

object RestaurantTables {
  val profile = slick.jdbc.MySQLProfile
  import profile.api._
  
  class Menu(tag: Tag) extends Table[Food](tag, "food") {
    def name = column[String]("name")
    def description = column[String]("description")
    def price = column[Double]("price")
    def foodType = column[String]("type")
    def language = column[Int]("lan")
    def * = (name,description,price,foodType,language) <> (Food.tupled, Food.unapply)
  }
  val menu = TableQuery[Menu]
  
  class Customers(tag: Tag) extends Table[Customer](tag, "customers") {
    def isManager = column[Int]("isManager")
    def name = column[String]("name")
    def phone = column[String]("phone")
    def points = column[Int]("rewardPoints")
    def email = column[String]("email")
    def address = column[String]("address")
    def state = column[String]("state")
    def zip = column[String]("zip")
    def username = column[String]("username")
    def password = column[String]("password")
    def * = (isManager,name,phone,points,email,address,state,zip,username,password) <> (Customer.tupled, Customer.unapply)
  }
  val customers = TableQuery[Customers]
  
  class Orders(tag: Tag) extends Table[Order](tag, "orders") {
    def name = column[String]("name")
    def foodID = column[Int]("foodID")
    def price = column[Double]("price")
    def description = column[String]("description")
    def * = (name,foodID,price,description) <> (Order.tupled, Order.unapply)
  }
  val orders = TableQuery[Orders]
  
}
