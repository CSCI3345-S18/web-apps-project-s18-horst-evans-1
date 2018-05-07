
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

object checkout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Seq[models.Order],Double,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* checkout Template File */
  def apply/*2.2*/(orders:Seq[models.Order],total:Double)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<head>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/project.css")),format.raw/*5.97*/("""">
</head>
<body>
<div class = "menuBar">
	<ul>
		<li><form action=""""),_display_(/*10.22*/controllers/*10.33*/.routes.RestaurantController.login),format.raw/*10.67*/(""""><input type="submit" value="Login" id="submit"></form></li>
		<li><form action=""""),_display_(/*11.22*/controllers/*11.33*/.routes.RestaurantController.menu),format.raw/*11.66*/(""""><input type="submit" value="Menu" id="submit"></form></li>
		<li><form action=""""),_display_(/*12.22*/controllers/*12.33*/.routes.RestaurantController.showAboutE),format.raw/*12.72*/(""""><input type="submit" value="About" id="submit"></form></li>
		<li><form action=""""),_display_(/*13.22*/controllers/*13.33*/.routes.RestaurantController.showHome),format.raw/*13.70*/(""""><input type="submit" value="Home" id="submit"></form></li>
		
	</ul>
	</div>

</body>
<br><br><br>
"""),_display_(/*20.2*/main("Checkout")/*20.18*/ {_display_(Seq[Any](format.raw/*20.20*/("""
	"""),format.raw/*21.2*/("""<table border="1">
		<tr><th>Item</th><th>Description</th><th>Price</th></tr>
		"""),_display_(/*23.4*/for(o <- orders) yield /*23.20*/ {_display_(Seq[Any](format.raw/*23.22*/("""
			"""),format.raw/*24.4*/("""<tr><td>"""),_display_(/*24.13*/o/*24.14*/.food),format.raw/*24.19*/("""</td><td>"""),_display_(/*24.29*/o/*24.30*/.description),format.raw/*24.42*/("""</td><td>"""),_display_(/*24.52*/o/*24.53*/.price),format.raw/*24.59*/("""</td></tr>
		""")))}),format.raw/*25.4*/("""
	"""),format.raw/*26.2*/("""</table>
	<p>Total: """),_display_(/*27.13*/total),format.raw/*27.18*/("""</p>
	<br>
	"""),_display_(/*29.3*/helper/*29.9*/.form(action = helper.CSRF(routes.RestaurantController.clear))/*29.71*/ {_display_(Seq[Any](format.raw/*29.73*/("""
		"""),format.raw/*30.3*/("""<input type="submit" value="Checkout">
	""")))}),format.raw/*31.3*/("""
""")))}))
      }
    }
  }

  def render(orders:Seq[models.Order],total:Double,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(orders,total)(request)

  def f:((Seq[models.Order],Double) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (orders,total) => (request) => apply(orders,total)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 01:53:09 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/checkout.scala.html
                  HASH: c2370ba2548ab2222af4eb7a088d4ac761370d80
                  MATRIX: 796->30|970->111|997->112|1076->165|1090->171|1154->215|1250->284|1270->295|1325->329|1435->412|1455->423|1509->456|1618->538|1638->549|1698->588|1808->671|1828->682|1886->719|2014->821|2039->837|2079->839|2108->841|2215->922|2247->938|2287->940|2318->944|2354->953|2364->954|2390->959|2427->969|2437->970|2470->982|2507->992|2517->993|2544->999|2588->1013|2617->1015|2665->1036|2691->1041|2730->1054|2744->1060|2815->1122|2855->1124|2885->1127|2956->1168
                  LINES: 21->2|26->3|27->4|28->5|28->5|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|43->20|43->20|43->20|44->21|46->23|46->23|46->23|47->24|47->24|47->24|47->24|47->24|47->24|47->24|47->24|47->24|47->24|48->25|49->26|50->27|50->27|52->29|52->29|52->29|52->29|53->30|54->31
                  -- GENERATED --
              */
          