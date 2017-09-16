
package patterns.router;

/**
 * Route a Message, from the input channel to the output channel.
 */
class Route implements InputChannel, OutputChannel {
	private final OutputChannel outputChannel = null;
	private final InputChannel inputChannel = null;

	@Override
	public void sendMessage(final Message message) {
		outputChannel.sendMessage(message);
	}

	@Override
	public Message receiveMessage() {
		return inputChannel.receiveMessage();
	}

}
