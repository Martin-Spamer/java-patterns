
package patterns.chain;

/**
 * HandlerTwo Class.
 */
public class HandlerTwo extends AbstractHandler {

	/**
	 * Instantiates a new handler two.
	 */
	public HandlerTwo() {
		super();
	}

	/**
	 * Instantiates a new handler two.
	 *
	 * next
	 *
	 * @param next the next
	 */
	public HandlerTwo(HandlerInterface next) {
		super(next);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.chain.Handler#handleRequest()
	 */
	@Override
	public void handleRequest(RequestInterface request) {
		// do something
		// then pass request
		super.handleRequest(request);
	}

}
