


package patterns.bridge;

import org.slf4j.*;

/**
 * AbstractImplementor Class.
 */
public abstract class AbstractImplementor {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Operation.
	 */
	abstract public void operation();

}
