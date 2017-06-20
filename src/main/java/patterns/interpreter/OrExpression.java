package patterns.interpreter;

public class OrExpression extends NonTerminalExpression {

	private AbstractExpression expr1 = null;
	private AbstractExpression expr2 = null;

	public OrExpression(final AbstractExpression expr1, final AbstractExpression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpret(final ContextInterface context) {
		return this.expr1.interpret(context) || this.expr2.interpret(context);
	}

}
