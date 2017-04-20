package patterns.decorator;

class DecoratedComponent extends AbstractDecorator implements DecoratorInterface {

	@Override
	public void operation() {
		super.beforeOperation();

		this.log.info("{}.operation", this.getClass().getSimpleName());

		super.afterOperation();
	}

}
