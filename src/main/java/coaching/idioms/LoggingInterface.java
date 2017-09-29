package coaching.idioms;

import org.slf4j.Logger;

public interface LoggingInterface {

	/**
	 * Law of Demeter (Tell Don't Ask).
	 */
	void toLog();

	/**
	 * Law of Demeter (Tell Don't Ask).
	 *
	 * destination log
	 *
	 * @param destinationLog the destination log
	 */
	void logTo(Logger destinationLog);

}