
package patterns.mvc;

/**
 * The Interface of View from the Model View Controller.
 */
public interface ViewInterface {

	/**
	 * Attach model to the view.
	 *
	 * @param model the model
	 */
	public void attachModel(ModelInterface model);

	/**
	 * Detach the model from the view.
	 */
	public void detachModel();

}