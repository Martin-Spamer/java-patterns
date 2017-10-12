
package patterns.composite;

import java.util.*;

/**
 * Composite Class.
 */
public final class Composite extends AbstractComponent {

	private List<AbstractComponent> leaves = new ArrayList<AbstractComponent>();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#add(patterns.composite.Component)
	 */
	@Override
	public ComponentInterface add(final AbstractComponent component) {
		this.leaves.add(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#remove(patterns.composite.Component)
	 */
	@Override
	public ComponentInterface remove(final AbstractComponent component) {
		this.leaves.remove(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#getChild(int)
	 */
	@Override
	public ComponentInterface getChild(final int index) {
		this.leaves.get(index);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#operation()
	 */
	@Override
	public ComponentInterface operation() {
		for (final AbstractComponent component : this.leaves) {
			component.operation();
		}
		return this;
	}

}
