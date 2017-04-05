package patterns.gof.behavioural.chain;

/**
 * The ConcreteHandlerOne Class.
 */
class FirstHandler extends Handler {

	public FirstHandler() {
		super();
	}

	/**
	 * Instantiates a new concrete handler one.
	 *
	 * @param next the next
	 */
	public FirstHandler(HandlerInterface next) {
		super(next);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.behavioural.chain.Handler#handleRequest()
	 */
	@Override
	public FirstHandler handleRequest() {
		super.handleRequest();
		return this;
	}

}
