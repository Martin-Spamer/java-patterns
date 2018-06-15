
package coaching.idioms;

import org.slf4j.Logger;

/**
 * interface LoggingInterface.
 */
public interface LoggingInterface {

	/**
	 * Law of Demeter (Tell Don't Ask).
	 */
	public void toLog();

	/**
	 * Law of Demeter (Tell Don't Ask).
	 *
	 * destination log
	 *
	 * @param destinationLog
	 *            the destination log
	 */
	public void logTo(final Logger destinationLog);

}
