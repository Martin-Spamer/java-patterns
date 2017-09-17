
package patterns.interpreter;

/**
 * Terminal Expression Class.
 */
public class TerminalExpression extends AbstractExpression {

	/**
	 * Instantiates a new terminal expression.
	 *
	 * @param result the result
	 */
	public TerminalExpression(final boolean result) {
		super(true);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * patterns.interpreter.AbstractExpression#interpret(patterns.interpreter.
	 * ContextInterface)
	 */
	@Override
	public boolean interpret(final ContextInterface context) {
		return super.interpret(context);
	}

}
