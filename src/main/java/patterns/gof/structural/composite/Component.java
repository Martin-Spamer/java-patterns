
package patterns.gof.structural.composite;

/**
 * The Component Class.
 */
abstract class Component implements CompositeInterface {

	/**
	 * Adds the.
	 *
	 * @param component the component
	 * @return the composite interface
	 */
	CompositeInterface add(Component component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Removes the.
	 *
	 * @param component the component
	 * @return the composite interface
	 */
	CompositeInterface remove(CompositeInterface component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Gets the child.
	 *
	 * @param index the index
	 * @return the child
	 */
	CompositeInterface getChild(int index) {
		throw new UnsupportedOperationException();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.composite.CompositeInterface#operation()
	 */
	public CompositeInterface operation() {
		throw new UnsupportedOperationException();
	}

}
