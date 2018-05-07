
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[models.Customer],Form[Login],Form[NewCustomer],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* login Template File */
  def apply/*2.2*/(customers:Seq[models.Customer],loginForm: Form[Login],newUserForm:Form[NewCustomer])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<head>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*5.47*/routes/*5.53*/.Assets.versioned("stylesheets/project.css")),format.raw/*5.97*/("""">
</head>
<body><br><br><br>
<div class = "menuBar">
	<ul>
		<li><form action=""""),_display_(/*10.22*/controllers/*10.33*/.routes.RestaurantController.login),format.raw/*10.67*/(""""><input type="submit" value="Login" id="submit"></form></li>
		<li><form action=""""),_display_(/*11.22*/controllers/*11.33*/.routes.RestaurantController.menu),format.raw/*11.66*/(""""><input type="submit" value="Menu" id="submit"></form></li>
		<li><form action=""""),_display_(/*12.22*/controllers/*12.33*/.routes.RestaurantController.showAboutE),format.raw/*12.72*/(""""><input type="submit" value="About" id="submit"></form></li>
		<li><form action=""""),_display_(/*13.22*/controllers/*13.33*/.routes.RestaurantController.showHome),format.raw/*13.70*/(""""><input type="submit" value="Home" id="submit"></form></li>
		
	</ul>
	</div>
</body>

"""),_display_(/*19.2*/main("Login Form")/*19.20*/{_display_(Seq[Any](format.raw/*19.21*/("""
	"""),format.raw/*20.2*/("""<br>
	<h2>Login to an Existing Account</h2>
	<br>
	<div class="container">
	<h3>Login</h3><br>
	<form id="login-form" action = """"),_display_(/*25.35*/routes/*25.41*/.RestaurantController.credentials()),format.raw/*25.76*/("""" method="POST">
		"""),_display_(/*26.4*/helper/*26.10*/.CSRF.formField),format.raw/*26.25*/("""
		"""),format.raw/*27.3*/("""Username: <input type="text" name="username" placeholder="Your name..."><br><br>
		Password: <input type="password" name="password" placeholder="Your password..."><br><br>
		<input type="submit" value="Login">
	</form>
	</div>
	
	<br>
	<div class="container">
	<h3>New User</h3>
		"""),_display_(/*36.4*/helper/*36.10*/.form(action = helper.CSRF(routes.RestaurantController.newCustomer))/*36.78*/ {_display_(Seq[Any](format.raw/*36.80*/("""
			"""),_display_(/*37.5*/helper/*37.11*/.inputText(newUserForm("Name"))),format.raw/*37.42*/("""
			"""),_display_(/*38.5*/helper/*38.11*/.inputText(newUserForm("phone"))),format.raw/*38.43*/("""
			"""),_display_(/*39.5*/helper/*39.11*/.inputText(newUserForm("email"))),format.raw/*39.43*/("""
			"""),_display_(/*40.5*/helper/*40.11*/.inputText(newUserForm("address"))),format.raw/*40.45*/("""
			"""),_display_(/*41.5*/helper/*41.11*/.inputText(newUserForm("state"))),format.raw/*41.43*/("""
			"""),_display_(/*42.5*/helper/*42.11*/.inputText(newUserForm("zip"))),format.raw/*42.41*/("""
			"""),_display_(/*43.5*/helper/*43.11*/.inputText(newUserForm("username"))),format.raw/*43.46*/("""
			"""),_display_(/*44.5*/helper/*44.11*/.inputText(newUserForm("password"))),format.raw/*44.46*/("""
			"""),format.raw/*45.4*/("""<input type="submit" name ="userbtn" value="Submit">
		""")))}),format.raw/*46.4*/("""
	"""),format.raw/*47.2*/("""</div>
	<br>
	<div class="container">
		"""),_display_(/*50.4*/helper/*50.10*/.form(action = helper.CSRF(routes.RestaurantController.logout))/*50.73*/ {_display_(Seq[Any](format.raw/*50.75*/("""
			"""),format.raw/*51.4*/("""<input type="submit" value="Logout">
		""")))}),format.raw/*52.4*/("""
	"""),format.raw/*53.2*/("""</div>

	<br><br><br>
	<h1><b>Default Users:</b></h1><br>
	<p>Username: heaven</p>
	<p>Password: heaven</p>
	<p>(Manager Account)</p>
	<br>
	<p>Username: ggYes</p>
	<p>Password: Yes</p>
	<p>(Normal Account)</p>
	</div>
""")))}),format.raw/*65.2*/("""

"""))
      }
    }
  }

  def render(customers:Seq[models.Customer],loginForm:Form[Login],newUserForm:Form[NewCustomer],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(customers,loginForm,newUserForm)(request)

  def f:((Seq[models.Customer],Form[Login],Form[NewCustomer]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (customers,loginForm,newUserForm) => (request) => apply(customers,loginForm,newUserForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon May 07 04:34:40 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/login.scala.html
                  HASH: 652e70d565bf6a3e7f88f06fcb1b2414fa23a111
                  MATRIX: 816->27|1036->154|1063->155|1142->208|1156->214|1220->258|1328->339|1348->350|1403->384|1513->467|1533->478|1587->511|1696->593|1716->604|1776->643|1886->726|1906->737|1964->774|2079->863|2106->881|2145->882|2174->884|2330->1013|2345->1019|2401->1054|2447->1074|2462->1080|2498->1095|2528->1098|2836->1380|2851->1386|2928->1454|2968->1456|2999->1461|3014->1467|3066->1498|3097->1503|3112->1509|3165->1541|3196->1546|3211->1552|3264->1584|3295->1589|3310->1595|3365->1629|3396->1634|3411->1640|3464->1672|3495->1677|3510->1683|3561->1713|3592->1718|3607->1724|3663->1759|3694->1764|3709->1770|3765->1805|3796->1809|3882->1865|3911->1867|3978->1908|3993->1914|4065->1977|4105->1979|4136->1983|4206->2023|4235->2025|4485->2245
                  LINES: 21->2|26->3|27->4|28->5|28->5|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|36->13|36->13|36->13|42->19|42->19|42->19|43->20|48->25|48->25|48->25|49->26|49->26|49->26|50->27|59->36|59->36|59->36|59->36|60->37|60->37|60->37|61->38|61->38|61->38|62->39|62->39|62->39|63->40|63->40|63->40|64->41|64->41|64->41|65->42|65->42|65->42|66->43|66->43|66->43|67->44|67->44|67->44|68->45|69->46|70->47|73->50|73->50|73->50|73->50|74->51|75->52|76->53|88->65
                  -- GENERATED --
              */
          