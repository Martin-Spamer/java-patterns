


package patterns.factory;

/**
 * ConcreteFactoryTwo Class.
 */
class ConcreteFactoryTwo extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.factory.AbstractFactory#createProductA()
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.factory.AbstractFactory#createProductB()
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}

}
