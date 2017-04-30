
package patterns.chain;

/**
 * The HandlerTwo Class.
 */
public class HandlerTwo extends Handler {

	/**
	 * Instantiates a new handler two.
	 */
	public HandlerTwo() {
		super();
	}

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
	public HandlerTwo handleRequest() {
		super.handleRequest();
		return this;
	}

}
