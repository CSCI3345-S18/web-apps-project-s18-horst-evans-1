// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/Restaurant/server/conf/routes
// @DATE:Mon May 07 10:11:17 CDT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:8
  CountController_1: controllers.CountController,
  // @LINE:10
  AsyncController_3: controllers.AsyncController,
  // @LINE:13
  Assets_7: controllers.Assets,
  // @LINE:26
  TempController_4: controllers.TempController,
  // @LINE:46
  WSChatController_6: controllers.WSChatController,
  // @LINE:52
  BookController_0: controllers.BookController,
  // @LINE:58
  SinglePageApp_8: controllers.SinglePageApp,
  // @LINE:71
  RestaurantController_5: controllers.RestaurantController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_3: controllers.AsyncController,
    // @LINE:13
    Assets_7: controllers.Assets,
    // @LINE:26
    TempController_4: controllers.TempController,
    // @LINE:46
    WSChatController_6: controllers.WSChatController,
    // @LINE:52
    BookController_0: controllers.BookController,
    // @LINE:58
    SinglePageApp_8: controllers.SinglePageApp,
    // @LINE:71
    RestaurantController_5: controllers.RestaurantController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_7, TempController_4, WSChatController_6, BookController_0, SinglePageApp_8, RestaurantController_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_3, Assets_7, TempController_4, WSChatController_6, BookController_0, SinglePageApp_8, RestaurantController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """plot""", """controllers.HomeController.plot"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """phone/""" + "$" + """phone<\d{3}-\d{3}-\d{4}>""", """controllers.HomeController.phone(phone:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todo""", """controllers.HomeController.todo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """temp""", """controllers.TempController.welcome"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """temp""", """controllers.TempController.tempTable"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tempplot""", """controllers.TempController.tempPlotPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tempplot/temps""", """controllers.TempController.tempPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tempplot/precip""", """controllers.TempController.precipPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """temp/""" + "$" + """date<\d\d\d\d-\d\d-\d\d>""", """controllers.TempController.singleDayInfo(date:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ajax""", """controllers.HomeController.ajaxTest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ajax/req""", """controllers.HomeController.ajaxResponse"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """wschat""", """controllers.WSChatController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """socket""", """controllers.WSChatController.socket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BookController.allBooks"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addBook""", """controllers.BookController.addBook"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spa""", """controllers.SinglePageApp.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spa/button1""", """controllers.SinglePageApp.button1Call"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spa/button2""", """controllers.SinglePageApp.button2Call"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """spa/setCircle""", """controllers.SinglePageApp.setCircle"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """jscanvas""", """controllers.SinglePageApp.jscanvas"""),
    ("""GET""", this.prefix, """controllers.RestaurantController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu""", """controllers.RestaurantController.menu"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/login""", """controllers.RestaurantController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant""", """controllers.RestaurantController.credentials"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/cl""", """controllers.RestaurantController.changeLang"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/check""", """controllers.RestaurantController.checkout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/addFood""", """controllers.RestaurantController.addFood"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/removeFood""", """controllers.RestaurantController.removeFood(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/home""", """controllers.RestaurantController.showHome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/about""", """controllers.RestaurantController.showAbout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/login/nc""", """controllers.RestaurantController.newCustomer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.RestaurantController.showAboutE"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutsp""", """controllers.RestaurantController.spanish"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/addToCheckout""", """controllers.RestaurantController.addToCheckout(name:String, price:Double, desc:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/clear""", """controllers.RestaurantController.clear"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/edit""", """controllers.RestaurantController.editFood(name:String, desc:String, ft:String, price:Double, lang:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/menu/eq""", """controllers.RestaurantController.editQuery(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """restaurant/login/out""", """controllers.RestaurantController.logout"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """index""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_CountController_count1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count1_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AsyncController_message2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message2_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned3_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_plot4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("plot")))
  )
  private[this] lazy val controllers_HomeController_plot4_invoker = createInvoker(
    HomeController_2.plot,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "plot",
      Nil,
      "GET",
      this.prefix + """plot""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_phone5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("phone/"), DynamicPart("phone", """\d{3}-\d{3}-\d{4}""",false)))
  )
  private[this] lazy val controllers_HomeController_phone5_invoker = createInvoker(
    HomeController_2.phone(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "phone",
      Seq(classOf[String]),
      "GET",
      this.prefix + """phone/""" + "$" + """phone<\d{3}-\d{3}-\d{4}>""",
      """ Demonstrate a regular expression for a route""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_todo6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todo")))
  )
  private[this] lazy val controllers_HomeController_todo6_invoker = createInvoker(
    HomeController_2.todo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "todo",
      Nil,
      "GET",
      this.prefix + """todo""",
      """ Demonstrate TODO for a route""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_TempController_welcome7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("temp")))
  )
  private[this] lazy val controllers_TempController_welcome7_invoker = createInvoker(
    TempController_4.welcome,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "welcome",
      Nil,
      "GET",
      this.prefix + """temp""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_TempController_tempTable8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("temp")))
  )
  private[this] lazy val controllers_TempController_tempTable8_invoker = createInvoker(
    TempController_4.tempTable,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "tempTable",
      Nil,
      "POST",
      this.prefix + """temp""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_TempController_tempPlotPage9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tempplot")))
  )
  private[this] lazy val controllers_TempController_tempPlotPage9_invoker = createInvoker(
    TempController_4.tempPlotPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "tempPlotPage",
      Nil,
      "POST",
      this.prefix + """tempplot""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_TempController_tempPlot10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tempplot/temps")))
  )
  private[this] lazy val controllers_TempController_tempPlot10_invoker = createInvoker(
    TempController_4.tempPlot(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "tempPlot",
      Seq(classOf[Int], classOf[Int], classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """tempplot/temps""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_TempController_precipPlot11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tempplot/precip")))
  )
  private[this] lazy val controllers_TempController_precipPlot11_invoker = createInvoker(
    TempController_4.precipPlot(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "precipPlot",
      Seq(classOf[Int], classOf[Int], classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """tempplot/precip""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_TempController_singleDayInfo12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("temp/"), DynamicPart("date", """\d\d\d\d-\d\d-\d\d""",false)))
  )
  private[this] lazy val controllers_TempController_singleDayInfo12_invoker = createInvoker(
    TempController_4.singleDayInfo(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TempController",
      "singleDayInfo",
      Seq(classOf[String]),
      "GET",
      this.prefix + """temp/""" + "$" + """date<\d\d\d\d-\d\d-\d\d>""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_HomeController_ajaxTest13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ajax")))
  )
  private[this] lazy val controllers_HomeController_ajaxTest13_invoker = createInvoker(
    HomeController_2.ajaxTest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ajaxTest",
      Nil,
      "GET",
      this.prefix + """ajax""",
      """""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_HomeController_ajaxResponse14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ajax/req")))
  )
  private[this] lazy val controllers_HomeController_ajaxResponse14_invoker = createInvoker(
    HomeController_2.ajaxResponse,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "ajaxResponse",
      Nil,
      "GET",
      this.prefix + """ajax/req""",
      """""",
      Seq()
    )
  )

  // @LINE:46
  private[this] lazy val controllers_WSChatController_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("wschat")))
  )
  private[this] lazy val controllers_WSChatController_index15_invoker = createInvoker(
    WSChatController_6.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WSChatController",
      "index",
      Nil,
      "GET",
      this.prefix + """wschat""",
      """""",
      Seq()
    )
  )

  // @LINE:48
  private[this] lazy val controllers_WSChatController_socket16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("socket")))
  )
  private[this] lazy val controllers_WSChatController_socket16_invoker = createInvoker(
    WSChatController_6.socket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WSChatController",
      "socket",
      Nil,
      "GET",
      this.prefix + """socket""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_BookController_allBooks17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BookController_allBooks17_invoker = createInvoker(
    BookController_0.allBooks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "allBooks",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_BookController_addBook18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addBook")))
  )
  private[this] lazy val controllers_BookController_addBook18_invoker = createInvoker(
    BookController_0.addBook,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "addBook",
      Nil,
      "POST",
      this.prefix + """addBook""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_SinglePageApp_index19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spa")))
  )
  private[this] lazy val controllers_SinglePageApp_index19_invoker = createInvoker(
    SinglePageApp_8.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SinglePageApp",
      "index",
      Nil,
      "GET",
      this.prefix + """spa""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_SinglePageApp_button1Call20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spa/button1")))
  )
  private[this] lazy val controllers_SinglePageApp_button1Call20_invoker = createInvoker(
    SinglePageApp_8.button1Call,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SinglePageApp",
      "button1Call",
      Nil,
      "GET",
      this.prefix + """spa/button1""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_SinglePageApp_button2Call21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spa/button2")))
  )
  private[this] lazy val controllers_SinglePageApp_button2Call21_invoker = createInvoker(
    SinglePageApp_8.button2Call,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SinglePageApp",
      "button2Call",
      Nil,
      "GET",
      this.prefix + """spa/button2""",
      """""",
      Seq()
    )
  )

  // @LINE:65
  private[this] lazy val controllers_SinglePageApp_setCircle22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("spa/setCircle")))
  )
  private[this] lazy val controllers_SinglePageApp_setCircle22_invoker = createInvoker(
    SinglePageApp_8.setCircle,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SinglePageApp",
      "setCircle",
      Nil,
      "POST",
      this.prefix + """spa/setCircle""",
      """""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:67
  private[this] lazy val controllers_SinglePageApp_jscanvas23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("jscanvas")))
  )
  private[this] lazy val controllers_SinglePageApp_jscanvas23_invoker = createInvoker(
    SinglePageApp_8.jscanvas,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SinglePageApp",
      "jscanvas",
      Nil,
      "GET",
      this.prefix + """jscanvas""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_RestaurantController_home24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_RestaurantController_home24_invoker = createInvoker(
    RestaurantController_5.home,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "home",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_RestaurantController_menu25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu")))
  )
  private[this] lazy val controllers_RestaurantController_menu25_invoker = createInvoker(
    RestaurantController_5.menu,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "menu",
      Nil,
      "GET",
      this.prefix + """restaurant/menu""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_RestaurantController_login26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/login")))
  )
  private[this] lazy val controllers_RestaurantController_login26_invoker = createInvoker(
    RestaurantController_5.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "login",
      Nil,
      "GET",
      this.prefix + """restaurant/login""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_RestaurantController_credentials27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant")))
  )
  private[this] lazy val controllers_RestaurantController_credentials27_invoker = createInvoker(
    RestaurantController_5.credentials,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "credentials",
      Nil,
      "POST",
      this.prefix + """restaurant""",
      """""",
      Seq()
    )
  )

  // @LINE:79
  private[this] lazy val controllers_RestaurantController_changeLang28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/cl")))
  )
  private[this] lazy val controllers_RestaurantController_changeLang28_invoker = createInvoker(
    RestaurantController_5.changeLang,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "changeLang",
      Nil,
      "POST",
      this.prefix + """restaurant/menu/cl""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_RestaurantController_checkout29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/check")))
  )
  private[this] lazy val controllers_RestaurantController_checkout29_invoker = createInvoker(
    RestaurantController_5.checkout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "checkout",
      Nil,
      "POST",
      this.prefix + """restaurant/menu/check""",
      """""",
      Seq()
    )
  )

  // @LINE:83
  private[this] lazy val controllers_RestaurantController_addFood30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/addFood")))
  )
  private[this] lazy val controllers_RestaurantController_addFood30_invoker = createInvoker(
    RestaurantController_5.addFood,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "addFood",
      Nil,
      "POST",
      this.prefix + """restaurant/menu/addFood""",
      """""",
      Seq()
    )
  )

  // @LINE:85
  private[this] lazy val controllers_RestaurantController_removeFood31_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/removeFood")))
  )
  private[this] lazy val controllers_RestaurantController_removeFood31_invoker = createInvoker(
    RestaurantController_5.removeFood(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "removeFood",
      Seq(classOf[String]),
      "POST",
      this.prefix + """restaurant/menu/removeFood""",
      """""",
      Seq()
    )
  )

  // @LINE:87
  private[this] lazy val controllers_RestaurantController_showHome32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/home")))
  )
  private[this] lazy val controllers_RestaurantController_showHome32_invoker = createInvoker(
    RestaurantController_5.showHome,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "showHome",
      Nil,
      "GET",
      this.prefix + """restaurant/home""",
      """""",
      Seq()
    )
  )

  // @LINE:89
  private[this] lazy val controllers_RestaurantController_showAbout33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/about")))
  )
  private[this] lazy val controllers_RestaurantController_showAbout33_invoker = createInvoker(
    RestaurantController_5.showAbout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "showAbout",
      Nil,
      "GET",
      this.prefix + """restaurant/about""",
      """""",
      Seq()
    )
  )

  // @LINE:91
  private[this] lazy val controllers_RestaurantController_newCustomer34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/login/nc")))
  )
  private[this] lazy val controllers_RestaurantController_newCustomer34_invoker = createInvoker(
    RestaurantController_5.newCustomer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "newCustomer",
      Nil,
      "GET",
      this.prefix + """restaurant/login/nc""",
      """""",
      Seq()
    )
  )

  // @LINE:93
  private[this] lazy val controllers_RestaurantController_showAboutE35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_RestaurantController_showAboutE35_invoker = createInvoker(
    RestaurantController_5.showAboutE,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "showAboutE",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:95
  private[this] lazy val controllers_RestaurantController_spanish36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutsp")))
  )
  private[this] lazy val controllers_RestaurantController_spanish36_invoker = createInvoker(
    RestaurantController_5.spanish,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "spanish",
      Nil,
      "GET",
      this.prefix + """aboutsp""",
      """""",
      Seq()
    )
  )

  // @LINE:97
  private[this] lazy val controllers_RestaurantController_addToCheckout37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/addToCheckout")))
  )
  private[this] lazy val controllers_RestaurantController_addToCheckout37_invoker = createInvoker(
    RestaurantController_5.addToCheckout(fakeValue[String], fakeValue[Double], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "addToCheckout",
      Seq(classOf[String], classOf[Double], classOf[String]),
      "POST",
      this.prefix + """restaurant/menu/addToCheckout""",
      """""",
      Seq()
    )
  )

  // @LINE:99
  private[this] lazy val controllers_RestaurantController_clear38_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/clear")))
  )
  private[this] lazy val controllers_RestaurantController_clear38_invoker = createInvoker(
    RestaurantController_5.clear,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "clear",
      Nil,
      "POST",
      this.prefix + """restaurant/menu/clear""",
      """""",
      Seq()
    )
  )

  // @LINE:101
  private[this] lazy val controllers_RestaurantController_editFood39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/edit")))
  )
  private[this] lazy val controllers_RestaurantController_editFood39_invoker = createInvoker(
    RestaurantController_5.editFood(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[Double], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "editFood",
      Seq(classOf[String], classOf[String], classOf[String], classOf[Double], classOf[Int]),
      "POST",
      this.prefix + """restaurant/menu/edit""",
      """""",
      Seq()
    )
  )

  // @LINE:103
  private[this] lazy val controllers_RestaurantController_editQuery40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/menu/eq")))
  )
  private[this] lazy val controllers_RestaurantController_editQuery40_invoker = createInvoker(
    RestaurantController_5.editQuery(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "editQuery",
      Seq(classOf[String]),
      "POST",
      this.prefix + """restaurant/menu/eq""",
      """""",
      Seq()
    )
  )

  // @LINE:105
  private[this] lazy val controllers_RestaurantController_logout41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("restaurant/login/out")))
  )
  private[this] lazy val controllers_RestaurantController_logout41_invoker = createInvoker(
    RestaurantController_5.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RestaurantController",
      "logout",
      Nil,
      "POST",
      this.prefix + """restaurant/login/out""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_CountController_count1_route(params@_) =>
      call { 
        controllers_CountController_count1_invoker.call(CountController_1.count)
      }
  
    // @LINE:10
    case controllers_AsyncController_message2_route(params@_) =>
      call { 
        controllers_AsyncController_message2_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:13
    case controllers_Assets_versioned3_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned3_invoker.call(Assets_7.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_HomeController_plot4_route(params@_) =>
      call { 
        controllers_HomeController_plot4_invoker.call(HomeController_2.plot)
      }
  
    // @LINE:19
    case controllers_HomeController_phone5_route(params@_) =>
      call(params.fromPath[String]("phone", None)) { (phone) =>
        controllers_HomeController_phone5_invoker.call(HomeController_2.phone(phone))
      }
  
    // @LINE:22
    case controllers_HomeController_todo6_route(params@_) =>
      call { 
        controllers_HomeController_todo6_invoker.call(HomeController_2.todo)
      }
  
    // @LINE:26
    case controllers_TempController_welcome7_route(params@_) =>
      call { 
        controllers_TempController_welcome7_invoker.call(TempController_4.welcome)
      }
  
    // @LINE:28
    case controllers_TempController_tempTable8_route(params@_) =>
      call { 
        controllers_TempController_tempTable8_invoker.call(TempController_4.tempTable)
      }
  
    // @LINE:30
    case controllers_TempController_tempPlotPage9_route(params@_) =>
      call { 
        controllers_TempController_tempPlotPage9_invoker.call(TempController_4.tempPlotPage)
      }
  
    // @LINE:32
    case controllers_TempController_tempPlot10_route(params@_) =>
      call(params.fromQuery[Int]("startMonth", None), params.fromQuery[Int]("startYear", None), params.fromQuery[Int]("endMonth", None), params.fromQuery[Int]("endYear", None)) { (startMonth, startYear, endMonth, endYear) =>
        controllers_TempController_tempPlot10_invoker.call(TempController_4.tempPlot(startMonth, startYear, endMonth, endYear))
      }
  
    // @LINE:34
    case controllers_TempController_precipPlot11_route(params@_) =>
      call(params.fromQuery[Int]("startMonth", None), params.fromQuery[Int]("startYear", None), params.fromQuery[Int]("endMonth", None), params.fromQuery[Int]("endYear", None)) { (startMonth, startYear, endMonth, endYear) =>
        controllers_TempController_precipPlot11_invoker.call(TempController_4.precipPlot(startMonth, startYear, endMonth, endYear))
      }
  
    // @LINE:36
    case controllers_TempController_singleDayInfo12_route(params@_) =>
      call(params.fromPath[String]("date", None)) { (date) =>
        controllers_TempController_singleDayInfo12_invoker.call(TempController_4.singleDayInfo(date))
      }
  
    // @LINE:40
    case controllers_HomeController_ajaxTest13_route(params@_) =>
      call { 
        controllers_HomeController_ajaxTest13_invoker.call(HomeController_2.ajaxTest)
      }
  
    // @LINE:42
    case controllers_HomeController_ajaxResponse14_route(params@_) =>
      call { 
        controllers_HomeController_ajaxResponse14_invoker.call(HomeController_2.ajaxResponse)
      }
  
    // @LINE:46
    case controllers_WSChatController_index15_route(params@_) =>
      call { 
        controllers_WSChatController_index15_invoker.call(WSChatController_6.index)
      }
  
    // @LINE:48
    case controllers_WSChatController_socket16_route(params@_) =>
      call { 
        controllers_WSChatController_socket16_invoker.call(WSChatController_6.socket)
      }
  
    // @LINE:52
    case controllers_BookController_allBooks17_route(params@_) =>
      call { 
        controllers_BookController_allBooks17_invoker.call(BookController_0.allBooks)
      }
  
    // @LINE:54
    case controllers_BookController_addBook18_route(params@_) =>
      call { 
        controllers_BookController_addBook18_invoker.call(BookController_0.addBook)
      }
  
    // @LINE:58
    case controllers_SinglePageApp_index19_route(params@_) =>
      call { 
        controllers_SinglePageApp_index19_invoker.call(SinglePageApp_8.index)
      }
  
    // @LINE:60
    case controllers_SinglePageApp_button1Call20_route(params@_) =>
      call { 
        controllers_SinglePageApp_button1Call20_invoker.call(SinglePageApp_8.button1Call)
      }
  
    // @LINE:62
    case controllers_SinglePageApp_button2Call21_route(params@_) =>
      call { 
        controllers_SinglePageApp_button2Call21_invoker.call(SinglePageApp_8.button2Call)
      }
  
    // @LINE:65
    case controllers_SinglePageApp_setCircle22_route(params@_) =>
      call { 
        controllers_SinglePageApp_setCircle22_invoker.call(SinglePageApp_8.setCircle)
      }
  
    // @LINE:67
    case controllers_SinglePageApp_jscanvas23_route(params@_) =>
      call { 
        controllers_SinglePageApp_jscanvas23_invoker.call(SinglePageApp_8.jscanvas)
      }
  
    // @LINE:71
    case controllers_RestaurantController_home24_route(params@_) =>
      call { 
        controllers_RestaurantController_home24_invoker.call(RestaurantController_5.home)
      }
  
    // @LINE:73
    case controllers_RestaurantController_menu25_route(params@_) =>
      call { 
        controllers_RestaurantController_menu25_invoker.call(RestaurantController_5.menu)
      }
  
    // @LINE:75
    case controllers_RestaurantController_login26_route(params@_) =>
      call { 
        controllers_RestaurantController_login26_invoker.call(RestaurantController_5.login)
      }
  
    // @LINE:77
    case controllers_RestaurantController_credentials27_route(params@_) =>
      call { 
        controllers_RestaurantController_credentials27_invoker.call(RestaurantController_5.credentials)
      }
  
    // @LINE:79
    case controllers_RestaurantController_changeLang28_route(params@_) =>
      call { 
        controllers_RestaurantController_changeLang28_invoker.call(RestaurantController_5.changeLang)
      }
  
    // @LINE:81
    case controllers_RestaurantController_checkout29_route(params@_) =>
      call { 
        controllers_RestaurantController_checkout29_invoker.call(RestaurantController_5.checkout)
      }
  
    // @LINE:83
    case controllers_RestaurantController_addFood30_route(params@_) =>
      call { 
        controllers_RestaurantController_addFood30_invoker.call(RestaurantController_5.addFood)
      }
  
    // @LINE:85
    case controllers_RestaurantController_removeFood31_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_RestaurantController_removeFood31_invoker.call(RestaurantController_5.removeFood(name))
      }
  
    // @LINE:87
    case controllers_RestaurantController_showHome32_route(params@_) =>
      call { 
        controllers_RestaurantController_showHome32_invoker.call(RestaurantController_5.showHome)
      }
  
    // @LINE:89
    case controllers_RestaurantController_showAbout33_route(params@_) =>
      call { 
        controllers_RestaurantController_showAbout33_invoker.call(RestaurantController_5.showAbout)
      }
  
    // @LINE:91
    case controllers_RestaurantController_newCustomer34_route(params@_) =>
      call { 
        controllers_RestaurantController_newCustomer34_invoker.call(RestaurantController_5.newCustomer)
      }
  
    // @LINE:93
    case controllers_RestaurantController_showAboutE35_route(params@_) =>
      call { 
        controllers_RestaurantController_showAboutE35_invoker.call(RestaurantController_5.showAboutE)
      }
  
    // @LINE:95
    case controllers_RestaurantController_spanish36_route(params@_) =>
      call { 
        controllers_RestaurantController_spanish36_invoker.call(RestaurantController_5.spanish)
      }
  
    // @LINE:97
    case controllers_RestaurantController_addToCheckout37_route(params@_) =>
      call(params.fromQuery[String]("name", None), params.fromQuery[Double]("price", None), params.fromQuery[String]("desc", None)) { (name, price, desc) =>
        controllers_RestaurantController_addToCheckout37_invoker.call(RestaurantController_5.addToCheckout(name, price, desc))
      }
  
    // @LINE:99
    case controllers_RestaurantController_clear38_route(params@_) =>
      call { 
        controllers_RestaurantController_clear38_invoker.call(RestaurantController_5.clear)
      }
  
    // @LINE:101
    case controllers_RestaurantController_editFood39_route(params@_) =>
      call(params.fromQuery[String]("name", None), params.fromQuery[String]("desc", None), params.fromQuery[String]("ft", None), params.fromQuery[Double]("price", None), params.fromQuery[Int]("lang", None)) { (name, desc, ft, price, lang) =>
        controllers_RestaurantController_editFood39_invoker.call(RestaurantController_5.editFood(name, desc, ft, price, lang))
      }
  
    // @LINE:103
    case controllers_RestaurantController_editQuery40_route(params@_) =>
      call(params.fromQuery[String]("name", None)) { (name) =>
        controllers_RestaurantController_editQuery40_invoker.call(RestaurantController_5.editQuery(name))
      }
  
    // @LINE:105
    case controllers_RestaurantController_logout41_route(params@_) =>
      call { 
        controllers_RestaurantController_logout41_invoker.call(RestaurantController_5.logout)
      }
  }
}
