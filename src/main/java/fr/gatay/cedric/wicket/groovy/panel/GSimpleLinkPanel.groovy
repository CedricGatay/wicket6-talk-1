package fr.gatay.cedric.wicket.groovy.panel

import fr.gatay.cedric.wicket.HomePage
import fr.gatay.cedric.wicket.groovy.base.GLink
import org.apache.wicket.markup.html.panel.GenericPanel
import org.apache.wicket.model.IModel

/**
 * User: cgatay
 * Date: 04/04/13
 * Time: 19:12
 */
class GSimpleLinkPanel<T> extends GenericPanel<T>{
    GSimpleLinkPanel(final String id, final IModel<T> model) {
        super(id, model)
        add(new GLink("link", {
            setResponsePage(HomePage.class)
        }))
    }
}
