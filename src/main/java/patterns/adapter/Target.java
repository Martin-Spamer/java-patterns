
package patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Target Class.
 */
public class Target implements TargetInterface {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /*
     * (non-Javadoc)
     *
     * @see patterns.adapter.TargetInterface#request()
     */
    @Override
    public Result request() {
        this.log.info("request");
        return new Result();
    }

}
