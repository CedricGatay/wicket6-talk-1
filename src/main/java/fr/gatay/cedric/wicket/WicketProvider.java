package fr.gatay.cedric.wicket;

import org.apache.wicket.protocol.http.WebSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

/**
 * User: cgatay
 * Date: 21/03/13
 * Time: 14:32
 */
@RequestScoped
public class WicketProvider {
    private static final Logger LOGGER = LoggerFactory.getLogger(WicketProvider.class);
    @Produces
    public WebSession getWebSession(){
        LOGGER.info("Called getWebSession");
        return WebSession.get();
    }
}
