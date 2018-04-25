// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/CSCI3345-S18-master/server/conf/routes
// @DATE:Tue Apr 24 21:21:28 CDT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
