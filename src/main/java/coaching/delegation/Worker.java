
package coaching.delegation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Worker class.
 */
@Slf4j
public class Worker implements ProcessInterface {

    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /*
     * (non-Javadoc)
     * @see delegation.ProcessInterface#doProcess()
     */
    @Override
    public Worker doProcess() {
        log.info("do work");
        return this;
    }

}
