package patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractBuilder Class.
 */
public abstract class AbstractBuilder {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Builds the part.
	 *
	 * @return the part
	 */
	abstract Part build();

}
