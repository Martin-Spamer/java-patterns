
package patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractState Class.
 */
public abstract class AbstractState {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * Handle.
     */
    public abstract void handle();

}
