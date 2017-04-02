package patterns.mvc.view;

import java.util.Observable;

import patterns.mvc.ViewInterface;
import patterns.mvc.model.Model;

public abstract class AbstractView extends Observable implements ViewInterface {

	private final Model model;

	public AbstractView(Model model) {
		super();
		this.model = model;
	}

}
