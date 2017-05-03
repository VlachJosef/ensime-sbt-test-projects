package controllers

import play.api.mvc.{ Action, Controller }

class Kernel extends Controller {
  def kernel = Action(Ok("kernel module"))
}
