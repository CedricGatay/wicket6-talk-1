package fr.gatay.cedric.wicket;

import fr.gatay.cedric.wicket.scala.panel.SSimpleLinkPanel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.wicketstuff.annotation.mount.MountPath;

@MountPath("/scala")
public class ScalaPage<T> extends HomePage<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ScalaPage.class);

    public ScalaPage(final PageParameters parameters) {
        super(parameters);
    }

    protected void createLink(final String wicketId){
        add(new SSimpleLinkPanel(wicketId, Model.of("Test")));
    }


}
