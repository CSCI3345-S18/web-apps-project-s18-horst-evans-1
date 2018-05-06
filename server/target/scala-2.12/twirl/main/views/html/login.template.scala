
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Login],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /* login Template File */
  def apply/*2.2*/(loginForm: Form[Login])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login Form")/*4.20*/{_display_(Seq[Any](format.raw/*4.21*/("""
	"""),format.raw/*5.2*/("""<br>
	<h2>Login to an Existing Account</h2>
	
	<h1>If the account does not exist, it will make a new profile</h1>
	<br>
	<form id="login-form" action = """"),_display_(/*10.35*/routes/*10.41*/.RestaurantController.credentials()),format.raw/*10.76*/("""" method="POST">
		"""),_display_(/*11.4*/helper/*11.10*/.CSRF.formField),format.raw/*11.25*/("""
		"""),format.raw/*12.3*/("""Username:<input type="text" name="username"><br>
		Password:<input type="password" name="password"><br>
		<input type="submit" value="Login">
	</form>
	<br><br><br>
	<h1><b>Default Users:</b></h1><br>
	<p>Username: heaven</p>
	<p>Password: heaven</p>
	<br>
	<p>Username: ggYes</p>
	<p>Password: Yes</p>
""")))}),format.raw/*23.2*/("""

"""))
      }
    }
  }

  def render(loginForm:Form[Login],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)(request)

  def f:((Form[Login]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => (request) => apply(loginForm)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat May 05 20:49:03 CDT 2018
                  SOURCE: /users/hevans/workspace/Restaurant/server/app/views/login.scala.html
                  HASH: f19e9effe07990f1efa1f9725eaa35791b1ed71d
                  MATRIX: 777->27|936->93|963->95|989->113|1027->114|1055->116|1236->270|1251->276|1307->311|1353->331|1368->337|1404->352|1434->355|1768->659
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|46->23
                  -- GENERATED --
              */
          