
package patterns.mvc.model;

import java.util.*;

import org.slf4j.*;

import patterns.mvc.ModelInterface;
import patterns.mvc.view.AbstractView;

/**
 * AbstractModel Class.
 */
public abstract class AbstractModel implements ModelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected final Map<String, AbstractModel> models = new HashMap<String, AbstractModel>();
	protected final Map<String, AbstractView> views = new HashMap<String, AbstractView>();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#attach(java.lang.String,
	 * patterns.mvc.model.AbstractModel)
	 */
	@Override
	public void attach(final String key, final AbstractModel model) {
		models.put(key, model);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#attach(java.lang.String,
	 * patterns.mvc.view.AbstractView)
	 */
	@Override
	public void attach(final String key, final AbstractView view) {
		views.put(key, view);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#detachModel(java.lang.String)
	 */
	@Override
	public void detachModel(final String key) {
		models.remove(key);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.mvc.ModelInterface#detachView(java.lang.String)
	 */
	@Override
	public void detachView(final String key) {
		views.remove(key);
	}

}
