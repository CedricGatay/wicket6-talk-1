package fr.gatay.cedric.wicket.scala.panel

import org.apache.wicket.markup.html.panel.GenericPanel
import org.apache.wicket.model.{Model, IModel}
import org.slf4j.{LoggerFactory, Logger}
import fr.gatay.cedric.wicket.scala.base.SLink
import org.apache.wicket.Component
import fr.gatay.cedric.wicket.scala.page.SScalaPage

/**
 * User: cgatay
 * Date: 01/04/13
 * Time: 20:42
 */
class SSimpleLinkPanel[T](id:String, model: IModel[T]) extends GenericPanel[T](id, model){
  val LOGGER : Logger  = LoggerFactory.getLogger(classOf[SSimpleLinkPanel[T]])

  val unit = { (_ : Unit) =>
    LOGGER.info("Click from Scala")
    setResponsePage(classOf[SScalaPage])
  }
  add(new SLink[String]("link", unit))
}
