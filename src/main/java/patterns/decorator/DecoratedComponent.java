package patterns.decorator;

class DecoratedComponent extends AbstractDecorator implements DecoratorInterface {

	@Override
	public AbstractComponent operation() {
		super.beforeOperation();

		log.info("{}.operation", this.getClass().getSimpleName());

		super.afterOperation();

		return this;
	}

}
