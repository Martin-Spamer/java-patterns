
package patterns.mvc.model;

import java.util.Observable;

import patterns.mvc.ModelInterface;

/**
 * The AbstractModel Class.
 */
public abstract class AbstractModel extends Observable implements ModelInterface {

	/**
	 * Instantiates a new abstract model.
	 */
	public AbstractModel() {
		super();
	}

}
