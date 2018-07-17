
package patterns.mvc;

import patterns.command.MissingCommandException;

/**
 * Controller Interface.
 */
public interface ControllerInterface {

    /**
     * Execute.
     *
     * @param commandName the command name
     * @return the controller interface
     * @throws MissingCommandException the missing command exception
     */
    ControllerInterface execute(final String commandName)
            throws MissingCommandException;

    /**
     * Detach view.
     *
     * @return the controller interface
     */
    ControllerInterface detachView();

    /**
     * Attach view.
     *
     * @param view the view
     * @return the controller interface
     */
    ControllerInterface attachView(final ViewInterface view);

    /**
     * Detach model.
     *
     * @return the controller interface
     */
    ControllerInterface detachModel();

    /**
     * Attach model.
     *
     * @param model the model
     * @return the controller interface
     */
    ControllerInterface attachModel(final ModelInterface model);

}
