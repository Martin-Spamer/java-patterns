
package patterns.gof.creational.factory;

/**
 * The ConcreteFactory1 Class.
 */
class ConcreteFactory1 extends AbstractFactory {

	/** The my concrete product B 2. */
	public ConcreteProductB2 myConcreteProductB2;

	/** The my concrete product B 1. */
	public ConcreteProductB1 myConcreteProductB1;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.creational.factory.AbstractFactory#createProductA()
	 */
	@Override
	public AbstractProductA createProductA() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.creational.factory.AbstractFactory#createProductB()
	 */
	@Override
	public AbstractProductB createProductB() {
		return null;
	}
}