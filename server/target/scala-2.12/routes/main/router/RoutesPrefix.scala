// @GENERATOR:play-routes-compiler
// @SOURCE:/users/ggonzal2/Local/HTML-Documents/WebApps/web-apps-project-s18-horst-evans-1/server/conf/routes
// @DATE:Sat May 05 20:21:07 CDT 2018


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
