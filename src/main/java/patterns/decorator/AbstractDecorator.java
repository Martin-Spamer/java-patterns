package patterns.decorator;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractDecorator extends AbstractComponent {

	private final List<AbstractComponent> components = new ArrayList<AbstractComponent>();

	public void attach(final AbstractComponent component) {
		this.components.add(component);
	}

	public void detach(final AbstractComponent component) {
		this.components.remove(component);
	}

	public void updateObservers() {
		for (final AbstractComponent component : this.components) {
			component.operation();
		}
	}

	@Override
	abstract public void operation();

}
