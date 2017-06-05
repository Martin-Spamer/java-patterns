
package idioms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A StaticLogging logging class.
 *
 * a static logger is common to all instances.
 *
 */
public final class StaticLogging {

	private static final Logger LOG = LoggerFactory.getLogger(StaticLogging.class);

	/**
	 * Logging using the Law of Demeter (Tell Don't Ask)
	 */
	public void toLog() {
		LOG.info("{}.toLog", this.getClass().getSimpleName());
	}

	/**
	 * Logging using the Law of Demeter (Tell Don't Ask)
	 */
	public void logTo(Logger destinationLog) {
		destinationLog.info("{}.logTo", this.getClass().getSimpleName());
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s [...]", this.getClass().getSimpleName());
	}

}
