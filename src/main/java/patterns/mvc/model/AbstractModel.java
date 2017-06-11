package patterns.mvc.model;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.ModelInterface;
import patterns.mvc.view.AbstractView;

/**
 * The AbstractModel Class.
 */
public abstract class AbstractModel implements ModelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected final Map<String, AbstractModel> models = new HashMap<String, AbstractModel>();
	protected final Map<String, AbstractView> views = new HashMap<String, AbstractView>();

	/**
	 * Instantiates a new abstract model.
	 */
	public AbstractModel() {
		super();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#attach(java.lang.String,
	 * patterns.mvc.model.AbstractModel)
	 */
	@Override
	public void attach(final String key, final AbstractModel model) {
		this.models.put(key, model);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#attach(java.lang.String,
	 * patterns.mvc.view.AbstractView)
	 */
	@Override
	public void attach(final String key, final AbstractView view) {
		this.views.put(key, view);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#detachModel(java.lang.String)
	 */
	@Override
	public void detachModel(final String key) {
		this.models.remove(key);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#detachView(java.lang.String)
	 */
	@Override
	public void detachView(final String key) {
		this.views.remove(key);
	}

}
