
package patterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Subject Class.
 */
abstract class Subject {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Request.
	 */
	abstract public void request();

}
