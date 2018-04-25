// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/CSCI3345-S18-master/server/conf/routes
// @DATE:Tue Apr 24 21:21:28 CDT 2018

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
  AsyncController_4: controllers.AsyncController,
  // @LINE:13
  Assets_7: controllers.Assets,
  // @LINE:26
  TempController_5: controllers.TempController,
  // @LINE:46
  WSChatController_6: controllers.WSChatController,
  // @LINE:52
  BookController_0: controllers.BookController,
  // @LINE:58
  SinglePageApp_9: controllers.SinglePageApp,
  // @LINE:69
  SlickController_3: controllers.SlickController,
  // @LINE:81
  PongController_8: controllers.PongController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:8
    CountController_1: controllers.CountController,
    // @LINE:10
    AsyncController_4: controllers.AsyncController,
    // @LINE:13
    Assets_7: controllers.Assets,
    // @LINE:26
    TempController_5: controllers.TempController,
    // @LINE:46
    WSChatController_6: controllers.WSChatController,
    // @LINE:52
    BookController_0: controllers.BookController,
    // @LINE:58
    SinglePageApp_9: controllers.SinglePageApp,
    // @LINE:69
    SlickController_3: controllers.SlickController,
    // @LINE:81
    PongController_8: controllers.PongController
  ) = this(errorHandler, HomeController_2, CountController_1, AsyncController_4, Assets_7, TempController_5, WSChatController_6, BookController_0, SinglePageApp_9, SlickController_3, PongController_8, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, CountController_1, AsyncController_4, Assets_7, TempController_5, WSChatController_6, BookController_0, SinglePageApp_9, SlickController_3, PongController_8, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.SlickController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.SlickController.allTasks"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tasks""", """controllers.SlickController.allTasks"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask""", """controllers.SlickController.addTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeTask""", """controllers.SlickController.removeTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pong""", """controllers.PongController.start"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
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
    AsyncController_4.message,
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
    TempController_5.welcome,
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
    TempController_5.tempTable,
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
    TempController_5.tempPlotPage,
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
    TempController_5.tempPlot(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
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
    TempController_5.precipPlot(fakeValue[Int], fakeValue[Int], fakeValue[Int], fakeValue[Int]),
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
    TempController_5.singleDayInfo(fakeValue[String]),
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
    SinglePageApp_9.index,
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
    SinglePageApp_9.button1Call,
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
    SinglePageApp_9.button2Call,
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
    SinglePageApp_9.setCircle,
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

  // @LINE:69
  private[this] lazy val controllers_SlickController_login23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_SlickController_login23_invoker = createInvoker(
    SlickController_3.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SlickController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:71
  private[this] lazy val controllers_SlickController_allTasks24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_SlickController_allTasks24_invoker = createInvoker(
    SlickController_3.allTasks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SlickController",
      "allTasks",
      Nil,
      "GET",
      this.prefix + """tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:73
  private[this] lazy val controllers_SlickController_allTasks25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tasks")))
  )
  private[this] lazy val controllers_SlickController_allTasks25_invoker = createInvoker(
    SlickController_3.allTasks,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SlickController",
      "allTasks",
      Nil,
      "POST",
      this.prefix + """tasks""",
      """""",
      Seq()
    )
  )

  // @LINE:75
  private[this] lazy val controllers_SlickController_addTask26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask")))
  )
  private[this] lazy val controllers_SlickController_addTask26_invoker = createInvoker(
    SlickController_3.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SlickController",
      "addTask",
      Nil,
      "GET",
      this.prefix + """addTask""",
      """""",
      Seq()
    )
  )

  // @LINE:77
  private[this] lazy val controllers_SlickController_removeTask27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeTask")))
  )
  private[this] lazy val controllers_SlickController_removeTask27_invoker = createInvoker(
    SlickController_3.removeTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SlickController",
      "removeTask",
      Nil,
      "GET",
      this.prefix + """removeTask""",
      """""",
      Seq()
    )
  )

  // @LINE:81
  private[this] lazy val controllers_PongController_start28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pong")))
  )
  private[this] lazy val controllers_PongController_start28_invoker = createInvoker(
    PongController_8.start,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PongController",
      "start",
      Nil,
      "GET",
      this.prefix + """pong""",
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
        controllers_AsyncController_message2_invoker.call(AsyncController_4.message)
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
        controllers_TempController_welcome7_invoker.call(TempController_5.welcome)
      }
  
    // @LINE:28
    case controllers_TempController_tempTable8_route(params@_) =>
      call { 
        controllers_TempController_tempTable8_invoker.call(TempController_5.tempTable)
      }
  
    // @LINE:30
    case controllers_TempController_tempPlotPage9_route(params@_) =>
      call { 
        controllers_TempController_tempPlotPage9_invoker.call(TempController_5.tempPlotPage)
      }
  
    // @LINE:32
    case controllers_TempController_tempPlot10_route(params@_) =>
      call(params.fromQuery[Int]("startMonth", None), params.fromQuery[Int]("startYear", None), params.fromQuery[Int]("endMonth", None), params.fromQuery[Int]("endYear", None)) { (startMonth, startYear, endMonth, endYear) =>
        controllers_TempController_tempPlot10_invoker.call(TempController_5.tempPlot(startMonth, startYear, endMonth, endYear))
      }
  
    // @LINE:34
    case controllers_TempController_precipPlot11_route(params@_) =>
      call(params.fromQuery[Int]("startMonth", None), params.fromQuery[Int]("startYear", None), params.fromQuery[Int]("endMonth", None), params.fromQuery[Int]("endYear", None)) { (startMonth, startYear, endMonth, endYear) =>
        controllers_TempController_precipPlot11_invoker.call(TempController_5.precipPlot(startMonth, startYear, endMonth, endYear))
      }
  
    // @LINE:36
    case controllers_TempController_singleDayInfo12_route(params@_) =>
      call(params.fromPath[String]("date", None)) { (date) =>
        controllers_TempController_singleDayInfo12_invoker.call(TempController_5.singleDayInfo(date))
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
        controllers_SinglePageApp_index19_invoker.call(SinglePageApp_9.index)
      }
  
    // @LINE:60
    case controllers_SinglePageApp_button1Call20_route(params@_) =>
      call { 
        controllers_SinglePageApp_button1Call20_invoker.call(SinglePageApp_9.button1Call)
      }
  
    // @LINE:62
    case controllers_SinglePageApp_button2Call21_route(params@_) =>
      call { 
        controllers_SinglePageApp_button2Call21_invoker.call(SinglePageApp_9.button2Call)
      }
  
    // @LINE:65
    case controllers_SinglePageApp_setCircle22_route(params@_) =>
      call { 
        controllers_SinglePageApp_setCircle22_invoker.call(SinglePageApp_9.setCircle)
      }
  
    // @LINE:69
    case controllers_SlickController_login23_route(params@_) =>
      call { 
        controllers_SlickController_login23_invoker.call(SlickController_3.login)
      }
  
    // @LINE:71
    case controllers_SlickController_allTasks24_route(params@_) =>
      call { 
        controllers_SlickController_allTasks24_invoker.call(SlickController_3.allTasks)
      }
  
    // @LINE:73
    case controllers_SlickController_allTasks25_route(params@_) =>
      call { 
        controllers_SlickController_allTasks25_invoker.call(SlickController_3.allTasks)
      }
  
    // @LINE:75
    case controllers_SlickController_addTask26_route(params@_) =>
      call { 
        controllers_SlickController_addTask26_invoker.call(SlickController_3.addTask)
      }
  
    // @LINE:77
    case controllers_SlickController_removeTask27_route(params@_) =>
      call { 
        controllers_SlickController_removeTask27_invoker.call(SlickController_3.removeTask)
      }
  
    // @LINE:81
    case controllers_PongController_start28_route(params@_) =>
      call { 
        controllers_PongController_start28_invoker.call(PongController_8.start)
      }
  }
}