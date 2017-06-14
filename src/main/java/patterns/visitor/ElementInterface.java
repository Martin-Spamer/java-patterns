
package patterns.visitor;

/**
 * ElementInterface Interface.
 */
public interface ElementInterface {

	/**
	 * Accept.
	 *
	 * visitor
	 *
	 * @param visitor the visitor
	 */
	void accept(VisitorInterface visitor);

}
