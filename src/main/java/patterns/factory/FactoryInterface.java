

package patterns.factory;

/**
 * FactoryInterface Interface.
 */
public interface FactoryInterface {

	/**
	 * product A.
	 *
	 * abstract product A
	 *
	 * @return the abstract product A
	 */
	public AbstractProductA createProductA();

	/**
	 * product B.
	 *
	 * abstract product B
	 *
	 * @return the abstract product B
	 */
	public AbstractProductB createProductB();

}