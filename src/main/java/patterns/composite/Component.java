package patterns.composite;

abstract class Component implements CompositeInterface {

	/**
	 * Add component to the composite.
	 *
	 * @param component the component
	 * @return the composite interface
	 */
	CompositeInterface add(Component component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Removes component from the composite.
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

	public CompositeInterface operation() {
		throw new UnsupportedOperationException();
	}

}
