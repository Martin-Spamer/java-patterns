package patterns.composite;

/**
 * Component Class.
 */
public abstract class Component implements ComponentInterface {

	/**
	 * Adds the.
	 *
	 * component
	 * component interface
	 *
	 * @param component the component
	 * @return the component interface
	 */
	public ComponentInterface add(final Component component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Removes the.
	 *
	 * component
	 * component interface
	 *
	 * @param component the component
	 * @return the component interface
	 */
	public ComponentInterface remove(final Component component) {
		throw new UnsupportedOperationException();
	}

	/**
	 * child.
	 *
	 * index
	 * child
	 *
	 * @param index the index
	 * @return the child
	 */
	public ComponentInterface getChild(final int index) {
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
