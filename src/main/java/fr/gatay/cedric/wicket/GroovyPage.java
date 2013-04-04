package fr.gatay.cedric.wicket;

import fr.gatay.cedric.wicket.groovy.panel.GSimpleLinkPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("/groovy")
public class GroovyPage<T> extends HomePage<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GroovyPage.class);

    public GroovyPage(final PageParameters parameters) {
        super(parameters);
    }

    protected void createLink(final String wicketId){
        add(new GSimpleLinkPanel(wicketId, Model.of("Test")));
    }


}
