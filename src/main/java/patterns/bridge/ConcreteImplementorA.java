package patterns.bridge;

class ConcreteImplementorA extends Implementor {

	@Override
	public void operation() {
		this.log.info("{}", this.getClass().getSimpleName());
	}

}
