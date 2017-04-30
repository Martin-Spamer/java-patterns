
package patterns.visitor;

/**
 * The ElementInterface Interface.
 */
public interface ElementInterface {

	/**
	 * Accept.
	 *
	 * @param visitor the visitor
	 */
	void accept(VisitorInterface visitor);

}
