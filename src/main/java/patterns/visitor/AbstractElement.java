package patterns.visitor;

/**
 * Abstract Element Class.
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
