package patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Observer Class.
 */
public abstract class AbstractObserver implements ObserverInterface {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/* (non-Javadoc)
	 * @see patterns.observer.ObserverInterface#updateObservers()
	 */
	@Override
	public void updateObservers() {
		this.log.info("update notification received");
	}

}
