
package patterns.router;

import org.slf4j.*;

/**
 * Route a Message, from the input channel to the output channel.
 */
class Route implements InputChannelInterface, OutputChannelInterface {
	private static final Logger LOG = LoggerFactory.getLogger(Route.class);
	private OutputChannelInterface outputChannel = null;
	private InputChannelInterface inputChannel = null;

	public Route(final OutputChannelInterface outputChannel, final InputChannelInterface inputChannel) {
		super();
		this.outputChannel = outputChannel;
		this.inputChannel = inputChannel;
	}

	@Override
	public void sendMessage(final Message message) {
		LOG.info("sendMessage{}", message);
		outputChannel.sendMessage(message);
	}

	@Override
	public Message receiveMessage() {
		LOG.info("receiveMessage{}");
		return inputChannel.receiveMessage();
	}

}
