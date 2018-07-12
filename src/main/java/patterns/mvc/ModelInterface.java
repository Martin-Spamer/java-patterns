
package patterns.mvc;

import patterns.mvc.model.AbstractModel;
import patterns.mvc.view.AbstractView;

/**
 * Model Interface.
 */
public interface ModelInterface {

    /**
     * Attach.
     *
     * @param key            the key
     * @param model            the model
     * @return the model interface
     */
    ModelInterface attach(final String key, final AbstractModel model);

    /**
     * Attach.
     *
     * @param key            the key
     * @param view            the view
     * @return the model interface
     */
    ModelInterface attach(final String key, final AbstractView view);

    /**
     * Detach model.
     *
     * @param key            the key
     * @return the model interface
     */
    ModelInterface detachModel(final String key);

    /**
     * Detach view.
     *
     * @param key            the key
     * @return the model interface
     */
    ModelInterface detachView(final String key);

    /**
     * Update.
     *
     * @return the model interface
     */
    ModelInterface update();

    /**
     * Update.
     *
     * @param key the key
     * @param value the value
     * @return the model interface
     */
    ModelInterface update(String key, String value);

}
