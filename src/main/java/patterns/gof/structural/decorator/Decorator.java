
package patterns.gof.structural.decorator;

/**
 * The Decorator Class.
 */
abstract class Decorator extends AbstractComponent {

	/** The my abstract component. */
	public AbstractComponent myAbstractComponent;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.structural.decorator.AbstractComponent#operation()
	 */
	@Override
	abstract public void operation();
}