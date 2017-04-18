package patterns.decorator;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractDecorator extends AbstractComponent {

	private final List<AbstractComponent> components = new ArrayList<AbstractComponent>();

	public void attach(final AbstractComponent component) {
		this.components.add(component);
	}

	public void detach(final ComponentInterface component) {
		this.components.remove(component);
	}

	@Override
	public void operation() {
		for (final ComponentInterface component : this.components) {
			component.operation();
		}
	}
}
