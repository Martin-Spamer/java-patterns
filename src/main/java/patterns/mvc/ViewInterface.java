
package patterns.mvc;

/**
 * View Interface.
 */
public interface ViewInterface {

    /**
     * view.
     *
     * @param model            the model
     * @return the view interface
     */
    ViewInterface attachModel(final ModelInterface model);

    /**
     * Detach model from view.
     *
     * @return the view interface
     */
    ViewInterface detachModel();

    /**
     * Show view.
     *
     * @return the view interface
     */
    ViewInterface show();

    /**
     * Show.
     *
     * @param model the model
     * @return the view interface
     */
    ViewInterface show(final ModelInterface model);

}
