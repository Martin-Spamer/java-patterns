
package patterns.composite;

abstract class Component implements ComponentInterface {

	/**
	 * Add component to the composite.
	 *
	 * @param component the component
	 * @return the composite interface
	 */
	public ComponentInterface add(Component component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Removes component from the composite.
	 *
	 * @param component the component
	 * @return the composite interface
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

	@Override
	public ComponentInterface operation() {
		throw new UnsupportedOperationException();
	}

}
