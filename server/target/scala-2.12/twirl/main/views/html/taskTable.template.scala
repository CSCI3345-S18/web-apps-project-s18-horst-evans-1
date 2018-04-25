
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

object taskTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[String,String,Seq[Task],Form[NewTask],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* userTable Template File */
  def apply/*2.2*/(username:String, password:String, tasks:Seq[Task], taskForm:Form[NewTask])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Task List")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
	"""),format.raw/*5.2*/("""<br>
	<h2>Task List</h2>
	<p>This page shows a table of books that is populated using Slick to populate a database.</p>
	<table border="1">
		<tr><th>Task</th></tr>
		"""),_display_(/*10.4*/for(t<-tasks) yield /*10.17*/{_display_(Seq[Any](format.raw/*10.18*/("""
			"""),_display_(/*11.5*/if(t.username == username && t.password == password)/*11.57*/{_display_(Seq[Any](format.raw/*11.58*/("""
				"""),format.raw/*12.5*/("""<tr><td>"""),_display_(/*12.14*/t/*12.15*/.task),format.raw/*12.20*/("""</td></tr>
			""")))}),format.raw/*13.5*/("""
		""")))}),format.raw/*14.4*/("""
	"""),format.raw/*15.2*/("""</table>
	
	"""),_display_(/*17.3*/helper/*17.9*/.form(action = helper.CSRF(routes.SlickController.addTask))/*17.68*/ {_display_(Seq[Any](format.raw/*17.70*/("""
	  """),_display_(/*18.5*/helper/*18.11*/.inputText(taskForm("task"))),format.raw/*18.39*/("""
	  """),format.raw/*19.4*/("""<input type="submit" value="Add New Task">
	""")))}),format.raw/*20.3*/("""
	
	"""),_display_(/*22.3*/helper/*22.9*/.form(action = helper.CSRF(routes.SlickController.removeTask))/*22.71*/ {_display_(Seq[Any](format.raw/*22.73*/("""
	  """),_display_(/*23.5*/helper/*23.11*/.inputText(taskForm("task"))),format.raw/*23.39*/("""
	  """),format.raw/*24.4*/("""<input type="submit" value="Remove Task">
	""")))}),format.raw/*25.3*/("""
	"""),format.raw/*26.2*/("""<br>
	"""),_display_(/*27.3*/helper/*27.9*/.form(action = helper.CSRF(routes.SlickController.login))/*27.66*/ {_display_(Seq[Any](format.raw/*27.68*/("""
	  """),format.raw/*28.4*/("""<input type="submit" value="Logout">
	""")))}),format.raw/*29.3*/("""
	
""")))}))
      }
    }
  }

  def render(username:String,password:String,tasks:Seq[Task],taskForm:Form[NewTask],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(username,password,tasks,taskForm)(request,flash)

  def f:((String,String,Seq[Task],Form[NewTask]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (username,password,tasks,taskForm) => (request,flash) => apply(username,password,tasks,taskForm)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 18 21:17:09 CDT 2018
                  SOURCE: /users/hevans/workspace/CSCI3345-S18-master/server/app/views/taskTable.scala.html
                  HASH: 327ebe96b5fb1fbe15173d729e3609d3df5475a5
                  MATRIX: 817->31|1041->162|1068->164|1093->181|1132->183|1160->185|1354->353|1383->366|1422->367|1453->372|1514->424|1553->425|1585->430|1621->439|1631->440|1657->445|1702->460|1736->464|1765->466|1804->479|1818->485|1886->544|1926->546|1957->551|1972->557|2021->585|2052->589|2127->634|2158->639|2172->645|2243->707|2283->709|2314->714|2329->720|2378->748|2409->752|2483->796|2512->798|2545->805|2559->811|2625->868|2665->870|2696->874|2765->913
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|33->10|33->10|33->10|34->11|34->11|34->11|35->12|35->12|35->12|35->12|36->13|37->14|38->15|40->17|40->17|40->17|40->17|41->18|41->18|41->18|42->19|43->20|45->22|45->22|45->22|45->22|46->23|46->23|46->23|47->24|48->25|49->26|50->27|50->27|50->27|50->27|51->28|52->29
                  -- GENERATED --
              */
          