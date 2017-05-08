package patterns.chain;

/**
 * The HandlerTwo Class.
 */
public class HandlerTwo extends AbstractHandler {

	/**
	 * Instantiates a new handler two.
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
		super.handleRequest(request);
	}

}
