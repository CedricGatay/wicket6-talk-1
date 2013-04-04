package fr.gatay.cedric.wicket.groovy.base
import org.apache.wicket.markup.html.link.StatelessLink

class GLink extends StatelessLink{
    private final Closure closure

    GLink(final String id, Closure closure) {
        super(id)
        this.closure = closure
    }

    @Override
    void onClick() {
        closure()
    }
}