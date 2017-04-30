
package patterns.factory;

/**
 * The FactoryInterface Interface.
 */
public interface FactoryInterface {

	/**
	 * Creates the product A.
	 *
	 * @return the abstract product A
	 */
	public AbstractProductA createProductA();

	/**
	 * Creates the product B.
	 *
	 * @return the abstract product B
	 */
	public AbstractProductB createProductB();

}