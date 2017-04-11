
package patterns.visitor;

/**
 * The Node Class.
 */
abstract class AbstractNode {

	/**
	 * Accept.
	 *
	 * @param nodeVisitor the node visitor
	 */
	abstract public void accept(AbstractNodeVisitor nodeVisitor);
}