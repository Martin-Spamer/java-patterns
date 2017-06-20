package patterns.interpreter;

/**
 * NonTerminalExpression Class.
 */
public class NonTerminalExpression extends AbstractExpression {

	public AbstractExpression abstractExpression;

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * patterns.interpreter.AbstractExpression#interpret(patterns.interpreter.
	 * ContextInterface)
	 */
	@Override
	public boolean interpret(final ContextInterface context) {
		return false;
	}

}
