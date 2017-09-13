package patterns.composite;

import java.util.Vector;

/**
 * Composite Class.
 */
public class Composite extends Component {

	protected Vector<Component> composite = new Vector<Component>();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#add(patterns.composite.Component)
	 */
	@Override
	public ComponentInterface add(final Component component) {
		this.composite.add(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#remove(patterns.composite.Component)
	 */
	@Override
	public ComponentInterface remove(final Component component) {
		this.composite.remove(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#getChild(int)
	 */
	@Override
	public ComponentInterface getChild(final int index) {
		this.composite.get(index);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#operation()
	 */
	@Override
	public ComponentInterface operation() {
		for (final Component component : this.composite) {
			component.operation();
		}
		return this;
	}

}
