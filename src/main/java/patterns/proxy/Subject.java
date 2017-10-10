
package patterns.proxy;

import org.slf4j.*;

/**
 * Subject Class.
 */
public abstract class Subject {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Request.
	 */
	public abstract void request();

}
