

package patterns.mvc;

/**
 * ViewInterface Interface.
 */
public interface ViewInterface {

	/**
	 * view.
	 *
	 * model
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
