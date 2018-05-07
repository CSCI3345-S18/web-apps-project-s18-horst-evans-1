
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

object menu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[Map[String, Seq[models.Food]],Form[NewFood],Int,String,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* menu Template File */
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

	"""),_display_(/*23.3*/for((k,menu) <- menuMap) yield /*23.27*/{_display_(Seq[Any](format.raw/*23.28*/("""
		"""),_display_(/*24.4*/if(menu.head.language == 1)/*24.31*/ {_display_(Seq[Any](format.raw/*24.33*/("""
			"""),format.raw/*25.4*/("""<table class="table" border="1">
				<tr><th>Name</th><th>Description</th><th>Price</th>
				"""),_display_(/*27.6*/if(isManager=="1")/*27.24*/{_display_(Seq[Any](format.raw/*27.25*/("""
							"""),format.raw/*28.8*/("""<th>Remove Item</th>
					""")))}),format.raw/*29.7*/("""
					"""),format.raw/*30.6*/("""</tr>
				"""),_display_(/*31.6*/for(f <- menu) yield /*31.20*/ {_display_(Seq[Any](format.raw/*31.22*/("""
					"""),format.raw/*32.6*/("""<tr><td>"""),_display_(/*32.15*/f/*32.16*/.name),format.raw/*32.21*/("""</td><td>"""),_display_(/*32.31*/f/*32.32*/.description),format.raw/*32.44*/("""</td><td>"""),_display_(/*32.54*/f/*32.55*/.price),format.raw/*32.61*/("""</td>
						"""),_display_(/*33.8*/if(isManager=="1")/*33.26*/{_display_(Seq[Any](format.raw/*33.27*/("""
							"""),format.raw/*34.8*/("""<td>"""),_display_(/*34.13*/helper/*34.19*/.form(action = helper.CSRF(routes.RestaurantController.removeFood(f.name)))/*34.94*/ {_display_(Seq[Any](format.raw/*34.96*/("""
						  		"""),format.raw/*35.11*/("""<input type="remove" value="Remove Food" />""")))}),format.raw/*35.55*/("""
							"""),format.raw/*36.8*/("""</td>
							<td>"""),_display_(/*37.13*/helper/*37.19*/.form(action = helper.CSRF(routes.RestaurantController.editFood(f.name,f.description,f.foodType,f.price,f.language)))/*37.136*/ {_display_(Seq[Any](format.raw/*37.138*/("""
						  		"""),format.raw/*38.11*/("""<input type="submit" value="Edit Food" />""")))}),format.raw/*38.53*/("""
							"""),format.raw/*39.8*/("""</td>
						""")))}),format.raw/*40.8*/("""
						"""),format.raw/*41.7*/("""<td>"""),_display_(/*41.12*/helper/*41.18*/.form(action = helper.CSRF(routes.RestaurantController.addToCheckout(f.name,f.price,f.description)))/*41.118*/ {_display_(Seq[Any](format.raw/*41.120*/("""
						  		"""),format.raw/*42.11*/("""<input type="submit" value="Add To Checkout" />""")))}),format.raw/*42.59*/("""</td>
					</tr>
				""")))}),format.raw/*44.6*/("""
			"""),format.raw/*45.4*/("""</table>
			<br>
		""")))}),format.raw/*47.4*/("""
	""")))}),format.raw/*48.3*/("""
	"""),_display_(/*49.3*/helper/*49.9*/.form(action = helper.CSRF(routes.RestaurantController.changeLang))/*49.76*/ {_display_(Seq[Any](format.raw/*49.78*/("""
		"""),format.raw/*50.3*/("""<input type="submit" value="Change Language">
	""")))}),format.raw/*51.3*/("""
	"""),format.raw/*52.2*/("""<br>
	"""),_display_(/*53.3*/helper/*53.9*/.form(action = helper.CSRF(routes.RestaurantController.checkout))/*53.74*/ {_display_(Seq[Any](format.raw/*53.76*/("""
		"""),format.raw/*54.3*/("""<input type="submit" value="To Checkout">
	""")))}),format.raw/*55.3*/("""
	"""),format.raw/*56.2*/("""<br>
	"""),_display_(/*57.3*/if(isManager=="1")/*57.21*/{_display_(Seq[Any](format.raw/*57.22*/("""
		"""),_display_(/*58.4*/helper/*58.10*/.form(action = helper.CSRF(routes.RestaurantController.addFood))/*58.74*/ {_display_(Seq[Any](format.raw/*58.76*/("""
		  """),_display_(/*59.6*/helper/*59.12*/.inputText(menuForm("name"))),format.raw/*59.40*/("""
		  """),_display_(/*60.6*/helper/*60.12*/.inputText(menuForm("description"))),format.raw/*60.47*/("""
		  """),_display_(/*61.6*/helper/*61.12*/.inputText(menuForm("type"))),format.raw/*61.40*/("""
		  """),_display_(/*62.6*/helper/*62.12*/.inputText(menuForm("price"))),format.raw/*62.41*/("""
		  """),_display_(/*63.6*/helper/*63.12*/.inputText(menuForm("lan"))),format.raw/*63.39*/("""
		  """),format.raw/*64.5*/("""<input type="submit" value="Add Item">
		""")))}),format.raw/*65.4*/("""
	""")))}),format.raw/*66.3*/("""
""")))}),format.raw/*67.2*/("""
"""))
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
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/menu.scala.html
                  HASH: 044bed8aa900f377805400c6bdaa907feccb64d3
                  MATRIX: 824->26|1065->174|1092->175|1171->228|1185->234|1249->278|1345->347|1365->358|1420->392|1530->475|1550->486|1604->519|1713->601|1733->612|1793->651|1903->734|1923->745|1981->782|2097->872|2118->884|2158->886|2187->888|2250->925|2290->949|2329->950|2359->954|2395->981|2435->983|2466->987|2586->1081|2613->1099|2652->1100|2687->1108|2744->1135|2777->1141|2814->1152|2844->1166|2884->1168|2917->1174|2953->1183|2963->1184|2989->1189|3026->1199|3036->1200|3069->1212|3106->1222|3116->1223|3143->1229|3182->1242|3209->1260|3248->1261|3283->1269|3315->1274|3330->1280|3414->1355|3454->1357|3493->1368|3568->1412|3603->1420|3648->1438|3663->1444|3790->1561|3831->1563|3870->1574|3943->1616|3978->1624|4021->1637|4055->1644|4087->1649|4102->1655|4212->1755|4253->1757|4292->1768|4371->1816|4423->1838|4454->1842|4504->1862|4537->1865|4566->1868|4580->1874|4656->1941|4696->1943|4726->1946|4804->1994|4833->1996|4866->2003|4880->2009|4954->2074|4994->2076|5024->2079|5098->2123|5127->2125|5160->2132|5187->2150|5226->2151|5256->2155|5271->2161|5344->2225|5384->2227|5416->2233|5431->2239|5480->2267|5512->2273|5527->2279|5583->2314|5615->2320|5630->2326|5679->2354|5711->2360|5726->2366|5776->2395|5808->2401|5823->2407|5871->2434|5903->2439|5975->2481|6008->2484|6040->2486
                  LINES: 21->2|26->3|27->4|28->5|28->5|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|43->20|43->20|43->20|44->21|46->23|46->23|46->23|47->24|47->24|47->24|48->25|50->27|50->27|50->27|51->28|52->29|53->30|54->31|54->31|54->31|55->32|55->32|55->32|55->32|55->32|55->32|55->32|55->32|55->32|55->32|56->33|56->33|56->33|57->34|57->34|57->34|57->34|57->34|58->35|58->35|59->36|60->37|60->37|60->37|60->37|61->38|61->38|62->39|63->40|64->41|64->41|64->41|64->41|64->41|65->42|65->42|67->44|68->45|70->47|71->48|72->49|72->49|72->49|72->49|73->50|74->51|75->52|76->53|76->53|76->53|76->53|77->54|78->55|79->56|80->57|80->57|80->57|81->58|81->58|81->58|81->58|82->59|82->59|82->59|83->60|83->60|83->60|84->61|84->61|84->61|85->62|85->62|85->62|86->63|86->63|86->63|87->64|88->65|89->66|90->67
                  -- GENERATED --
              */
          