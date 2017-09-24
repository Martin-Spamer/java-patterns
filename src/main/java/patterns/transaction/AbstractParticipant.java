

package patterns.transaction;

import org.slf4j.*;

/**
 * Abstract Participant Class.
 */
public abstract class AbstractParticipant implements ParticipantInterfact {

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
