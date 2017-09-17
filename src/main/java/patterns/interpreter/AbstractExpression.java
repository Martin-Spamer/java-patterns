
package patterns.interpreter;

/**
 * An abstract Expression Class.
 */
public abstract class AbstractExpression {

	private boolean result;

	/**
	 * Instantiates a new abstract expression.
	 */
	public AbstractExpression() {
		super();
	}

	/**
	 * Instantiates a new abstract expression.
	 *
	 * @param result the result
	 */
	public AbstractExpression(final boolean result) {
		super();
		this.result = result;
	}

	/**
	 * Interpret.
	 *
	 * @param context the context
	 * @return true, if successful, otherwise false.
	 */
	public boolean interpret(final ContextInterface context) {
		return this.result;
	}

}
