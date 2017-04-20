package patterns.visitor;

public interface ElementInterface {

	/**
	 * Accept.
	 *
	 * @param nodeVisitor the node visitor
	 */
	void accept(VisitorInterface visitor);

}
