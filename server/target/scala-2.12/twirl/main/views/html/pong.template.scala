
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object pong extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* pong Template File */
  def apply/*2.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Pong!")/*4.15*/{_display_(Seq[Any](format.raw/*4.16*/("""
	"""),format.raw/*5.2*/("""<br>
	<h2>Pong!</h2>
	<canvas id="myCanvas" width=800 height=400 style="border:1px solid #000000;"></canvas>
	<div>
		<br>
		<button>Restart Game!</button>
	</div>
	<br><br><br><br>
	<p> Player 1 controls: ws </p>
    <p> Player 2 controls: ki </p>
    <input type="hidden" id="route1" value=""""),_display_(/*15.46*/routes/*15.52*/.PongController.start),format.raw/*15.73*/("""">
    """),_display_(/*16.6*/scalajs/*16.13*/.html.scripts("CSCI345-S18-client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*16.141*/("""
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 24 21:46:41 CDT 2018
                  SOURCE: /users/hevans/workspace/CSCI3345-S18-master/server/app/views/pong.scala.html
                  HASH: 549bb5e416384ebed4d2fd2ab689fb484039baf4
                  MATRIX: 755->26|884->62|911->64|932->77|970->78|998->80|1319->374|1334->380|1376->401|1410->409|1426->416|1576->544|1608->546
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|38->15|38->15|38->15|39->16|39->16|39->16|40->17
                  -- GENERATED --
              */
          