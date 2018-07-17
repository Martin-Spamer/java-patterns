
package coaching.idioms;

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

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    public void toLog() {
        log.info("the.{}.toLog", this.getClass().getSimpleName());
    }

    public void logTo(final Logger destinationLog) {
        final String destinationLogName = destinationLog
            .getClass()
            .getSimpleName();
        destinationLog.info("{}.log({})", destinationLogName, this);
    }

}
