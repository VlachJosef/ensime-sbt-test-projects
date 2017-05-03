package modules

import com.softwaremill.macwire._
import controllers.Hello
import play.api.ApplicationLoader.Context
import play.api.{ BuiltInComponentsFromContext, BuiltInComponents }
import play.api.routing.Router
import router.Routes

class ApplicationLoader extends play.api.ApplicationLoader {
  def load(context: Context) = {
    (new BuiltInComponentsFromContext(context) with ApplicationModule).application
  }
}

trait ApplicationModule extends BuiltInComponents {

  lazy val listingController = wire[Hello]

  lazy val router: Router = {
    lazy val prefix = "/"
    wire[Routes]
  }
}
