package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  def index = Action {
    Ok(views.html.index("Registance : Avalon"))
  }
    
  def createNewGame = Action {
	Ok(views.html.index("createNewGame"))
  }
  
  def register = Action {
    Ok(views.html.index("register"))
  }
  
  def login = Action {
    Ok(views.html.index("login"))
  }
}