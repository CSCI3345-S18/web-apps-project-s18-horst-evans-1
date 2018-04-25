
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

object bookTable extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Book],Form[NewBook],MessagesRequestHeader,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* bookTable Template File */
  def apply/*2.2*/(books: Seq[Book], bookFrom: Form[NewBook])(implicit request: MessagesRequestHeader, flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Book List")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
	"""),format.raw/*5.2*/("""<h2>Book List</h2>
	<p>This page shows a table of books that is populated using Slick to populate a database.</p>
	<table border="1">
		<tr><th>Title</th><th>ISBN</th><th>Price</th></tr>
		"""),_display_(/*9.4*/for(b <- books) yield /*9.19*/ {_display_(Seq[Any](format.raw/*9.21*/("""
			"""),format.raw/*10.4*/("""<tr><td>"""),_display_(/*10.13*/b/*10.14*/.title),format.raw/*10.20*/("""</td><td>"""),_display_(/*10.30*/b/*10.31*/.isbn),format.raw/*10.36*/("""</td><td>"""),_display_(/*10.46*/b/*10.47*/.price),format.raw/*10.53*/("""</td></tr>
		""")))}),format.raw/*11.4*/("""
	"""),format.raw/*12.2*/("""</table>
	
	"""),_display_(/*14.3*/helper/*14.9*/.form(action = helper.CSRF(routes.BookController.addBook))/*14.67*/ {_display_(Seq[Any](format.raw/*14.69*/("""
	  """),_display_(/*15.5*/helper/*15.11*/.inputText(bookFrom("title"))),format.raw/*15.40*/("""
	  """),_display_(/*16.5*/helper/*16.11*/.inputText(bookFrom("isbn"))),format.raw/*16.39*/("""
	  """),_display_(/*17.5*/helper/*17.11*/.inputText(bookFrom("price"))),format.raw/*17.40*/("""
	  """),format.raw/*18.4*/("""<input type="submit" value="Submit">
	""")))}),format.raw/*19.3*/("""
	
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(books:Seq[Book],bookFrom:Form[NewBook],request:MessagesRequestHeader,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(books,bookFrom)(request,flash)

  def f:((Seq[Book],Form[NewBook]) => (MessagesRequestHeader,Flash) => play.twirl.api.HtmlFormat.Appendable) = (books,bookFrom) => (request,flash) => apply(books,bookFrom)(request,flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Apr 13 20:28:12 CDT 2018
                  SOURCE: /users/hevans/workspace/CSCI3345-S18-master/server/app/views/bookTable.scala.html
                  HASH: 1efc1fe38b553f8cc1d3f7c46d9872f0480145ec
                  MATRIX: 803->31|995->130|1022->132|1047->149|1086->151|1114->153|1329->343|1359->358|1398->360|1429->364|1465->373|1475->374|1502->380|1539->390|1549->391|1575->396|1612->406|1622->407|1649->413|1693->427|1722->429|1761->442|1775->448|1842->506|1882->508|1913->513|1928->519|1978->548|2009->553|2024->559|2073->587|2104->592|2119->598|2169->627|2200->631|2269->670|2303->674
                  LINES: 21->2|26->3|27->4|27->4|27->4|28->5|32->9|32->9|32->9|33->10|33->10|33->10|33->10|33->10|33->10|33->10|33->10|33->10|33->10|34->11|35->12|37->14|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|42->19|44->21
                  -- GENERATED --
              */
          