// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/Restaurant/server/conf/routes
// @DATE:Mon May 07 10:11:17 CDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:71
  class ReverseRestaurantController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:85
    def removeFood(name:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/removeFood" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:73
    def menu(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/menu")
    }
  
    // @LINE:103
    def editQuery(name:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/eq" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)))))
    }
  
    // @LINE:79
    def changeLang(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/cl")
    }
  
    // @LINE:101
    def editFood(name:String, desc:String, ft:String, price:Double, lang:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/edit" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("desc", desc)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("ft", ft)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("price", price)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("lang", lang)))))
    }
  
    // @LINE:93
    def showAboutE(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:91
    def newCustomer(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/login/nc")
    }
  
    // @LINE:105
    def logout(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/login/out")
    }
  
    // @LINE:97
    def addToCheckout(name:String, price:Double, desc:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/addToCheckout" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("name", name)), Some(implicitly[play.api.mvc.QueryStringBindable[Double]].unbind("price", price)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("desc", desc)))))
    }
  
    // @LINE:87
    def showHome(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/home")
    }
  
    // @LINE:71
    def home(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:77
    def credentials(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant")
    }
  
    // @LINE:81
    def checkout(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/check")
    }
  
    // @LINE:89
    def showAbout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/about")
    }
  
    // @LINE:83
    def addFood(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/addFood")
    }
  
    // @LINE:95
    def spanish(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "aboutsp")
    }
  
    // @LINE:75
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "restaurant/login")
    }
  
    // @LINE:99
    def clear(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "restaurant/menu/clear")
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:52
  class ReverseBookController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def allBooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:54
    def addBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addBook")
    }
  
  }

  // @LINE:8
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:46
  class ReverseWSChatController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def socket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "socket")
    }
  
    // @LINE:46
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "wschat")
    }
  
  }

  // @LINE:26
  class ReverseTempController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def singleDayInfo(date:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "temp/" + implicitly[play.api.mvc.PathBindable[String]].unbind("date", date))
    }
  
    // @LINE:30
    def tempPlotPage(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tempplot")
    }
  
    // @LINE:28
    def tempTable(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "temp")
    }
  
    // @LINE:32
    def tempPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tempplot/temps" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startMonth", startMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startYear", startYear)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endMonth", endMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endYear", endYear)))))
    }
  
    // @LINE:26
    def welcome(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "temp")
    }
  
    // @LINE:34
    def precipPlot(startMonth:Int, startYear:Int, endMonth:Int, endYear:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tempplot/precip" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startMonth", startMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("startYear", startYear)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endMonth", endMonth)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("endYear", endYear)))))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def todo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todo")
    }
  
    // @LINE:42
    def ajaxResponse(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ajax/req")
    }
  
    // @LINE:19
    def phone(phone:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "phone/" + implicitly[play.api.mvc.PathBindable[String]].unbind("phone", phone))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "index")
    }
  
    // @LINE:40
    def ajaxTest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "ajax")
    }
  
    // @LINE:15
    def plot(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "plot")
    }
  
  }

  // @LINE:10
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:58
  class ReverseSinglePageApp(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def button2Call(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "spa/button2")
    }
  
    // @LINE:67
    def jscanvas(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "jscanvas")
    }
  
    // @LINE:60
    def button1Call(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "spa/button1")
    }
  
    // @LINE:58
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "spa")
    }
  
    // @LINE:65
    def setCircle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "spa/setCircle")
    }
  
  }


}
