package controllers

import javax.inject._
import java.util.concurrent.atomic.AtomicInteger
import play.api.mvc._
import play.api.libs.json.Writes
import play.api.libs.json.Json
import play.api.libs.json.Reads
import play.api.libs.json.JsPath
import play.api.libs.json.Reads._
import play.api.libs.functional.syntax._
import java.util.concurrent.atomic.AtomicReference

@Singleton
class PongController @Inject() (cc: ControllerComponents) extends AbstractController(cc) {
  
  //TODO color might throw error, but javascript so not visible
  
  private val width = new AtomicInteger(800)
  private val height = new AtomicInteger(400)
  private val p1 = new AtomicReference(Paddle(30,30,"red",20,80))
  private val p2 = new AtomicReference(Paddle(width.addAndGet(-50),30,"blue",20,80))
  private val ball = new AtomicReference(Ball(width.getAndSet(width.get/2),height.getAndSet(height.get/2),"green",10))
  
  case class Paddle(x:Int, y:Int, c:String, w:Int, h:Int)
  case class Ball(x:Int, y:Int, c:String, r:Int)
  //ballwrite
  implicit val ballWrites = new Writes[Ball] {
    def writes(ball: Ball) = Json.obj(
        "x" -> ball.x,
        "y" -> ball.y,
        "color" -> ball.c,
        "radius" -> ball.r)
  }
  //ballread
  implicit val ballReads : Reads[Ball] = (
    (JsPath \ "x").read[Int] and
    (JsPath \ "y").read[Int] and
    (JsPath \ "color").read[String] and
    (JsPath \ "radius").read[Int]
  )(Ball.apply _)
  
  //paddlewrite
  implicit val paddleWrites = new Writes[Paddle] {
    def writes(paddle: Paddle) = Json.obj(
        "x" -> paddle.x,
        "y" -> paddle.y,
        "color" -> paddle.c,
        "width" -> paddle.w,
        "height" -> paddle.h)
  }
  //paddleread
  implicit val paddleReads : Reads[Paddle] = (
    (JsPath \ "x").read[Int] and
    (JsPath \ "y").read[Int] and
    (JsPath \ "color").read[String] and
    (JsPath \ "width").read[Int] and
    (JsPath \ "height").read[Int]
  )(Paddle.apply _)
  
  def start = Action { implicit request =>
    Ok(views.html.pong())
  }
  
}