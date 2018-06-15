
package patterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractMediator Class.
 */
public abstract class AbstractMediator implements MediatorInterface {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

}
