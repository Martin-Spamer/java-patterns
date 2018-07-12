
package coaching.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A StaticLogging logging class.
 *
 * a static logger is common to all instances.
 *
 */
public final class StaticLogging {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(StaticLogging.class);

    /**
     * Law of Demeter (Tell Don't Ask).
     */
    public void toLog() {
        LOG.info("{}.toLog", this.getClass().getSimpleName());
    }

    /**
     * Law of Demeter (Tell Don't Ask).
     *
     * destination log
     *
     * @param destinationLog the destination log
     */
    public void logTo(final Logger destinationLog) {
        destinationLog.info("{}.logTo", this.getClass().getSimpleName());
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
