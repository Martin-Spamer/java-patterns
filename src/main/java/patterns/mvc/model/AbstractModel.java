package patterns.mvc.model;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.ModelInterface;
import patterns.mvc.view.AbstractView;
import patterns.mvc.view.View;

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

	public void attach(String key, Model model) {
		this.models.put(key, model);
	}

	public void attach(String key, View view) {
		this.views.put(key, view);
	}

	public void detach(Model model) {
		this.models.remove(model);
	}

	public void detach(View view) {
		this.views.remove(view);
	}

}
