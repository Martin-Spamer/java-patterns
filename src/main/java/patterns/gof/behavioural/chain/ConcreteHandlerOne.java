package patterns.gof.behavioural.chain;

class ConcreteHandlerOne extends Handler {

	public ConcreteHandlerOne(HandlerInterface next) {
		super(next);
	}

	@Override
	public void handleRequest() {
	}

}