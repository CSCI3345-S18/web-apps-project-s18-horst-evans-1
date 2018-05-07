
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

object menuSpanish extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Map[String, Seq[models.Food]],Form[NewFood],Int,String,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* menuSpanish Template File */
  def apply/*2.2*/(menuMap: Map[String,Seq[models.Food]], menuForm: Form[NewFood], lang:Int, isManager:String)(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
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

"""),_display_(/*20.2*/main("Menu")/*20.14*/ {_display_(Seq[Any](format.raw/*20.16*/("""
	"""),format.raw/*21.2*/("""<br><br><br><h2>Menu</h2><br><br>
	"""),_display_(/*22.3*/for((k,menu) <- menuMap) yield /*22.27*/{_display_(Seq[Any](format.raw/*22.28*/("""
		"""),_display_(/*23.4*/if(menu.head.language == 2)/*23.31*/ {_display_(Seq[Any](format.raw/*23.33*/("""
			"""),format.raw/*24.4*/("""<table class="table" border="1">
				<tr><th>Name</th><th>Description</th><th>Price</th>
				"""),_display_(/*26.6*/if(isManager=="1")/*26.24*/{_display_(Seq[Any](format.raw/*26.25*/("""
							"""),format.raw/*27.8*/("""<th>Remove Item</th>
					""")))}),format.raw/*28.7*/("""
					"""),format.raw/*29.6*/("""</tr>
				"""),_display_(/*30.6*/for(f <- menu) yield /*30.20*/ {_display_(Seq[Any](format.raw/*30.22*/("""
					"""),format.raw/*31.6*/("""<tr><td>"""),_display_(/*31.15*/f/*31.16*/.name),format.raw/*31.21*/("""</td><td>"""),_display_(/*31.31*/f/*31.32*/.description),format.raw/*31.44*/("""</td><td>"""),_display_(/*31.54*/f/*31.55*/.price),format.raw/*31.61*/("""</td>
						"""),_display_(/*32.8*/if(isManager=="1")/*32.26*/{_display_(Seq[Any](format.raw/*32.27*/("""
							"""),format.raw/*33.8*/("""<td>"""),_display_(/*33.13*/helper/*33.19*/.form(action = helper.CSRF(routes.RestaurantController.removeFood(f.name)))/*33.94*/ {_display_(Seq[Any](format.raw/*33.96*/("""
						  		"""),format.raw/*34.11*/("""<input type="submit" value="Remove Food" />""")))}),format.raw/*34.55*/("""
							"""),format.raw/*35.8*/("""</td>
							<td>"""),_display_(/*36.13*/helper/*36.19*/.form(action = helper.CSRF(routes.RestaurantController.editFood(f.name,f.description,f.foodType,f.price,f.language)))/*36.136*/ {_display_(Seq[Any](format.raw/*36.138*/("""
						  		"""),format.raw/*37.11*/("""<input type="submit" value="Edit Food" />""")))}),format.raw/*37.53*/("""
							"""),format.raw/*38.8*/("""</td>
						""")))}),format.raw/*39.8*/("""
						"""),format.raw/*40.7*/("""<td>"""),_display_(/*40.12*/helper/*40.18*/.form(action = helper.CSRF(routes.RestaurantController.addToCheckout(f.name,f.price,f.description)))/*40.118*/ {_display_(Seq[Any](format.raw/*40.120*/("""
						  		"""),format.raw/*41.11*/("""<input type="submit" value="Add To Checkout" />""")))}),format.raw/*41.59*/("""</td>
					</tr>
				""")))}),format.raw/*43.6*/("""
			"""),format.raw/*44.4*/("""</table>
			<br>
		""")))}),format.raw/*46.4*/("""
	""")))}),format.raw/*47.3*/("""
	"""),_display_(/*48.3*/helper/*48.9*/.form(action = helper.CSRF(routes.RestaurantController.changeLang))/*48.76*/ {_display_(Seq[Any](format.raw/*48.78*/("""
		"""),format.raw/*49.3*/("""<input type="submit" value="Change Language">
	""")))}),format.raw/*50.3*/("""
	"""),format.raw/*51.2*/("""<br>
	"""),_display_(/*52.3*/helper/*52.9*/.form(action = helper.CSRF(routes.RestaurantController.checkout))/*52.74*/ {_display_(Seq[Any](format.raw/*52.76*/("""
		"""),format.raw/*53.3*/("""<input type="submit" value="To Checkout">
	""")))}),format.raw/*54.3*/("""
	"""),format.raw/*55.2*/("""<br>
	"""),_display_(/*56.3*/if(isManager=="1")/*56.21*/{_display_(Seq[Any](format.raw/*56.22*/("""
		"""),_display_(/*57.4*/helper/*57.10*/.form(action = helper.CSRF(routes.RestaurantController.addFood))/*57.74*/ {_display_(Seq[Any](format.raw/*57.76*/("""
		  """),_display_(/*58.6*/helper/*58.12*/.inputText(menuForm("name"))),format.raw/*58.40*/("""
		  """),_display_(/*59.6*/helper/*59.12*/.inputText(menuForm("description"))),format.raw/*59.47*/("""
		  """),_display_(/*60.6*/helper/*60.12*/.inputText(menuForm("type"))),format.raw/*60.40*/("""
		  """),_display_(/*61.6*/helper/*61.12*/.inputText(menuForm("price"))),format.raw/*61.41*/("""
		  """),_display_(/*62.6*/helper/*62.12*/.inputText(menuForm("lan"))),format.raw/*62.39*/("""
		  """),format.raw/*63.5*/("""<input type="submit" value="Add Item">
		""")))}),format.raw/*64.4*/("""
	""")))}),format.raw/*65.3*/("""
""")))}))
      }
    }
  }

  def render(menuMap:Map[String, Seq[models.Food]],menuForm:Form[NewFood],lang:Int,isManager:String,request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(menuMap,menuForm,lang,isManager)(request,flash)

  def f:((Map[String, Seq[models.Food]],Form[NewFood],Int,String) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (menuMap,menuForm,lang,isManager) => (request,flash) => apply(menuMap,menuForm,lang,isManager)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 02:49:06 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/menuSpanish.scala.html
                  HASH: a430f77a0f5cb5dd4f6c89acf41c4f3ee58399f1
                  MATRIX: 838->33|1079->181|1106->182|1185->235|1199->241|1263->285|1359->354|1379->365|1434->399|1544->482|1564->493|1618->526|1727->608|1747->619|1807->658|1917->741|1937->752|1995->789|2111->879|2132->891|2172->893|2201->895|2263->931|2303->955|2342->956|2372->960|2408->987|2448->989|2479->993|2599->1087|2626->1105|2665->1106|2700->1114|2757->1141|2790->1147|2827->1158|2857->1172|2897->1174|2930->1180|2966->1189|2976->1190|3002->1195|3039->1205|3049->1206|3082->1218|3119->1228|3129->1229|3156->1235|3195->1248|3222->1266|3261->1267|3296->1275|3328->1280|3343->1286|3427->1361|3467->1363|3506->1374|3581->1418|3616->1426|3661->1444|3676->1450|3803->1567|3844->1569|3883->1580|3956->1622|3991->1630|4034->1643|4068->1650|4100->1655|4115->1661|4225->1761|4266->1763|4305->1774|4384->1822|4436->1844|4467->1848|4517->1868|4550->1871|4579->1874|4593->1880|4669->1947|4709->1949|4739->1952|4817->2000|4846->2002|4879->2009|4893->2015|4967->2080|5007->2082|5037->2085|5111->2129|5140->2131|5173->2138|5200->2156|5239->2157|5269->2161|5284->2167|5357->2231|5397->2233|5429->2239|5444->2245|5493->2273|5525->2279|5540->2285|5596->2320|5628->2326|5643->2332|5692->2360|5724->2366|5739->2372|5789->2401|5821->2407|5836->2413|5884->2440|5916->2445|5988->2487|6021->2490
                  LINES: 21->2|26->3|27->4|28->5|28->5|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|43->20|43->20|43->20|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|49->26|49->26|49->26|50->27|51->28|52->29|53->30|53->30|53->30|54->31|54->31|54->31|54->31|54->31|54->31|54->31|54->31|54->31|54->31|55->32|55->32|55->32|56->33|56->33|56->33|56->33|56->33|57->34|57->34|58->35|59->36|59->36|59->36|59->36|60->37|60->37|61->38|62->39|63->40|63->40|63->40|63->40|63->40|64->41|64->41|66->43|67->44|69->46|70->47|71->48|71->48|71->48|71->48|72->49|73->50|74->51|75->52|75->52|75->52|75->52|76->53|77->54|78->55|79->56|79->56|79->56|80->57|80->57|80->57|80->57|81->58|81->58|81->58|82->59|82->59|82->59|83->60|83->60|83->60|84->61|84->61|84->61|85->62|85->62|85->62|86->63|87->64|88->65
                  -- GENERATED --
              */
          