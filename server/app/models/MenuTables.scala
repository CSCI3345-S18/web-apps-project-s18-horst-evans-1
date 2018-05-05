package models

object MenuTables {
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
}
