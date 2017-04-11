package patterns.factory;

/**
 * A factory for creating objects.
 */
public abstract class AbstractFactory {

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the abstract product A
	 */
	public abstract AbstractProductA createProductA();

	/**
	 * Creates a new Abstract object.
	 *
	 * @return the abstract product B
	 */
	public abstract AbstractProductB createProductB();

}
