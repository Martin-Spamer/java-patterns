
package patterns.factory;

/**
 * Factory Interface.
 */
public interface FactoryInterface {

	/**
	 * product A.
	 *
	 * abstract product A
	 *
	 * @return the abstract product A
	 */
	public AbstractProductAlpha createProductA();

	/**
	 * product B.
	 *
	 * abstract product B
	 *
	 * @return the abstract product B
	 */
	public AbstractProductBeta createProductB();

}