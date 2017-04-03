
package patterns.gof.structural.bridge;

/**
 * The Class Abstraction.
 */
abstract class Abstraction {

	/** The my implementor. */
	public Implementor myImplementor;

	/**
	 * Operation.
	 */
	abstract public void operation();

}