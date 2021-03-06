
package coaching.delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Worker class.
 */
public class Worker implements ProcessInterface {

    /** The log. */
    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /*
     * (non-Javadoc)
     * @see delegation.ProcessInterface#doProcess()
     */
    @Override
    public Worker doProcess() {
        this.log.info("do work");
        return this;
    }

}
