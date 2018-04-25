// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/CSCI3345-S18-master/server/conf/routes
// @DATE:Tue Apr 24 21:21:28 CDT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

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

  // @LINE:69
  class ReverseSlickController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:75
    def addTask(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addTask")
    }
  
    // @LINE:71
    def allTasks(): Call = {
    
      () match {
      
        // @LINE:71
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "tasks")
      
      }
    
    }
  
    // @LINE:77
    def removeTask(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeTask")
    }
  
    // @LINE:69
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
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
      
      Call("GET", _prefix)
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

  
    // @LINE:60
    def button1Call(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "spa/button1")
    }
  
    // @LINE:65
    def setCircle(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "spa/setCircle")
    }
  
    // @LINE:58
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "spa")
    }
  
    // @LINE:62
    def button2Call(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "spa/button2")
    }
  
  }

  // @LINE:81
  class ReversePongController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:81
    def start(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pong")
    }
  
  }


}