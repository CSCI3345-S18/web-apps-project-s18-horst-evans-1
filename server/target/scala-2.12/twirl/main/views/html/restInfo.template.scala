
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

object restInfo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /* restInfo Template File */
  def apply/*2.2*/(span: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""  """),format.raw/*3.3*/("""<head>
    <title>Diligencias</title>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/project.css")),format.raw/*5.97*/("""">
  </head>
    <br><br><br><h1>Diligencias</h1><br>
  <body>
  
<div class = "menuBar">
	<ul>
		<li><form action=""""),_display_(/*12.22*/controllers/*12.33*/.routes.RestaurantController.login),format.raw/*12.67*/(""""><input type="submit" value="Login" id="submit"></form></li>
		<li><form action=""""),_display_(/*13.22*/controllers/*13.33*/.routes.RestaurantController.menu),format.raw/*13.66*/(""""><input type="submit" value="Menu" id="submit"></form></li>
		<li><form action=""""),_display_(/*14.22*/controllers/*14.33*/.routes.RestaurantController.showAboutE),format.raw/*14.72*/(""""><input type="submit" value="About" id="submit"></form></li>
		<li><form action=""""),_display_(/*15.22*/controllers/*15.33*/.routes.RestaurantController.showHome),format.raw/*15.70*/(""""><input type="submit" value="Home" id="submit"></form></li>
		
	</ul>
	</div>
	</body>
	
	  	"""),_display_(/*21.6*/if(span == 1)/*21.19*/{_display_(Seq[Any](format.raw/*21.20*/("""
	  	"""),format.raw/*22.5*/("""<div class="container">
	    <form action=""""),_display_(/*23.21*/controllers/*23.32*/.routes.RestaurantController.showAboutE),format.raw/*23.71*/("""">
	  <input type="submit" value="English" id = "submit"/>
	</form> <br>
	 Horas: Martes-Domingo 12p.m-11p.m<br>
	Telephono: +52 867 714 2230 <br>
	Dirección: Campeche 2104, Nuevo Laredo, Mexico <br>
	Sobre Nostros:  <br>
	#6 de 40 Restaurantes en Nuevo Laredo <br>
	Emos sirvido la mejores carnes asadas en Nuevo Laredo  <br>
	por mas de cuarenta años. Nosotros ponemos toda nuestra passion en todos los platillos <br>
	que salen de nuestra consina <br>
	 <br>
	 </div>
	  """)))}/*36.5*/else/*36.9*/{_display_(Seq[Any](format.raw/*36.10*/("""
	  """),format.raw/*37.4*/("""<div class="container">
	   <form action=""""),_display_(/*38.20*/controllers/*38.31*/.routes.RestaurantController.spanish),format.raw/*38.67*/("""">
	  <input type="submit" value="Spanish" id = "submit"/>
	</form><br>
	 Hours: Tuesday-Sunday 12p.m - 11p.m<br>
	Phone: +52 867 714 2230 <br>
	Address: Campeche 2104, Nuevo Laredo, Mexico <br>
	About us:  <br>
	#6 of 40 Restaurants in Nuevo Laredo <br>
	We have been serving the best parriladas in Nuevo Laredo  <br>
	for more than 40 plus years. We put passion in every dish  <br>
	that comes out our kitchen.   <br>
	 <br>
	 </div>
	 """)))}),format.raw/*51.4*/("""
	 """),format.raw/*52.3*/("""<div class = "image">
 <img src=""""),_display_(/*53.13*/routes/*53.19*/.Assets.versioned("images/diligencias.jpg")),format.raw/*53.62*/("""" width="625" height="500" />
 <img src=""""),_display_(/*54.13*/routes/*54.19*/.Assets.versioned("images/map.png")),format.raw/*54.54*/("""" width="625" height="500"  />
 </div>
 
"""))
      }
    }
  }

  def render(span:Int): play.twirl.api.HtmlFormat.Appendable = apply(span)

  def f:((Int) => play.twirl.api.HtmlFormat.Appendable) = (span) => apply(span)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 03:02:03 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/restInfo.scala.html
                  HASH: 89c24e6600ed6c22d44f718d9195ef06e77878a0
                  MATRIX: 753->30|858->42|886->44|996->128|1010->134|1074->178|1218->295|1238->306|1293->340|1403->423|1423->434|1477->467|1586->549|1606->560|1666->599|1776->682|1796->693|1854->730|1975->825|1997->838|2036->839|2068->844|2139->888|2159->899|2219->938|2712->1413|2724->1417|2763->1418|2794->1422|2864->1465|2884->1476|2941->1512|3410->1951|3440->1954|3501->1988|3516->1994|3580->2037|3649->2079|3664->2085|3720->2120
                  LINES: 21->2|26->3|26->3|28->5|28->5|28->5|35->12|35->12|35->12|36->13|36->13|36->13|37->14|37->14|37->14|38->15|38->15|38->15|44->21|44->21|44->21|45->22|46->23|46->23|46->23|59->36|59->36|59->36|60->37|61->38|61->38|61->38|74->51|75->52|76->53|76->53|76->53|77->54|77->54|77->54
                  -- GENERATED --
              */
          