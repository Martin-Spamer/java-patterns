
package patterns.mvc.view;

import patterns.mvc.ModelInterface;
import patterns.mvc.ViewInterface;

/**
 * An example View class from the Model View Controller (MVC).
 */
public class View extends AbstractView implements ViewInterface {

    /*
     * (non-Javadoc)
     * @see patterns.mvc.view.AbstractView#showView()
     */
    @Override
    public ViewInterface show() {
        log.info("{}.showView", this.getClass().getSimpleName());
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.mvc.ViewInterface#show(patterns.mvc.ModelInterface)
     */
    @Override
    public ViewInterface show(final ModelInterface model) {
        log
            .info("{}.showView({})", this.getClass().getSimpleName(), model);
        return this;
    }
}
