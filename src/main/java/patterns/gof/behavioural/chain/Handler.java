package patterns.gof.behavioural.chain;

public abstract class Handler implements HandlerInterface {

	private HandlerInterface next;

	public Handler(HandlerInterface next) {
		super();
		setNext(next);
	}

	public Handler setNext(HandlerInterface next) {
		this.next = next;
		return this;
	}

	abstract public void handleRequest();

}
