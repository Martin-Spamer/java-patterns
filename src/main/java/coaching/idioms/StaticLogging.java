
package coaching.idioms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An example of using a static logging class.
 *
 * a static logger is common to all instances.
 *
 */
public final class StaticLogging {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(StaticLogging.class);

    /**
     * Law of Demeter (Tell Don't Ask).
     */
    public void toLog() {
        LOG.info("{}.toLog", this.getClass().getSimpleName());
    }

}
