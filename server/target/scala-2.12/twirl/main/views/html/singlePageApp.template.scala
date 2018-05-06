
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

object singlePageApp extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* singlePageApp Template File */
  def apply/*2.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Single Page Application")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""
	"""),format.raw/*5.2*/("""<h1 id="header">First Page</h1>
	<p id="scalajsShoutOut"></p>
	<div id="mainContent">
	<p>
		This is intended to demonstrate a single page application. In this type of application, there is
		generally only one view. Additional contents are brought into the view by JavaScript code that
		makes requests for data and alters the DOM accordingly.
	</p>
	</div>
	<div id="controls">
		<input type="button" id="button0" value="Restore">
		<input type="button" id="button1" value="Button 1">
		<input type="button" id="button2" value="Button 2">
		<br>
		x = <input type="text" id="xValue" value="3">&nbsp;&nbsp;
		y = <input type="text" id="yValue" value="8">&nbsp;&nbsp;
		radius = <input type="text" id="radValue" value="5">&nbsp;&nbsp;
		<input type="button" id="sendCircle" value="Send">
		<br>
		<input type="button" id="showCanvas" value="Show Canvas">
	</div>
	<input type="text" id="input"></input>
    <div id="messages"></div>
	
	<input type="hidden" id="route1" value=""""),_display_(/*29.43*/routes/*29.49*/.SinglePageApp.button1Call),format.raw/*29.75*/("""">
	<input type="hidden" id="route2" value=""""),_display_(/*30.43*/routes/*30.49*/.SinglePageApp.button2Call),format.raw/*30.75*/("""">
	<input type="hidden" id="setCircleRoute" value=""""),_display_(/*31.51*/routes/*31.57*/.SinglePageApp.setCircle),format.raw/*31.81*/("""">
	<input type="hidden" id="canvasRoute" value=""""),_display_(/*32.48*/routes/*32.54*/.SinglePageApp.jscanvas),format.raw/*32.77*/("""">
	<input type="hidden" id="wsRoute" value=""""),_display_(/*33.44*/routes/*33.50*/.WSChatController.socket().webSocketURL()),format.raw/*33.91*/("""">
	"""),_display_(/*34.3*/scalajs/*34.10*/.html.scripts("CSCI3345-S18-client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*34.139*/("""
""")))}),format.raw/*35.2*/("""
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
                  DATE: Sat May 05 00:24:40 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/singlePageApp.scala.html
                  HASH: 014be93ecc8f093ab31a18e02c1d87c98987207a
                  MATRIX: 773->35|902->71|929->73|968->104|1007->106|1035->108|2039->1085|2054->1091|2101->1117|2173->1162|2188->1168|2235->1194|2315->1247|2330->1253|2375->1277|2452->1327|2467->1333|2511->1356|2584->1402|2599->1408|2661->1449|2692->1454|2708->1461|2859->1590|2891->1592
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|52->29|52->29|52->29|53->30|53->30|53->30|54->31|54->31|54->31|55->32|55->32|55->32|56->33|56->33|56->33|57->34|57->34|57->34|58->35
                  -- GENERATED --
              */
          