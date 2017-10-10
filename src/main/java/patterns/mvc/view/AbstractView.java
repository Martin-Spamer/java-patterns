
package patterns.mvc.view;

import org.slf4j.*;

import patterns.mvc.*;
import patterns.mvc.model.Model;

/**
 * AbstractView Class.
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

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ViewInterface#attachModel(patterns.mvc.ModelInterface)
	 */
	@Override
	public void attachModel(final ModelInterface model) {
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

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.view.AbstractView#showView()
	 */
	@Override
	public void show() {
		this.log.info("{}.showView", this.getClass().getSimpleName());
	}

}
