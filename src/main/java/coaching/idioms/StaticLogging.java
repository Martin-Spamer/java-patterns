
package coaching.idioms;

import lombok.extern.slf4j.Slf4j;

/**
 * An example of using a static logging class.
 *
 * a static logger is common to all instances.
 *
 */



@Slf4j
public final class StaticLogging {

    /**
     * Law of Demeter (Tell Don't Ask).
     */
    public void toLog() {
        log.info("{}.toLog", this.getClass().getSimpleName());
    }

}
