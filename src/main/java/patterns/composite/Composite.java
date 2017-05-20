
package patterns.composite;

import java.util.Vector;

/**
 * The Composite Class.
 */
public class Composite extends Component {

	protected Vector<Component> composite = new Vector<Component>();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#add(patterns.composite.Component)
	 */
	@Override
	public ComponentInterface add(Component component) {
		composite.add(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#remove(patterns.composite.Component)
	 */
	@Override
	public ComponentInterface remove(Component component) {
		composite.remove(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#getChild(int)
	 */
	@Override
	public ComponentInterface getChild(int index) {
		composite.get(index);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.composite.Component#operation()
	 */
	@Override
	public ComponentInterface operation() {
		for (final Component component : composite) {
			component.operation();
		}
		return this;
	}

}
