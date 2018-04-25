
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
	</div>
	<input type="hidden" id="route1" value=""""),_display_(/*24.43*/routes/*24.49*/.SinglePageApp.button1Call),format.raw/*24.75*/("""">
	<input type="hidden" id="route2" value=""""),_display_(/*25.43*/routes/*25.49*/.SinglePageApp.button2Call),format.raw/*25.75*/("""">
	<input type="hidden" id="setCircleRoute" value=""""),_display_(/*26.51*/routes/*26.57*/.SinglePageApp.setCircle),format.raw/*26.81*/("""">
	"""),_display_(/*27.3*/scalajs/*27.10*/.html.scripts("CSCI3345-S18-client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*27.139*/("""
""")))}),format.raw/*28.2*/("""
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
                  DATE: Fri Apr 13 20:28:12 CDT 2018
                  SOURCE: /users/hevans/workspace/CSCI3345-S18-master/server/app/views/singlePageApp.scala.html
                  HASH: a75f921d902aaf95170431bda2dbf7153e936024
                  MATRIX: 773->35|902->71|929->73|968->104|1007->106|1035->108|1900->946|1915->952|1962->978|2034->1023|2049->1029|2096->1055|2176->1108|2191->1114|2236->1138|2267->1143|2283->1150|2434->1279|2466->1281
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|47->24|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|50->27|50->27|50->27|51->28
                  -- GENERATED --
              */
          