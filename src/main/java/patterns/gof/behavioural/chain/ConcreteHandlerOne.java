
package patterns.gof.behavioural.chain;

/**
 * The Class ConcreteHandlerOne.
 */
class ConcreteHandlerOne extends Handler {

	/**
	 * Instantiates a new concrete handler one.
	 *
	 * @param next the next
	 */
	public ConcreteHandlerOne(HandlerInterface next) {
		super(next);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.behavioural.chain.Handler#handleRequest()
	 */
	@Override
	public void handleRequest() {
	}

}