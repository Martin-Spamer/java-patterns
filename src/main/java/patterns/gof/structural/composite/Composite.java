
package patterns.gof.structural.composite;

import java.util.Vector;

/**
 * The Class Composite.
 */
class Composite extends Component {

	/** The composite. */
	public Vector<Component> composite;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * patterns.gof.structural.composite.Component#add(patterns.gof.structural.
	 * composite.Component)
	 */
	@Override
	public CompositeInterface add(Component component) {
		composite.add(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.structural.composite.Component#remove(patterns.gof.
	 * structural.composite.CompositeInterface)
	 */
	@Override
	public CompositeInterface remove(CompositeInterface component) {
		composite.remove(component);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.structural.composite.Component#getChild(int)
	 */
	@Override
	public CompositeInterface getChild(int index) {
		composite.get(index);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.structural.composite.Component#operation()
	 */
	@Override
	public CompositeInterface operation() {
		for (final Component component : composite) {
			component.operation();
		}
		return this;
	}

}
