
package patterns.visitor;

/**
 * Element Interface.
 */
public interface ElementInterface {

	/**
	 * Accept visitor.
	 *
	 * @param visitor the visitor
	 */
	public void accept(final VisitorInterface visitor);

}
