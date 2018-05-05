package models

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import controllers.NewFood

case class Food(name:String,description:String,price:Double,foodType:String,language:Int)

object MenuQueries {
  import MenuTables._
  def allFood(db: Database)(implicit ec: ExecutionContext):Future[Seq[Food]] = {
    db.run(menu.result)
  }
  
  def addFood(nf: NewFood, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run {
      menu += Food(nf.name, nf.description, nf.price.doubleValue(), nf.foodType, nf.language)
    }
  }
}