package patterns.bridge;

class ImplementorA extends Implementor {

	@Override
	public void operation() {
		log.info("{}", this.getClass().getSimpleName());
	}

}
