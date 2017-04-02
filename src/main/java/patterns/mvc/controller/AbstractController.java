package patterns.mvc.controller;

import java.util.ArrayList;
import java.util.Observable;
import java.util.concurrent.ConcurrentHashMap;

import patterns.mvc.ControllerInterface;
import patterns.mvc.model.AbstractModel;
import patterns.mvc.view.AbstractView;

public abstract class AbstractController extends Observable implements ControllerInterface {

	protected ConcurrentHashMap<String, AbstractCommand> commands;
	protected ArrayList<AbstractModel> registeredModels;
	protected ArrayList<AbstractView> registeredViews;

	public AbstractController() {
		this.commands = new ConcurrentHashMap<String, AbstractCommand>();
		this.registeredViews = new ArrayList<AbstractView>();
		this.registeredModels = new ArrayList<AbstractModel>();
	}

	public void addModel(AbstractModel model) {
		this.registeredModels.add(model);
	}

	public void removeModel(AbstractModel model) {
		this.registeredModels.remove(model);
	}

	public void addView(AbstractView view) {
		this.registeredViews.add(view);
	}

	public void removeView(AbstractView view) {
		this.registeredViews.remove(view);
	}

	public Result execute(Context context) {
		// TODO Auto-generated method stub
		return null;
	}

	public Result execute(String command, Context context) {
		getCommand(command).execute(context);
		return null;
	}

	private AbstractCommand getCommand(String command) {
		return this.commands.get(command);
	}

}
