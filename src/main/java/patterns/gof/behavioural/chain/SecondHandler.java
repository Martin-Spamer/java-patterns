
package patterns.gof.behavioural.chain;

/**
 * The ConcreteHandlerTwo Class.
 */
class SecondHandler extends Handler {

	public SecondHandler() {
		super();
	}

	/**
	 * Instantiates a new concrete handler two.
	 *
	 * @param next the next
	 */
	public SecondHandler(HandlerInterface next) {
		super(next);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.behavioural.chain.Handler#handleRequest()
	 */
	@Override
	public SecondHandler handleRequest() {
		super.handleRequest();
		return this;
	}

}
