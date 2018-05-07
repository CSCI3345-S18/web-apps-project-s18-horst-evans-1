// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/Restaurant/server/conf/routes
// @DATE:Mon May 07 10:11:17 CDT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:71
  class ReverseRestaurantController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
    def removeFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.removeFood",
      """
        function(name0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/removeFood" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:73
    def menu: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.menu",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu"})
        }
      """
    )
  
    // @LINE:103
    def editQuery: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.editQuery",
      """
        function(name0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/eq" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0)])})
        }
      """
    )
  
    // @LINE:79
    def changeLang: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.changeLang",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/cl"})
        }
      """
    )
  
    // @LINE:101
    def editFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.editFood",
      """
        function(name0,desc1,ft2,price3,lang4) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/edit" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("desc", desc1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("ft", ft2), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("price", price3), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("lang", lang4)])})
        }
      """
    )
  
    // @LINE:93
    def showAboutE: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.showAboutE",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:91
    def newCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.newCustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/login/nc"})
        }
      """
    )
  
    // @LINE:105
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.logout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/login/out"})
        }
      """
    )
  
    // @LINE:97
    def addToCheckout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.addToCheckout",
      """
        function(name0,price1,desc2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/addToCheckout" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("name", name0), (""" + implicitly[play.api.mvc.QueryStringBindable[Double]].javascriptUnbind + """)("price", price1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("desc", desc2)])})
        }
      """
    )
  
    // @LINE:87
    def showHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.showHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/home"})
        }
      """
    )
  
    // @LINE:71
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:77
    def credentials: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.credentials",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant"})
        }
      """
    )
  
    // @LINE:81
    def checkout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.checkout",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/check"})
        }
      """
    )
  
    // @LINE:89
    def showAbout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.showAbout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/about"})
        }
      """
    )
  
    // @LINE:83
    def addFood: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.addFood",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/addFood"})
        }
      """
    )
  
    // @LINE:95
    def spanish: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.spanish",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutsp"})
        }
      """
    )
  
    // @LINE:75
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/login"})
        }
      """
    )
  
    // @LINE:99
    def clear: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RestaurantController.clear",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "restaurant/menu/clear"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:52
  class ReverseBookController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def allBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.allBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
    // @LINE:54
    def addBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.addBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addBook"})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:46
  class ReverseWSChatController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WSChatController.socket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "socket"})
        }
      """
    )
  
    // @LINE:46
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WSChatController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wschat"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseTempController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def singleDayInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.singleDayInfo",
      """
        function(date0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temp/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("date", date0)})
        }
      """
    )
  
    // @LINE:30
    def tempPlotPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.tempPlotPage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "tempplot"})
        }
      """
    )
  
    // @LINE:28
    def tempTable: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.tempTable",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "temp"})
        }
      """
    )
  
    // @LINE:32
    def tempPlot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.tempPlot",
      """
        function(startMonth0,startYear1,endMonth2,endYear3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tempplot/temps" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startMonth", startMonth0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startYear", startYear1), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endMonth", endMonth2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endYear", endYear3)])})
        }
      """
    )
  
    // @LINE:26
    def welcome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.welcome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "temp"})
        }
      """
    )
  
    // @LINE:34
    def precipPlot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TempController.precipPlot",
      """
        function(startMonth0,startYear1,endMonth2,endYear3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tempplot/precip" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startMonth", startMonth0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("startYear", startYear1), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endMonth", endMonth2), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("endYear", endYear3)])})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def todo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.todo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todo"})
        }
      """
    )
  
    // @LINE:42
    def ajaxResponse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ajaxResponse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajax/req"})
        }
      """
    )
  
    // @LINE:19
    def phone: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.phone",
      """
        function(phone0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "phone/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("phone", phone0)})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "index"})
        }
      """
    )
  
    // @LINE:40
    def ajaxTest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.ajaxTest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ajax"})
        }
      """
    )
  
    // @LINE:15
    def plot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.plot",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plot"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:58
  class ReverseSinglePageApp(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def button2Call: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SinglePageApp.button2Call",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spa/button2"})
        }
      """
    )
  
    // @LINE:67
    def jscanvas: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SinglePageApp.jscanvas",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jscanvas"})
        }
      """
    )
  
    // @LINE:60
    def button1Call: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SinglePageApp.button1Call",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spa/button1"})
        }
      """
    )
  
    // @LINE:58
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SinglePageApp.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "spa"})
        }
      """
    )
  
    // @LINE:65
    def setCircle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SinglePageApp.setCircle",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "spa/setCircle"})
        }
      """
    )
  
  }


}
