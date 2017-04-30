
package patterns.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.command.CommandFactory;
import patterns.mvc.ControllerInterface;
import patterns.mvc.ModelInterface;
import patterns.mvc.ViewInterface;
import patterns.mvc.model.Model;
import patterns.mvc.view.View;

/**
 * The AbstractController Class.
 */
public abstract class AbstractController implements ControllerInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected CommandFactory commands;
	protected ModelInterface model;
	protected ViewInterface view;

	/**
	 * Instantiates a new abstract controller.
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
	 * @param commandName the command name
	 * @return the abstract controller
	 */
	public AbstractController execute(String commandName) {
		commands.execute(commandName);
		return this;
	}

}
