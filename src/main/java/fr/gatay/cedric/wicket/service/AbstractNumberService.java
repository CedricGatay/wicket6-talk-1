package fr.gatay.cedric.wicket.service;

import org.apache.wicket.protocol.http.WebSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * User: cgatay
 * Date: 27/02/13
 * Time: 16:55
 */
public abstract class AbstractNumberService implements Serializable {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractNumberService.class);
    private Double rnd;
    @Inject
    WebSession webSession;

    @PostConstruct
    public void postConstruct(){
        rnd = Math.random();
        LOGGER.info("PostConstruct Called For {} : {} ({})", new Object[]{getClass().getName(), rnd, webSession.getId()});
    }
    public String getValue(){
        return rnd.toString();
    }
}
