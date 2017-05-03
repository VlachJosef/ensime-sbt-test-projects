package controllers

import play.api.mvc.{ Action, Controller }

class Core extends Controller {
  def core = Action(Ok("core module"))
}
