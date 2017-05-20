package patterns.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Handler Class.
 */
public abstract class AbstractHandler implements HandlerInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private HandlerInterface next;

	/**
	 * Instantiates a new abstract handler.
	 */
	public AbstractHandler() {
		super();
	}

	/**
	 * Instantiates a new handler.
	 *
	 * @param next the next
	 */
	public AbstractHandler(HandlerInterface next) {
		super();
		setNext(next);
	}

	/**
	 * Sets the next.
	 *
	 * @param next the next
	 * @return the handler
	 */
	public AbstractHandler setNext(HandlerInterface next) {
		this.next = next;
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.chain.HandlerInterface#handleRequest()
	 */
	@Override
	public void handleRequest(RequestInterface request) {
		next.handleRequest(request);
	}

}
