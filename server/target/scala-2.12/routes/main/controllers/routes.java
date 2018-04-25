// @GENERATOR:play-routes-compiler
// @SOURCE:/users/hevans/workspace/CSCI3345-S18-master/server/conf/routes
// @DATE:Tue Apr 24 21:21:28 CDT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBookController BookController = new controllers.ReverseBookController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseCountController CountController = new controllers.ReverseCountController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseWSChatController WSChatController = new controllers.ReverseWSChatController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSlickController SlickController = new controllers.ReverseSlickController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTempController TempController = new controllers.ReverseTempController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAsyncController AsyncController = new controllers.ReverseAsyncController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSinglePageApp SinglePageApp = new controllers.ReverseSinglePageApp(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePongController PongController = new controllers.ReversePongController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBookController BookController = new controllers.javascript.ReverseBookController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseCountController CountController = new controllers.javascript.ReverseCountController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseWSChatController WSChatController = new controllers.javascript.ReverseWSChatController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSlickController SlickController = new controllers.javascript.ReverseSlickController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTempController TempController = new controllers.javascript.ReverseTempController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAsyncController AsyncController = new controllers.javascript.ReverseAsyncController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSinglePageApp SinglePageApp = new controllers.javascript.ReverseSinglePageApp(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePongController PongController = new controllers.javascript.ReversePongController(RoutesPrefix.byNamePrefix());
  }

}
