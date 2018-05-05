// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/Restaurant/server/conf/routes
// @DATE:Sat May 05 00:24:40 CDT 2018


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
