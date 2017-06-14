
package patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractProduct Class.
 */
public class AbstractProduct {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Instantiates a new abstract product.
	 */
	public AbstractProduct() {
		super();
	}

}