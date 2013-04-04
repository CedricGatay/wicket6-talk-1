package fr.gatay.cedric.wicket.scala.page

import fr.gatay.cedric.wicket.{ScalaPage, HomePage}
import org.apache.wicket.request.mapper.parameter.PageParameters
import fr.gatay.cedric.wicket.scala.base.{SLink}
import org.apache.wicket.model.Model
import org.apache.wicket.Component
import org.wicketstuff.annotation.mount.MountPath

/**
 * User: cgatay
 * Date: 02/04/13
 * Time: 14:40
 */
@MountPath("/fullscala")
class SScalaPage(params : PageParameters) extends HomePage(params){
  protected override def createLink(wicketId: String) {
     add(new SLink(wicketId, { (_) => setResponsePage(classOf[ScalaPage[Nothing]])}))
  }
}
