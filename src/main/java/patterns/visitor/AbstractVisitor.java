
package patterns.visitor;

/**
 * AbstractVisitor Class.
 */
public abstract class AbstractVisitor implements VisitorInterface {

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * patterns.visitor.VisitorInterface#visit(patterns.visitor.AbstractElement)
	 */
	@Override
	public abstract void visit(final ElementInterface element);

}
