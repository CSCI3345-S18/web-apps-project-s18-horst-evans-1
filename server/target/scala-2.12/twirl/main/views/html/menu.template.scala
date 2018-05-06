
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

object menu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[Seq[Food],Form[NewFood],Int,MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* menu Template File */
  def apply/*2.2*/(menu: Seq[Food], menuForm: Form[NewFood], lang:Int)(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Menu")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
	"""),format.raw/*5.2*/("""<h2>Menu</h2>
	<p>This page is a menu populated using Slick to populate a database.</p>
	<table border="1">
		<tr><th>Name</th><th>Description</th><th>FoodType</th><th>Price</th></tr>
		"""),_display_(/*9.4*/for(f <- menu) yield /*9.18*/ {_display_(Seq[Any](format.raw/*9.20*/("""
			"""),_display_(/*10.5*/if(f.language == lang)/*10.27*/ {_display_(Seq[Any](format.raw/*10.29*/("""
				"""),format.raw/*11.5*/("""<tr><td>"""),_display_(/*11.14*/f/*11.15*/.name),format.raw/*11.20*/("""</td><td>"""),_display_(/*11.30*/f/*11.31*/.description),format.raw/*11.43*/("""</td><td>"""),_display_(/*11.53*/f/*11.54*/.foodType),format.raw/*11.63*/("""</td><td>"""),_display_(/*11.73*/f/*11.74*/.price),format.raw/*11.80*/("""</td></tr>
			""")))}),format.raw/*12.5*/("""
		""")))}),format.raw/*13.4*/("""
	"""),format.raw/*14.2*/("""</table>
""")))}),format.raw/*15.2*/("""
"""))
      }
    }
  }

  def render(menu:Seq[Food],menuForm:Form[NewFood],lang:Int,request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(menu,menuForm,lang)(request,flash)

  def f:((Seq[Food],Form[NewFood],Int) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (menu,menuForm,lang) => (request,flash) => apply(menu,menuForm,lang)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 15:49:03 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/menu.scala.html
                  HASH: 4a7752930ffdff5145ff99b5f398f79ee8e29bca
                  MATRIX: 797->26|998->134|1025->136|1045->148|1084->150|1112->152|1324->339|1353->353|1392->355|1423->360|1454->382|1494->384|1526->389|1562->398|1572->399|1598->404|1635->414|1645->415|1678->427|1715->437|1725->438|1755->447|1792->457|1802->458|1829->464|1874->479|1908->483|1937->485|1977->495
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|34->11|35->12|36->13|37->14|38->15
                  -- GENERATED --
              */
          