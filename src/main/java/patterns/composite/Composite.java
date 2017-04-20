package patterns.composite;

import java.util.Vector;

public class Composite extends Component {

	/** The composite. */
	public Vector<Component> composite;

	@Override
	public ComponentInterface add(Component component) {
		this.composite.add(component);
		return this;
	}

	@Override
	public ComponentInterface remove(Component component) {
		this.composite.remove(component);
		return this;
	}

	@Override
	public ComponentInterface getChild(int index) {
		this.composite.get(index);
		return this;
	}

	@Override
	public ComponentInterface operation() {
		for (final Component component : this.composite) {
			component.operation();
		}
		return this;
	}

}
