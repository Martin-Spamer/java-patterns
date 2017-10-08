


package patterns.chain;

import org.slf4j.*;

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
	 * next
	 *
	 * @param next the next
	 */
	public AbstractHandler(HandlerInterface next) {
		super();
		setNext(next);
	}

	/**
	 * next.
	 *
	 * next
	 * handler
	 *
	 * @param next the next
	 * @return the abstract handler
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
