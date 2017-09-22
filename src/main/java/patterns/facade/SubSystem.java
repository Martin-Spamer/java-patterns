
package patterns.facade;

import org.slf4j.*;

/**
 * class SubSystem.
 */
public class SubSystem {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Operation.
	 */
	public void operation() {
		log.info("%s.operation", toString());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s", this.getClass().getSimpleName());
	}

}
