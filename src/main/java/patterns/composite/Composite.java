package patterns.composite;

import java.util.Vector;

class Composite extends Component {

	/** The composite. */
	public Vector<Component> composite;

	@Override
	public CompositeInterface add(Component component) {
		composite.add(component);
		return this;
	}

	@Override
	public CompositeInterface remove(CompositeInterface component) {
		composite.remove(component);
		return this;
	}

	@Override
	public CompositeInterface getChild(int index) {
		composite.get(index);
		return this;
	}

	@Override
	public CompositeInterface operation() {
		for (final Component component : composite) {
			component.operation();
		}
		return this;
	}

}
