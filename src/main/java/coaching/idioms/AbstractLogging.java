
package coaching.idioms;

import org.slf4j.Logger;

import lombok.extern.slf4j.Slf4j;

/**
 * An example of using an abstract logging class.
 *
 * a protected logger can be used by any inheriting specialisation class.
 *
 * Each Class has its own logger, but uses this.getClass().getSimpleName() to
 * ensure polymorphic sub-classes always log under their own name.
 *
 * logging layout formater (%F:%L) for click through in most IDEs.
 */



@Slf4j
public abstract class AbstractLogging {

    /**
     * To log.
     */
    public void toLog() {
        log.info("the.{}.toLog", this.getClass().getSimpleName());
    }

    /**
     * Log to.
     *
     * @param destinationLog the destination log
     */
    public void logTo(final Logger destinationLog) {
        final String destinationLogName = destinationLog.getClass().getSimpleName();
        destinationLog.info("{}.log({})", destinationLogName, this);
    }

}
