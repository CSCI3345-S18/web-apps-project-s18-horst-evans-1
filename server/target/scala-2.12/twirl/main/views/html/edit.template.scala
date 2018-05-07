
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template8[String,String,String,Double,Int,Form[NewFood],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* edit Template File */
  def apply/*2.2*/(name:String, desc:String, ft:String, price:Double, language:Int, menuForm: Form[NewFood])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
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

</body><br><br>

"""),_display_(/*20.2*/main("Menu")/*20.14*/ {_display_(Seq[Any](format.raw/*20.16*/("""
	"""),_display_(/*21.3*/helper/*21.9*/.form(action = helper.CSRF(routes.RestaurantController.editQuery(name)))/*21.81*/ {_display_(Seq[Any](format.raw/*21.83*/("""
	  """),format.raw/*22.4*/("""<p>Name: """),_display_(/*22.14*/name),format.raw/*22.18*/("""</p>
	  """),_display_(/*23.5*/helper/*23.11*/.inputText(menuForm("name"))),format.raw/*23.39*/("""
	  """),format.raw/*24.4*/("""<p>Description: """),_display_(/*24.21*/desc),format.raw/*24.25*/("""</p>
	  """),_display_(/*25.5*/helper/*25.11*/.inputText(menuForm("description"))),format.raw/*25.46*/("""
	  """),format.raw/*26.4*/("""<p>Type: """),_display_(/*26.14*/ft),format.raw/*26.16*/("""</p>
	  """),_display_(/*27.5*/helper/*27.11*/.inputText(menuForm("type"))),format.raw/*27.39*/("""
	  """),format.raw/*28.4*/("""<p>Price: """),_display_(/*28.15*/price),format.raw/*28.20*/("""</p>
	  """),_display_(/*29.5*/helper/*29.11*/.inputText(menuForm("price"))),format.raw/*29.40*/("""
	  """),format.raw/*30.4*/("""<p>Language: """),_display_(/*30.18*/language),format.raw/*30.26*/("""</p>
	  """),_display_(/*31.5*/helper/*31.11*/.inputText(menuForm("lan"))),format.raw/*31.38*/("""
	  """),format.raw/*32.4*/("""<input type="submit" value="Edit Item">
	""")))}),format.raw/*33.3*/("""
""")))}))
      }
    }
  }

  def render(name:String,desc:String,ft:String,price:Double,language:Int,menuForm:Form[NewFood],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(name,desc,ft,price,language,menuForm)(request,flash)

  def f:((String,String,String,Double,Int,Form[NewFood]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (name,desc,ft,price,language,menuForm) => (request,flash) => apply(name,desc,ft,price,language,menuForm)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 04:22:38 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/edit.scala.html
                  HASH: 20bba2286e65ea87ca9d992bc265cbd9c3c87d4f
                  MATRIX: 815->26|1054->172|1081->173|1160->226|1174->232|1238->276|1334->345|1354->356|1409->390|1519->473|1539->484|1593->517|1702->599|1722->610|1782->649|1892->732|1912->743|1970->780|2094->878|2115->890|2155->892|2184->895|2198->901|2279->973|2319->975|2350->979|2387->989|2412->993|2447->1002|2462->1008|2511->1036|2542->1040|2586->1057|2611->1061|2646->1070|2661->1076|2717->1111|2748->1115|2785->1125|2808->1127|2843->1136|2858->1142|2907->1170|2938->1174|2976->1185|3002->1190|3037->1199|3052->1205|3102->1234|3133->1238|3174->1252|3203->1260|3238->1269|3253->1275|3301->1302|3332->1306|3404->1348
                  LINES: 21->2|26->3|27->4|28->5|28->5|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|43->20|43->20|43->20|44->21|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|47->24|47->24|47->24|48->25|48->25|48->25|49->26|49->26|49->26|50->27|50->27|50->27|51->28|51->28|51->28|52->29|52->29|52->29|53->30|53->30|53->30|54->31|54->31|54->31|55->32|56->33
                  -- GENERATED --
              */
          