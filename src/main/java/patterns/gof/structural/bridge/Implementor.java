
package patterns.gof.structural.bridge;

/**
 * The Implementor Class.
 */
abstract class Implementor {

	/** The my abstraction. */
	public Abstraction myAbstraction;

	/**
	 * Operation implementation.
	 */
	abstract public void operationImplementation();
}