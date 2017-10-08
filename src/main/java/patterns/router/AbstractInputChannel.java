


package patterns.router;

import org.slf4j.*;

/**
 * Abstract Input Channel class.
 */
public abstract class AbstractInputChannel implements InputChannelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.router.InputChannelInterface#receiveMessage()
	 */
	@Override
	public Message receiveMessage() {
		log.info("{}.receiveMessage()", this.getClass().getSimpleName());
		return new Message();
	}

}
