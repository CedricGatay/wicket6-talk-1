package fr.gatay.cedric.wicket.scala.base

import _root_.scala.Unit
import org.apache.wicket.markup.html.link.{StatelessLink, Link}
import org.apache.wicket.model.IModel

class SLink[T](id: String, action : (Unit => Unit)) extends StatelessLink(id){
  def onClick() { action() }
}