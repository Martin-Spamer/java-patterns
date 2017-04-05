
package patterns.mvc.controller;

import java.util.ArrayList;
import java.util.Observable;
import java.util.concurrent.ConcurrentHashMap;

import patterns.mvc.ControllerInterface;
import patterns.mvc.model.AbstractModel;
import patterns.mvc.view.AbstractView;

/**
 * The AbstractController Class.
 */
public abstract class AbstractController extends Observable implements ControllerInterface {

	/** The commands. */
	protected ConcurrentHashMap<String, AbstractCommand> commands;

	/** The registered models. */
	protected ArrayList<AbstractModel> registeredModels;

	/** The registered views. */
	protected ArrayList<AbstractView> registeredViews;

	/**
	 * Instantiates a new abstract controller.
	 */
	public AbstractController() {
		commands = new ConcurrentHashMap<String, AbstractCommand>();
		registeredViews = new ArrayList<AbstractView>();
		registeredModels = new ArrayList<AbstractModel>();
	}

	/**
	 * Adds the model.
	 *
	 * @param model the model
	 */
	public void addModel(AbstractModel model) {
		registeredModels.add(model);
	}

	/**
	 * Removes the model.
	 *
	 * @param model the model
	 */
	public void removeModel(AbstractModel model) {
		registeredModels.remove(model);
	}

	/**
	 * Adds the view.
	 *
	 * @param view the view
	 */
	public void addView(AbstractView view) {
		registeredViews.add(view);
	}

	/**
	 * Removes the view.
	 *
	 * @param view the view
	 */
	public void removeView(AbstractView view) {
		registeredViews.remove(view);
	}

	/**
	 * Execute.
	 *
	 * @param context the context
	 * @return the result
	 */
	public Result execute(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Execute.
	 *
	 * @param command the command
	 * @param context the context
	 * @return the result
	 */
	public Result execute(String command, Context context) {
		getCommand(command).execute(context);
		return null;
	}

	/**
	 * Gets the command.
	 *
	 * @param command the command
	 * @return the command
	 */
	private AbstractCommand getCommand(String command) {
		return commands.get(command);
	}

}
