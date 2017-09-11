
package coaching.polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractType Class.
 */
public abstract class AbstractType {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Operation.
	 *
	 * abstract type
	 *
	 * @return the abstract type
	 */
	public AbstractType operation() {
		log.info("{}.operation", this.getClass().getSimpleName());
		return this;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
