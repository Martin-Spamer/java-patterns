
package patterns.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * The AbstractDecorator Class.
 */
public abstract class AbstractDecorator extends AbstractComponent implements DecoratorInterface {

	private final List<AbstractComponent> beforeBehaviour = new ArrayList<AbstractComponent>();
	private final List<AbstractComponent> afterBehaviour = new ArrayList<AbstractComponent>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * patterns.decorator.DecoratorInterface#attachBefore(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void attachBefore(AbstractComponent behaviour) {
		beforeBehaviour.add(behaviour);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * patterns.decorator.DecoratorInterface#detachBefore(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void detachBefore(AbstractComponent behaviour) {
		beforeBehaviour.remove(behaviour);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * patterns.decorator.DecoratorInterface#attachAfter(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void attachAfter(AbstractComponent behaviour) {
		afterBehaviour.add(behaviour);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * patterns.decorator.DecoratorInterface#detachAfter(patterns.decorator.
	 * AbstractComponent)
	 */
	@Override
	public void detachAfter(AbstractComponent behaviour) {
		afterBehaviour.remove(behaviour);
	}

	/**
	 * Before operation.
	 */
	protected void beforeOperation() {
		for (final ComponentInterface component : beforeBehaviour) {
			component.operation();
		}
	}

	/**
	 * After operation.
	 */
	protected void afterOperation() {
		for (final ComponentInterface component : afterBehaviour) {
			component.operation();
		}
	}

}
