package patterns.gof.behavioural.chain;

class ConcreteHandlerTwo extends Handler {

	public ConcreteHandlerTwo(HandlerInterface next) {
		super(next);
	}

	@Override
	public void handleRequest() {
	}

}