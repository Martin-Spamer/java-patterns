package patterns.chain;

class FirstHandler extends Handler {

	public FirstHandler() {
		super();
	}

	public FirstHandler(HandlerInterface next) {
		super(next);
	}

	@Override
	public FirstHandler handleRequest() {
		super.handleRequest();
		return this;
	}

}
