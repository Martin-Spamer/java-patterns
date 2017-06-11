
package patterns.mvc;

/**
 * The ViewInterface Interface.
 */
public interface ViewInterface {

	/**
	 * Attach model to the view.
	 *
	 * @param model the model
	 */
	public void attachModel(ModelInterface model);

	/**
	 * Detach model from view.
	 */
	public void detachModel();

	/**
	 * Show view.
	 */
	void show();

}
