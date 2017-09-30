
package patterns.observer;

import org.slf4j.*;

/**
 * An asynchronous update interface for receiving notifications about Abstract
 * Abstract is constructed.
 */
public abstract class AbstractObserver implements ObserverInterface {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.observer.ObserverInterface#updateObservers()
	 */
	@Override
	public void updateObservers() {
		log.info("update notification received");
	}

}
