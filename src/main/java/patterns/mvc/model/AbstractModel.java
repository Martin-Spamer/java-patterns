
package patterns.mvc.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.ModelInterface;
import patterns.mvc.view.AbstractView;

/**
 * AbstractModel Class.
 */
public abstract class AbstractModel implements ModelInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** The models. */
    protected final Map<String, AbstractModel> models = new ConcurrentHashMap<>();

    /** The views. */
    protected final Map<String, AbstractView> views = new ConcurrentHashMap<>();

    /*
     * (non-Javadoc)
     * @see patterns.mvc.ModelInterface#attach(java.lang.String,
     * patterns.mvc.model.AbstractModel)
     */
    @Override
    public ModelInterface attach(final String key, final AbstractModel model) {
        models.put(key, model);
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.mvc.ModelInterface#attach(java.lang.String,
     * patterns.mvc.view.AbstractView)
     */
    @Override
    public ModelInterface attach(final String key, final AbstractView view) {
        views.put(key, view);
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.mvc.ModelInterface#update()
     */
    @Override
    public ModelInterface update() {
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.mvc.ModelInterface#update(java.lang.String,
     * java.lang.String)
     */
    @Override
    public ModelInterface update(final String key, final String value) {
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.mvc.ModelInterface#detachModel(java.lang.String)
     */
    @Override
    public ModelInterface detachModel(final String key) {
        models.remove(key);
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.mvc.ModelInterface#detachView(java.lang.String)
     */
    @Override
    public ModelInterface detachView(final String key) {
        views.remove(key);
        return this;
    }
}
