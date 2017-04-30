
package patterns.mvc;

/**
 * The ViewInterface Interface.
 */
public interface ViewInterface {

	/**
	 * Attach model.
	 *
	 * @param model the model
	 */
	public void attachModel(ModelInterface model);

	/**
	 * Detach model.
	 */
	public void detachModel();

}