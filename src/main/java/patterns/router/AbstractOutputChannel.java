
package patterns.router;

import org.slf4j.*;

/**
 * class AbstractOutputChannel.
 */
public abstract class AbstractOutputChannel implements OutputChannelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.router.OutputChannelInterface#sendMessage(patterns.router.
	 * Message)
	 */
	@Override
	public void sendMessage(final Message message) {
		log.info("{}.sendMessage({})", this.getClass().getSimpleName(), message);
	}

}
