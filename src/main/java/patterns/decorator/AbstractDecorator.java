
package patterns.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstractDecorator Class.
 */
public abstract class AbstractDecorator extends AbstractComponent implements DecoratorInterface {

	private final List<AbstractComponent> beforeBehaviour = new ArrayList<AbstractComponent>();
	private final List<AbstractComponent> afterBehaviour = new ArrayList<AbstractComponent>();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.decorator.DecoratorInterface#attachBefore(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void attachBefore(final AbstractComponent behaviour) {
		this.beforeBehaviour.add(behaviour);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.decorator.DecoratorInterface#detachBefore(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void detachBefore(final AbstractComponent behaviour) {
		this.beforeBehaviour.remove(behaviour);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.decorator.DecoratorInterface#attachAfter(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void attachAfter(final AbstractComponent behaviour) {
		this.afterBehaviour.add(behaviour);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.decorator.DecoratorInterface#detachAfter(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void detachAfter(final AbstractComponent behaviour) {
		this.afterBehaviour.remove(behaviour);
	}

	/**
	 * Before operation.
	 */
	protected void beforeOperation() {
		for (final ComponentInterface component : this.beforeBehaviour) {
			component.operation();
		}
	}

	/**
	 * After operation.
	 */
	protected void afterOperation() {
		for (final ComponentInterface component : this.afterBehaviour) {
			component.operation();
		}
	}
}
