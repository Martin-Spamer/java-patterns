
package patterns.transaction;

/**
 * Abstract Participant class. https://en.wikipedia.org/wiki/ACID
 */
public abstract class AbstractParticipant implements ParticipantInterface {

    /**
     * Operation One, must be implemented in the final class, otherwise will
     * throw an UnsupportedOperationException.
     *
     * @return the participant interface
     */
    public ParticipantInterface operation1() {
        throw new UnsupportedOperationException();
    }

    /**
     * Operation Two, must be implemented in the final class, otherwise will
     * throw an UnsupportedOperationException.
     *
     * @return the participant interface
     */
    public ParticipantInterface operation2() {
        throw new UnsupportedOperationException();
    }

}
