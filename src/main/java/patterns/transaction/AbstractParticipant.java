
package patterns.transaction;

/**
 * Abstract Participant class. https://en.wikipedia.org/wiki/ACID
 */
public abstract class AbstractParticipant implements ParticipantInterface {

    /**
     * The operation method must be implemented in the final class,
     * otherwise an UnsupportedOperationException will be thrown.
     *
     * @return the participant interface
     */
    public ParticipantInterface operation() {
        throw new UnsupportedOperationException();
    }

}
