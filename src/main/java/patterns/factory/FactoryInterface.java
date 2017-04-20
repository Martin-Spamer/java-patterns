package patterns.factory;

public interface FactoryInterface {

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the product A
	 */
	public AbstractProductA createProductA();

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the product B
	 */
	public AbstractProductB createProductB();

}