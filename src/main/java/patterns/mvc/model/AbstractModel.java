
package patterns.mvc.model;

import java.util.Observable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.ModelInterface;

/**
 * The AbstractModel Class.
 */
public abstract class AbstractModel extends Observable implements ModelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Instantiates a new abstract model.
	 */
	public AbstractModel() {
		super();
	}

}
