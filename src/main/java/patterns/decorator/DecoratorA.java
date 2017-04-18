package patterns.decorator;

class DecoratorA extends AbstractDecorator {

	@Override
	public void operation() {
		this.log.info("{}.operation", this.getClass().getSimpleName());
	}

}
