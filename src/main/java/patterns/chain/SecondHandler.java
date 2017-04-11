package patterns.chain;

class SecondHandler extends Handler {

	public SecondHandler() {
		super();
	}

	public SecondHandler(HandlerInterface next) {
		super(next);
	}

	@Override
	public SecondHandler handleRequest() {
		super.handleRequest();
		return this;
	}

}
