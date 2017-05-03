package controllers

import play.api.mvc.{ Action, Controller }

class Hello extends Controller {
  def hello = Action(Ok("hello"))
}
