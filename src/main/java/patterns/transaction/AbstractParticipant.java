
package patterns.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Participant Class.
 */
public abstract class AbstractParticipant implements ParticipantInterfact {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /**
     * Operation 1.
     */
    public void operation1() {
        throw new UnsupportedOperationException();
    }

    /**
     * Operation 2.
     */
    public void operation2() {
        throw new UnsupportedOperationException();
    }

}
