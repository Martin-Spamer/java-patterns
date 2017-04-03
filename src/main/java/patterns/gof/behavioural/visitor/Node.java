
package patterns.gof.behavioural.visitor;

/**
 * The Class Node.
 */
abstract class Node {

	/**
	 * Accept.
	 *
	 * @param nodeVisitor the node visitor
	 */
	abstract public void accept(NodeVisitor nodeVisitor);
}