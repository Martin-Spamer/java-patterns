
package patterns.bridge;

/**
 * Abstraction Class.
 */
public abstract class Abstraction {

	private final AbstractImplementor implementor;

	/**
	 * Instantiates a new abstraction.
	 *
	 * implementor
	 *
	 * @param implementor the implementor
	 */
	public Abstraction(AbstractImplementor implementor) {
		super();
		this.implementor = implementor;
	}

	/**
	 * Operation.
	 */
	public void operation() {
		implementor.operation();
	}

}
