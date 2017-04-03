
package patterns.gof.creational.factory;

/**
 * A factory for creating Abstract objects.
 */
public abstract class AbstractFactory {

	/** The my client. */
	public ClientTest myClient;

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the abstract product A
	 */
	public AbstractProductA createProductA() {
		return null;
	}

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the abstract product B
	 */
	public AbstractProductB createProductB() {
		return null;
	}

}
