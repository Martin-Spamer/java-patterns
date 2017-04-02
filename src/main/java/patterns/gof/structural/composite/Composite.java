package patterns.gof.structural.composite;

import java.util.Vector;

class Composite extends Component {

	public Vector<Component> composite;

	public CompositeInterface add(Component component) {
		this.composite.add(component);
		return this;
	}

	public CompositeInterface remove(CompositeInterface component) {
		this.composite.remove(component);
		return this;
	}

	public CompositeInterface getChild(int index) {
		this.composite.get(index);
		return this;
	}

	public CompositeInterface operation() {
		for (final Component component : this.composite) {
			component.operation();
		}
		return this;
	}

}
