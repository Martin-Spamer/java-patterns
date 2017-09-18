package patterns.router;

import org.slf4j.*;

public abstract class AbstractInputChannel implements InputChannelInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@Override
	public Message receiveMessage() {
		log.info("{}.receiveMessage()", this.getClass().getSimpleName());
		return new Message();
	}

}
