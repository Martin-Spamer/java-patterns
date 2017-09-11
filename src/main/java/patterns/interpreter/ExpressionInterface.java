
package patterns.interpreter;

/**
 * The ExpressionInterface Interface.
 */
public interface ExpressionInterface {

	/**
	 * Interpret.
	 *
	 * @param context the context
	 * @return true, if successful
	 */
	public boolean interpret(ContextInterface context);
}