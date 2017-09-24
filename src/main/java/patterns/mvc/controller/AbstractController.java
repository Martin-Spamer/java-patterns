


package patterns.mvc.controller;

import org.slf4j.*;

import patterns.command.*;
import patterns.mvc.*;
import patterns.mvc.model.Model;
import patterns.mvc.view.View;

/**
 * AbstractController Class.
 */
public abstract class AbstractController implements ControllerInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected CommandFactory commands;
	protected ModelInterface model;
	protected ViewInterface view;

	/**
	 * Instantiates a new abstract controller.
	 *
	 * exception
	 *
	 * @throws Exception the exception
	 */
	public AbstractController() throws Exception {
		commands = new CommandFactory();
		view = new View();
		model = new Model();
	}

	/**
	 * Attach model.
	 *
	 * model
	 *
	 * @param model the model
	 */
	public void attachModel(ModelInterface model) {
		this.model = model;
		view.attachModel(model);
	}

	/**
	 * Detach model.
	 */
	public void detachModel() {
		view.detachModel();
		model = null;
	}

	/**
	 * Attach view.
	 *
	 * view
	 *
	 * @param view the view
	 */
	public void attachView(ViewInterface view) {
		this.view = view;
	}

	/**
	 * Detach view.
	 */
	public void detachView() {
		view = null;
	}

	/**
	 * Execute.
	 *
	 * command name
	 * abstract controller
	 * missing command exception
	 *
	 * @param commandName the command name
	 * @return the abstract controller
	 * @throws MissingCommandException the missing command exception
	 */
	public AbstractController execute(String commandName) throws MissingCommandException {
		commands.execute(commandName);
		return this;
	}

}
