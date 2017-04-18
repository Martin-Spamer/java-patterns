package patterns.bridge;

class ImplementorB extends Implementor {

	@Override
	public void operation() {
		this.log.info("{}", this.getClass().getSimpleName());
	}

}
