
package patterns.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.command.AbstractCommandFactory;
import patterns.command.MissingCommandException;
import patterns.mvc.ControllerInterface;
import patterns.mvc.ModelInterface;
import patterns.mvc.ViewInterface;

/**
 * An example abstract Controller class for the Model View Controller.
 */
public abstract class AbstractController implements ControllerInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** provides command instances. */
    protected AbstractCommandFactory commands = new AbstractCommandFactory();

    /** The Model. */
    protected ModelInterface model;

    /** The View. */
    protected ViewInterface view;

    /**
     * Default Constructor.
     */
    public AbstractController() {
        super();
        log.debug("AbstractController()");
    }

    /**
     * Default Constructor.
     *
     * @param model the model
     * @param view the view
     */
    public AbstractController(final ModelInterface model,
            final ViewInterface view) {
        super();
        log.debug("AbstractController({},{})", model, view);
        this.model = model;
        this.view = view;
    }

    /**
     * Attach a Model.
     *
     * @param model the model
     * @return the controller interface
     */
    @Override
    public ControllerInterface attachModel(final ModelInterface model) {
        log.debug("{}.attachModel({})", this.getClass().getSimpleName(), model);
        this.model = model;
        return this;
    }

    /**
     * Detach model.
     *
     * @return the controller interface
     */
    @Override
    public ControllerInterface detachModel() {
        log.debug("{}.detachModel({})", this.getClass().getSimpleName(), model);
        model = null;
        return this;
    }

    /**
     * Attach view.
     *
     * @param view the view
     * @return the controller interface
     */
    @Override
    public ControllerInterface attachView(final ViewInterface view) {
        log.debug("{}.attachView({})", this.getClass().getSimpleName(), view);
        this.view = view;
        return this;
    }

    /**
     * Detach view.
     *
     * @return the controller interface
     */
    @Override
    public ControllerInterface detachView() {
        log
            .debug("{}.detachView({},{})",
                    this.getClass().getSimpleName(),
                    model,
                    view);
        view = null;
        return this;
    }

    /**
     * Execute.
     *
     * @return the controller interface
     * @throws MissingCommandException the missing command exception
     */
    public ControllerInterface execute() throws MissingCommandException {
        log.debug("{}.execute()", this.getClass().getSimpleName());
        commands.execute();
        return this;
    }

    /**
     * Execute.
     *
     * @param commandName
     *            the command name
     * @return the abstract controller
     * @throws MissingCommandException
     *             the missing command exception
     */
    @Override
    public ControllerInterface execute(final String commandName)
            throws MissingCommandException {
        log
            .debug("{}.execute({})",
                    this.getClass().getSimpleName(),
                    commandName);
        commands.execute(commandName);
        return this;
    }

}
