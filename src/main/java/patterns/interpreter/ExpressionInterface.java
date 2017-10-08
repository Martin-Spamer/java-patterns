


package patterns.interpreter;

/**
 * Expression Interface.
 */
public interface ExpressionInterface {

	/**
	 * interpret.
	 *
	 * @param context the context
	 * @return true, if successful, otherwise false.
	 */
	public boolean interpret(ContextInterface context);
}
