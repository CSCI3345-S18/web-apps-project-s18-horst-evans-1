
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* home Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<head>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*4.47*/routes/*4.53*/.Assets.versioned("stylesheets/project.css")),format.raw/*4.97*/("""">
</head>
<body>
<div class = "menuBar">
	<ul>
		<li><form action=""""),_display_(/*9.22*/controllers/*9.33*/.routes.RestaurantController.login),format.raw/*9.67*/(""""><input type="submit" value="Login" id="submit"></form></li>
		<li><form action=""""),_display_(/*10.22*/controllers/*10.33*/.routes.RestaurantController.menu),format.raw/*10.66*/(""""><input type="submit" value="Menu" id="submit"></form></li>
		<li><form action=""""),_display_(/*11.22*/controllers/*11.33*/.routes.RestaurantController.showAboutE),format.raw/*11.72*/(""""><input type="submit" value="About" id="submit"></form></li>
		<li><form action=""""),_display_(/*12.22*/controllers/*12.33*/.routes.RestaurantController.showHome),format.raw/*12.70*/(""""><input type="submit" value="Home" id="submit"></form></li>
		
	</ul>
	</div>

</body>
<br>
 <img class="banner" src=""""),_display_(/*19.28*/routes/*19.34*/.Assets.versioned("images/banner3.jpg")),format.raw/*19.73*/(""""/>
 
 <p class="title">Diligencias</p><br>
 <hr class="line">
 
 <div class="container">
 <h1><u>About Us</u></h1>
 <p>Check out how to find us!
 <ul>
 <form action=""""),_display_(/*28.17*/controllers/*28.28*/.routes.RestaurantController.showAboutE),format.raw/*28.67*/(""""><input type="submit" value="About" id="submit"></form>
 </ul>
 </p>
 </div>


 <div class="container2">
 <h1><u>Menu</u></h1>
 <p>Check out our different menus!
 <ul>
 <form action=""""),_display_(/*38.17*/controllers/*38.28*/.routes.RestaurantController.menu),format.raw/*38.61*/(""""><input type="submit" value="Menu" id="submit"></form>
 </ul>
 </p>
 </div>
 
  <div class="container">
 <h1><u>Login</u></h1>
 <p>Login so we can monitor you and everything you do
 <ul>
 <form action=""""),_display_(/*47.17*/controllers/*47.28*/.routes.RestaurantController.login),format.raw/*47.62*/(""""><input type="submit" value="Login" id="submit"></form>
 </ul>
 </p>
 </div>"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 04:16:30 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/home.scala.html
                  HASH: 864cb384b705336f2ac8e448fbd46f16d1e62e87
                  MATRIX: 745->26|851->39|930->92|944->98|1008->142|1103->211|1122->222|1176->256|1286->339|1306->350|1360->383|1469->465|1489->476|1549->515|1659->598|1679->609|1737->646|1884->766|1899->772|1959->811|2154->979|2174->990|2234->1029|2446->1214|2466->1225|2520->1258|2751->1462|2771->1473|2826->1507
                  LINES: 21->2|26->3|27->4|27->4|27->4|32->9|32->9|32->9|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|42->19|42->19|42->19|51->28|51->28|51->28|61->38|61->38|61->38|70->47|70->47|70->47
                  -- GENERATED --
              */
          