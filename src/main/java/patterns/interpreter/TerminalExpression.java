package patterns.interpreter;

/**
 * TerminalExpression Class.
 */
public class TerminalExpression extends AbstractExpression {

	private Data data;

	public TerminalExpression(final Data data) {
		this.data = data;
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
		if (context.contains(this.data)) {
			return true;
		}
		return false;
	}

}
