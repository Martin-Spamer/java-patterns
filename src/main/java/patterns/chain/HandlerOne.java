package patterns.chain;

public class HandlerOne extends Handler {

	public HandlerOne() {
		super();
	}

	public HandlerOne(HandlerInterface next) {
		super(next);
	}

	@Override
	public HandlerOne handleRequest() {
		super.handleRequest();
		return this;
	}

}
