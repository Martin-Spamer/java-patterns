package patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Observer Class.
 */
abstract class AbstractObserver {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public void updateObservers() {
		this.log.info("update notification received");
	}

}
