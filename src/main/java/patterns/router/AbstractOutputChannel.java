package patterns.router;

import org.slf4j.*;

public abstract class AbstractOutputChannel implements OutputChannelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Override
	public void sendMessage(final Message message) {
		this.log.info("{}.sendMessage({})", this.getClass().getSimpleName(), message);
	}

}
