package patterns.bridge;

public abstract class Abstraction {

	private final Implementor implementor;

	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}

	public void operation() {
		this.implementor.operation();
	}

}
