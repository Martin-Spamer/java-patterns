package patterns.mvc.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.ModelInterface;
import patterns.mvc.ViewInterface;
import patterns.mvc.model.Model;

/**
 * The AbstractView Class.
 */
public abstract class AbstractView implements ViewInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected ModelInterface model = null;

	/**
	 * Instantiates a new abstract view.
	 */
	public AbstractView() {
		super();
		this.model = new Model();
	}

	@Override
	public void attachModel(ModelInterface model) {
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ViewInterface#detach()
	 */
	@Override
	public void detachModel() {
		this.model = null;
	}

	/**
	 * Show view.
	 */
	public abstract void showView();

}
