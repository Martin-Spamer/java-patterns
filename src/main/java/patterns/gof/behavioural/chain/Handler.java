
package patterns.gof.behavioural.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Handler Class.
 */
public abstract class Handler implements HandlerInterface {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private HandlerInterface next;

	/**
	 * Instantiates a new handler.
	 */
	public Handler() {
		super();
	}

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
	public Handler handleRequest() {
		next.handleRequest();
		return this;
	}

}
