
package patterns.bridge;

/**
 * The Implementor Class.
 */
public class Implementor extends AbstractImplementor {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.bridge.AbstractImplementor#operation()
	 */
	@Override
	public void operation() {
		log.info("{}", this.getClass().getSimpleName());
	}

}
