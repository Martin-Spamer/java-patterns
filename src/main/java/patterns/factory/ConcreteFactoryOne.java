
package patterns.factory;

/**
 * The ConcreteFactoryOne Class.
 */
class ConcreteFactoryOne extends AbstractFactory {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.factory.AbstractFactory#createProductA()
	 */
	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.factory.AbstractFactory#createProductB()
	 */
	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}

}
