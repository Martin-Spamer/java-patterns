
package patterns.mvc.view;

import java.util.Observable;

import patterns.mvc.ViewInterface;
import patterns.mvc.model.Model;

/**
 * The Class AbstractView.
 */
public abstract class AbstractView extends Observable implements ViewInterface {

	/** The model. */
	private final Model model;

	/**
	 * Instantiates a new abstract view.
	 *
	 * @param model the model
	 */
	public AbstractView(Model model) {
		super();
		this.model = model;
	}

}
