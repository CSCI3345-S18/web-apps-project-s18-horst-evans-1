package models

import slick.jdbc.MySQLProfile.api._
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import controllers.NewFood
import controllers.NewCustomer
import controllers.NewOrder

case class Food(name:String,description:String,price:Double,foodType:String,language:Int)
case class Customer(isManager:Int,name:String,phone:String,points:Int,email:String,address:String,state:String,zip:String,username:String,password:String)
case class Order(username:String,password:String,food:String,price:Double,description:String)

object RestaurantQueries {
  import RestaurantTables._
  def allFood(db: Database)(implicit ec: ExecutionContext):Future[Seq[Food]] = {
    db.run(menu.result)
  }
  
  def addFood(nf: NewFood, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run {
      menu += Food(nf.name, nf.description, nf.price.doubleValue(), nf.foodType, nf.language)
    }
  }
  
  def editFood(nf: NewFood, name:String, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run {
      val order = menu.filter(_.name === name)
      order.update(Food(nf.name, nf.description, nf.price.doubleValue(), nf.foodType, nf.language))
    }
  }
  
  def removeFood(nm:String, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    val items = menu.filter(_.name === nm)
    val action = items.delete
    val sql = action.statements.head
    db.run(action)
  }
  
  def findUser(db: Database, username:String, password:String): Future[Option[Customer]] = {
    db.run {
      val users = customers.filter(_.username === username)
      users.filter(_.password === password).result.headOption
    }
  }
  
  def allUsers(db: Database) (implicit ec: ExecutionContext):Future[Seq[Customer]] = {
    db.run(customers.result)
  }
  
  def newCustomer(nu: NewCustomer, db:Database)(implicit ec: ExecutionContext):Future[Int] = {
    db.run {
      customers += Customer(0,nu.name,nu.phone,0,nu.email,nu.address,nu.state,nu.zip,nu.username,nu.password)
    }
  }
  
  def addOrder(name:String,price:Double,desc:String,uss:String,pss:String,db:Database)(implicit ec: ExecutionContext): Future[Int] = {
    db.run {
      orders += Order(uss,pss,name,price,desc)
    }
  }
  
  def allOrders(uss:String,pss:String,db: Database): Future[Seq[Order]] = {
    db.run{
      val userOrder = orders.filter(_.username === uss).filter(_.password === pss)
      userOrder.result
    }
  }
  
  def clearOrders(uss:String, pss:String, db: Database)(implicit ec: ExecutionContext): Future[Int] = {
    val items = orders.filter(_.username === uss).filter(_.password === pss)
    val action = items.delete
    val sql = action.statements.head
    db.run(action)
  }
  
}