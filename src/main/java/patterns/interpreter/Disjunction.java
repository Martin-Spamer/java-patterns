package patterns.interpreter;

/**
 * Disjunction / OR Expression Class.
 */
public class Disjunction extends NonTerminalExpression {

	private AbstractExpression lhs = null;
	private AbstractExpression rhs = null;

	/**
	 * Instantiates a new or expression.
	 *
	 * @param lhs sub-expression on left hand side.
	 * @param rhs sub-expression on right hand side.
	 */
	public Disjunction(final AbstractExpression lhs, final AbstractExpression rhs) {
		super();
		this.lhs = lhs;
		this.rhs = rhs;
	}

	/* (non-Javadoc)
	 * @see patterns.interpreter.NonTerminalExpression#interpret(patterns.interpreter.ContextInterface)
	 */
	@Override
	public boolean interpret(final ContextInterface context) {
		return lhs.interpret(context) || rhs.interpret(context);
	}

}
