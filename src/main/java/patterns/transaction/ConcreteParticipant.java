
package patterns.transaction;

import lombok.extern.slf4j.Slf4j;

/**
 * Concrete Participant Class.
 */
@Slf4j
public final class ConcreteParticipant extends AbstractParticipant {

    /*
     * (non-Javadoc)
     * @see patterns.ajp.system.transaction.ParticipantInterfact#join()
     */
    @Override
    public ParticipantInterface join() {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * @see patterns.ajp.system.transaction.ParticipantInterfact#commit()
     */
    @Override
    public ParticipantInterface commit() {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * @see patterns.ajp.system.transaction.ParticipantInterfact#cancel()
     */
    @Override
    public ParticipantInterface cancel() {
        throw new UnsupportedOperationException();
    }

}
