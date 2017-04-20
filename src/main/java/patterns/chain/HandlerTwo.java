package patterns.chain;

public class HandlerTwo extends Handler {

	public HandlerTwo() {
		super();
	}

	public HandlerTwo(HandlerInterface next) {
		super(next);
	}

	@Override
	public HandlerTwo handleRequest() {
		super.handleRequest();
		return this;
	}

}
