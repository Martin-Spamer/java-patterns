
package patterns.gof.behavioural.interpreter;

/**
 * The NonTerminalExpression Class.
 */
class NonTerminalExpression extends AbstractExpression {

	/** The my abstract expression. */
	public AbstractExpression myAbstractExpression;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.gof.behavioural.interpreter.AbstractExpression#interpret(
	 * patterns.gof.behavioural.interpreter.Context)
	 */
	@Override
	public void interpret(final Context context) {
	}
}