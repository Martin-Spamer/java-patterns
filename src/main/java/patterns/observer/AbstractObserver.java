
package patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * An asynchronous update interface for receiving notifications about Abstract
 * Abstract is constructed.
 */
@Slf4j
public abstract class AbstractObserver implements ObserverInterface {

    /** The log. */
    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /*
     * (non-Javadoc)
     * @see patterns.observer.ObserverInterface#updateObservers()
     */
    @Override
    public void updateObservers() {
        log.info("update notification received");
    }

}
