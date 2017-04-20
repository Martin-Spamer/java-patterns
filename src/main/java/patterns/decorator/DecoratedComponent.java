package patterns.decorator;

public class DecoratedComponent extends AbstractDecorator implements DecoratorInterface {

	@Override
	public AbstractComponent operation() {
		super.beforeOperation();

		this.log.info("{}.operation", this.getClass().getSimpleName());

		super.afterOperation();

		return this;
	}

}
