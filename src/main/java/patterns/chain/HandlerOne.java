
package patterns.chain;

/**
 * HandlerOne Class.
 */
public class HandlerOne extends AbstractHandler {

	/**
	 * Instantiates a new handler one.
	 */
	public HandlerOne() {
		super();
	}

	/**
	 * Instantiates a new handler one.
	 *
	 * next
	 *
	 * @param next the next
	 */
	public HandlerOne(HandlerInterface next) {
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
