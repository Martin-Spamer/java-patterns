package patterns.factory;

public interface FactoryInterface {

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the product A
	 */
	AbstractProductA createProductA();

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the product B
	 */
	AbstractProductB createProductB();

}