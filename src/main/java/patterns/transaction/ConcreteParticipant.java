

package patterns.transaction;

/**
 * Concrete Participant Class.
 */
public final class ConcreteParticipant extends AbstractParticipant {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.ajp.system.transaction.ParticipantInterfact#join()
	 */
	@Override
	public void join() {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.ajp.system.transaction.ParticipantInterfact#commit()
	 */
	@Override
	public void commit() {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.ajp.system.transaction.ParticipantInterfact#cancel()
	 */
	@Override
	public void cancel() {
		throw new UnsupportedOperationException();
	}

}
