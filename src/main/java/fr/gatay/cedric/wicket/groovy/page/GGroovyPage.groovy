package fr.gatay.cedric.wicket.groovy.page

import fr.gatay.cedric.wicket.HomePage
import fr.gatay.cedric.wicket.groovy.base.GLink
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.wicketstuff.annotation.mount.MountPath

/**
 * User: cgatay
 * Date: 03/04/13
 * Time: 19:58
 */
@MountPath("/fullgroovy")
class GGroovyPage extends HomePage{
    GGroovyPage(final PageParameters parameters) {
        super(parameters)
    }

    @Override
    protected void createLink(final String wicketId) {
        add(new GLink(wicketId,{
          setResponsePage(HomePage.class)
        }))
    }
}
