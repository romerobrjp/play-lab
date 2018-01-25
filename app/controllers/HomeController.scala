package controllers

import play.api.mvc._

import scala.collection.mutable.{ListBuffer}

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
class HomeController extends Controller {
  val participantes: ListBuffer[Participante] = ListBuffer(
    Participante("Romero", "romero@gmail.com"),
    Participante("Claudino", "claudino@gmail.com"),
    Participante("Mauricio", "mauricio@gmail.com")
  )

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def listarParticipantes = Action {
    Ok(participantes.toString())
  }

  def novoParticipante = TODO
}

case class Participante(nome: String, email: String)