package pong

import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExportTopLevel
import org.querki.jquery._
import scala.scalajs.js.JSON
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@JSGlobal
@js.native
class Ball(
    var x:Int,
    var y:Int,
    var c:String,
    var r:Int
) extends js.Object

object PongMain {
  
  def main(args: Array[String]): Unit = {
    
  }
  
}