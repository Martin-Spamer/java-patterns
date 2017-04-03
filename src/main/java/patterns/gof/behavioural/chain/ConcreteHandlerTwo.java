
package patterns.gof.behavioural.chain;

/**
 * The Class ConcreteHandlerTwo.
 */
class ConcreteHandlerTwo extends Handler {

	/**
	 * Instantiates a new concrete handler two.
	 *
	 * @param next the next
	 */
	public ConcreteHandlerTwo(HandlerInterface next) {
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