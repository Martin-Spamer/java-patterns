
package patterns.visitor;

/**
 * AbstractElement Class.
 */
public abstract class AbstractElement implements ElementInterface {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.visitor.ElementInterface#accept(patterns.visitor.
	 * VisitorInterface)
	 */
	@Override
	public abstract void accept(VisitorInterface visitor);

}
