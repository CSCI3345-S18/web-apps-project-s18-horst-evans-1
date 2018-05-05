
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Html,RequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(implicit request: RequestHeader, flash: Flash = Flash.emptyCookie):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*9.2*/import views.html.helper.CSRF


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*10.1*/("""
"""),format.raw/*11.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*14.62*/("""
        """),format.raw/*15.9*/("""<title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*19.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("javascripts/jQueryAjax.js")),format.raw/*20.75*/("""" type="text/javascript"></script>
    </head>
    <body data-token='"""),_display_(/*22.24*/CSRF/*22.28*/.getToken.value),format.raw/*22.43*/("""'>
        """),format.raw/*24.32*/("""
		"""),_display_(/*25.4*/if(flash.get("message").nonEmpty)/*25.37*/ {_display_(Seq[Any](format.raw/*25.39*/("""
    		"""),format.raw/*26.7*/("""<p class="message">"""),_display_(/*26.27*/flash/*26.32*/.get("message")),format.raw/*26.47*/("""</p>
    	""")))}),format.raw/*27.7*/("""
		"""),_display_(/*28.4*/if(flash.get("error").nonEmpty)/*28.35*/ {_display_(Seq[Any](format.raw/*28.37*/("""
    		"""),format.raw/*29.7*/("""<p class="error">"""),_display_(/*29.25*/flash/*29.30*/.get("error")),format.raw/*29.43*/("""</p>
    	""")))}),format.raw/*30.7*/("""
        """),_display_(/*31.10*/content),format.raw/*31.17*/("""
    	"""),format.raw/*32.6*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,request:RequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(request,flash)

  def f:((String) => (Html) => (RequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (request,flash) => apply(title)(content)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 00:24:40 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/main.scala.html
                  HASH: 4b07df23d82916dfa2362891ae2cf73b9c46a72a
                  MATRIX: 1007->260|1177->360|1235->358|1263->390|1291->391|1371->496|1407->505|1442->513|1468->518|1557->580|1572->586|1635->627|1723->688|1738->694|1799->733|1948->855|1963->861|2025->902|2109->959|2124->965|2191->1011|2288->1081|2301->1085|2337->1100|2376->1201|2406->1205|2448->1238|2488->1240|2522->1247|2569->1267|2583->1272|2619->1287|2660->1298|2690->1302|2730->1333|2770->1335|2804->1342|2849->1360|2863->1365|2897->1378|2938->1389|2975->1399|3003->1406|3036->1412
                  LINES: 26->7|29->9|32->8|33->10|34->11|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|42->19|42->19|42->19|43->20|43->20|43->20|45->22|45->22|45->22|46->24|47->25|47->25|47->25|48->26|48->26|48->26|48->26|49->27|50->28|50->28|50->28|51->29|51->29|51->29|51->29|52->30|53->31|53->31|54->32
                  -- GENERATED --
              */
          