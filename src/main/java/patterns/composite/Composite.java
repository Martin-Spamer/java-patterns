package patterns.composite;

import java.util.Vector;

class Composite extends Component {

	/** The composite. */
	public Vector<Component> composite;

	@Override
	public ComponentInterface add(Component component) {
		composite.add(component);
		return this;
	}

	@Override
	public ComponentInterface remove(Component component) {
		composite.remove(component);
		return this;
	}

	@Override
	public ComponentInterface getChild(int index) {
		composite.get(index);
		return this;
	}

	@Override
	public ComponentInterface operation() {
		for (final Component component : composite) {
			component.operation();
		}
		return this;
	}

}
