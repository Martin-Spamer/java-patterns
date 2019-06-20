
package coaching.associations;

import lombok.extern.slf4j.Slf4j;

/**
 * An abstract Person class.
 */


/** The Constant 			log. */
@Slf4j
public abstract class AbstractPerson {

    /**
     * execute.
     */
    public void doWork() {
        log.info("{}.doWork", this.getClass().getName());
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
