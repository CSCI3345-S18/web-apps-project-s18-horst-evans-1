package models

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import controllers.NewFood
import controllers.NewCustomer
import controllers.NewOrder

case class Food(name:String,description:String,price:Double,foodType:String,language:Int)
case class Customer(isManager:String,name:String,phone:String,points:Int,email:String,address:String,state:String,zip:String,username:String,password:String)
case class Order(name:String,foodID:Int,price:Double,description:String)

object MenuQueries {
  import RestaurantTables._
  def allFood(db: Database)(implicit ec: ExecutionContext):Future[Seq[Food]] = {
    db.run(menu.result)
  }
  
  def addFood(nf: NewFood, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run {
      menu += Food(nf.name, nf.description, nf.price.doubleValue(), nf.foodType, nf.language)
    }
  }
}