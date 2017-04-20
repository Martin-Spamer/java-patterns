package patterns.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Handler implements HandlerInterface {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private HandlerInterface next;

	public Handler() {
		super();
	}

	public Handler(HandlerInterface next) {
		super();
		setNext(next);
	}

	public Handler setNext(HandlerInterface next) {
		this.next = next;
		return this;
	}

	@Override
	public Handler handleRequest() {
		next.handleRequest();
		return this;
	}

}
