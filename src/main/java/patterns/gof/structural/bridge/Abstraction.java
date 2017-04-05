
package patterns.gof.structural.bridge;

/**
 * The Abstraction Class.
 */
abstract class Abstraction {

	/** The my implementor. */
	public Implementor myImplementor;

	/**
	 * Operation.
	 */
	abstract public void operation();

}