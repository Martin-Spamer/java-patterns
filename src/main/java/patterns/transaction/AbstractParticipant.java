package patterns.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractParticipant Class.
 */
public abstract class AbstractParticipant implements ParticipantInterfact {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Operation 1.
	 */
	public void operation1() {
	}

	/**
	 * Operation 2.
	 */
	public void operation2() {
	}

}
