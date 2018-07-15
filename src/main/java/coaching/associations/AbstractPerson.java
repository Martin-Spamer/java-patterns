
package coaching.associations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An abstract Person class.
 */
public abstract class AbstractPerson {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /**
     * execute.
     */
    public void execute() {
        log.info("{}.execute", this.getClass().getName());
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
