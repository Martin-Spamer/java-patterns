
package patterns.router;

/**
 * Route a Message, from the input channel to the output channel.
 */
class Route implements InputChannel, OutputChannel {
	private OutputChannel outputChannel = null;
	private InputChannel inputChannel = null;

	@Override
	public void sendMessage(final Message message) {
		this.outputChannel.sendMessage(message);
	}

	@Override
	public Message receiveMessage() {
		return this.inputChannel.receiveMessage();
	}

}
