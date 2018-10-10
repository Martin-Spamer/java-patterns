
package coaching.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An AbstractLogging logging class.
 *
 * a protected logger can be used by any inheriting specialisation class.
 *
 * Each Class has its own logger, but uses this.getClass().getSimpleName() to
 * ensure polymorphic sub-classes always log under their name.
 *
 * logging layout formater (%F:%L) for click through in most IDEs.
 */
public abstract class AbstractLogging {

    /** Provides logging to sub-classes. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * Law of Demeter (Tell Don't Ask).
     */
    public void toLog() {
        log.info("{}.toLog() = {}", this.getClass().getSimpleName(), this);
    }

    /**
     * Law of Demeter (Tell Don't Ask).
     *
     * destination log
     *
     * @param destinationLog the destination log
     */
    public void logTo(final Logger destinationLog) {
        destinationLog.info("{}.logTo({})", this.getClass().getSimpleName(), destinationLog);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [...]", this.getClass().getSimpleName());
    }

}
