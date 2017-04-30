
package patterns.composite;

/**
 * The Component Class.
 */
public abstract class Component implements ComponentInterface {

	/**
	 * Adds the.
	 *
	 * @param component the component
	 * @return the component interface
	 */
	public ComponentInterface add(Component component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Removes the.
	 *
	 * @param component the component
	 * @return the component interface
	 */
	public ComponentInterface remove(Component component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the child.
	 *
	 * @param index the index
	 * @return the child
	 */
	public ComponentInterface getChild(int index) {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.composite.ComponentInterface#operation()
	 */
	@Override
	public ComponentInterface operation() {
		throw new UnsupportedOperationException();
	}

}
