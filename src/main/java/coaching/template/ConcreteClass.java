package coaching.template;

/**
 * ConcreteClass Class.
 */
public final class ConcreteClass extends AbstractClass {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.behavioural.template_method.AbstractClass#
	 * primitiveOperationA()
	 */
	@Override
	public void primitiveOperationA() {
		this.log.info("primitiveOperationA()");
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.behavioural.template_method.AbstractClass#
	 * primitiveOperationB()
	 */
	@Override
	public void primitiveOperationB() {
		this.log.info("primitiveOperationA()");
	}

}
