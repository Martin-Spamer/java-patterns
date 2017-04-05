
package patterns.ajp.system.router;

/**
 * The Router Class.
 */
class Router implements InputChannel, OutputChannel {

	/** The my output channel. */
	public OutputChannel myOutputChannel;

	/** The my input channel. */
	public InputChannel myInputChannel;

	/**
	 * Adds the route.
	 */
	public void addRoute() {
	}

	/**
	 * Removes the route.
	 */
	public void removeRoute() {
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * patterns.ajp.system.router.OutputChannel#sendMessage(patterns.ajp.system.
	 * router.Message)
	 */
	public void sendMessage(final Message message) {
	}
}