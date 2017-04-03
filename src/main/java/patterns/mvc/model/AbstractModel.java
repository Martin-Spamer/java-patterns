
package patterns.mvc.model;

import java.util.Observable;

import patterns.mvc.ModelInterface;

/**
 * The Class AbstractModel.
 */
public abstract class AbstractModel extends Observable implements ModelInterface {

	/**
	 * Instantiates a new abstract model.
	 */
	public AbstractModel() {
		super();
	}

}
