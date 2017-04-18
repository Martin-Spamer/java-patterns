package patterns.decorator;

class DecoratorB extends AbstractDecorator {

	@Override
	public void operation() {
		this.log.info("{}.operation", this.getClass().getSimpleName());
	}

}
