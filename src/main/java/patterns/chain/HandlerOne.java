
package patterns.chain;

/**
 * The HandlerOne Class.
 */
public class HandlerOne extends AbstractHandler {

	/**
	 * Instantiates a new handler one.
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
