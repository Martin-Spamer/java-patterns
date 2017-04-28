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
 * An Abstract Controller class from the Model View Controller Pattern.
 */
public abstract class AbstractController implements ControllerInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected CommandFactory commands;
	protected ModelInterface model;
	protected ViewInterface view;

	/**
	 * Instantiates a new abstract controller.
	 * @throws Exception
	 */
	public AbstractController() throws Exception {
		this.commands = new CommandFactory();
		this.view = new View();
		this.model = new Model();
	}

	/**
	 * attach a model to the model manager.
	 *
	 * @param model the model
	 */
	public void attachModel(ModelInterface model) {
		this.model = model;
		this.view.attachModel(model);
	}

	/**
	 * Removes the model from the view.
	 *
	 */
	public void detachModel() {
		this.view.detachModel();
		this.model = null;
	}

	/**
	 * Add a view to the controller.
	 *
	 * @param view the view
	 */
	public void attachView(ViewInterface view) {
		this.view = view;
	}

	/**
	 * Removes a view from the controller.
	 *
	 * @param view the view
	 */
	public void detachView() {
		this.view = null;
	}

	/**
	 * Execute the command.
	 *
	 * @param command the command
	 * @param context the context
	 * @return
	 * @return the result
	 */
	public AbstractController execute(String commandName) {
		this.commands.execute(commandName);
		return this;
	}

}
