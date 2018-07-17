
package patterns.mvc.controller;

import patterns.mvc.ControllerInterface;
import patterns.mvc.ModelInterface;
import patterns.mvc.ViewInterface;

/**
 * Example Controller class from the Model View Controller (MVC).
 */
public final class Controller extends AbstractController
        implements ControllerInterface {

    /**
     * The Constructor.
     */
    public Controller() {
        super();
        log.debug("Controller()");
    }

    /**
     * The Constructor.
     *
     * @param model the model
     * @param view the view
     */
    public Controller(final ModelInterface model, final ViewInterface view) {
        super(model, view);
        log.debug("Controller({},{})", model, view);
    }

}
