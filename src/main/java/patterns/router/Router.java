
package patterns.router;

/**
 * Router Class.
 */
class Router implements InputChannel, OutputChannel {

	private OutputChannel outputChannel;

	private InputChannel inputChannel;

	/**
	 * route.
	 */
	public void addRoute() {
	}

	/**
	 * route.
	 */
	public void removeRoute() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.router.OutputChannel#sendMessage(patterns.router.Message)
	 */
	@Override
	public void sendMessage(final Message message) {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.router.InputChannel#receiveMessage(patterns.router.Message)
	 */
	@Override
	public void receiveMessage(Message message) {
	}

}
