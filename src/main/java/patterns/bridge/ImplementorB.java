package patterns.bridge;

class ImplementorB extends Implementor {

	@Override
	public void operation() {
		log.info("{}", this.getClass().getSimpleName());
	}

}
