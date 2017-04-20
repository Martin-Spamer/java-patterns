package patterns.bridge;

abstract class Abstraction {

	private final Implementor implementor;

	public Abstraction(Implementor implementor) {
		super();
		this.implementor = implementor;
	}

	public void operation() {
		implementor.operation();
	}

}
