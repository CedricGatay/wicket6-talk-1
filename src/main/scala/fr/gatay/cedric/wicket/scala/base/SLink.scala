package fr.gatay.cedric.wicket.scala.base

import _root_.scala.Unit
import org.apache.wicket.markup.html.link.Link
import org.apache.wicket.model.IModel

class SLink[T](id: String, model: IModel[T], action : (Unit => Unit)) extends Link(id, model){
  def onClick() { action() }
}