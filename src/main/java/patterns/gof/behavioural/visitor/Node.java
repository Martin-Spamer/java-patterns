package patterns.gof.behavioural.visitor;

abstract class Node {

	abstract public void accept(NodeVisitor nodeVisitor);
}