
package patterns.gof.creational.factory;

/**
 * The ConcreteFactory2 Class.
 */
class ConcreteFactory2 extends AbstractFactory {

	/** The my concrete product A 1. */
	public ConcreteProductA1 myConcreteProductA1;

	/** The my concrete product A 2. */
	public ConcreteProductA2 myConcreteProductA2;

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