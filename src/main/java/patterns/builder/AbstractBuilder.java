
package patterns.builder;

import org.slf4j.*;

/**
 * AbstractBuilder Class.
 */
public abstract class AbstractBuilder {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Builds the.
	 *
	 * part
	 *
	 * @return the part
	 */
	public abstract Part build();

}
