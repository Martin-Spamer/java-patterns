
package patterns.chain;

/**
 * The HandlerOne Class.
 */
public class HandlerOne extends Handler {

	/**
	 * Instantiates a new handler one.
	 */
	public HandlerOne() {
		super();
	}

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
	public HandlerOne handleRequest() {
		super.handleRequest();
		return this;
	}

}
