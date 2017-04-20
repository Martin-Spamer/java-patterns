package patterns.decorator;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractDecorator extends AbstractComponent implements DecoratorInterface {

	private final List<AbstractComponent> beforeBehaviour = new ArrayList<AbstractComponent>();
	private final List<AbstractComponent> afterBehaviour = new ArrayList<AbstractComponent>();

	@Override
	public void attachBefore(AbstractComponent behaviour) {
		beforeBehaviour.add(behaviour);
	}

	@Override
	public void detachBefore(AbstractComponent behaviour) {
		beforeBehaviour.remove(behaviour);
	}

	@Override
	public void attachAfter(AbstractComponent behaviour) {
		afterBehaviour.add(behaviour);
	}

	@Override
	public void detachAfter(AbstractComponent behaviour) {
		afterBehaviour.remove(behaviour);
	}

	protected void beforeOperation() {
		for (final ComponentInterface component : beforeBehaviour) {
			component.operation();
		}
	}

	protected void afterOperation() {
		for (final ComponentInterface component : afterBehaviour) {
			component.operation();
		}
	}

}
