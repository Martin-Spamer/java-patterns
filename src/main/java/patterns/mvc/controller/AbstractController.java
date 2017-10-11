

package patterns.mvc.controller;

import org.slf4j.*;

import patterns.command.*;
import patterns.mvc.*;

/**
 * AbstractController Class.
 */
public abstract class AbstractController implements ControllerInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected CommandFactory commands = new CommandFactory();
	protected ModelInterface model;
	protected ViewInterface view;

	/**
	 * Attach model.
	 *
	 * @param model the model
	 */
	public void attachModel(final ModelInterface model) {
		this.model = model;
	}

	/**
	 * Detach model.
	 */
	public void detachModel() {
		this.model = null;
	}

	/**
	 * Attach view.
	 *
	 * @param view the view
	 */
	public void attachView(final ViewInterface view) {
		this.view = view;
	}

	/**
	 * Detach view.
	 */
	public void detachView() {
		this.view = null;
	}

	/**
	 * Execute.
	 *
	 * @param commandName the command name
	 * @return the abstract controller
	 * @throws MissingCommandException the missing command exception
	 */
	public AbstractController execute(final String commandName) throws MissingCommandException {
		this.commands.execute(commandName);
		return this;
	}

}
