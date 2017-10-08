


package patterns.mvc;

/**
 * View Interface.
 */
public interface ViewInterface {

	/**
	 * view.
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
	public void show();

}
