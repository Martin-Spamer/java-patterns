
package patterns.gof.behavioural.chain;

/**
 * The Class Handler.
 */
public abstract class Handler implements HandlerInterface {

	/** The next. */
	private HandlerInterface next;

	/**
	 * Instantiates a new handler.
	 *
	 * @param next the next
	 */
	public Handler(HandlerInterface next) {
		super();
		setNext(next);
	}

	/**
	 * Sets the next.
	 *
	 * @param next the next
	 * @return the handler
	 */
	public Handler setNext(HandlerInterface next) {
		this.next = next;
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.behavioural.chain.HandlerInterface#handleRequest()
	 */
	abstract public void handleRequest();

}
