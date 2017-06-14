
package patterns.interpreter;

import java.util.Vector;

/**
 * AbstractExpression Class.
 */
public abstract class AbstractExpression {

	public Vector<?> myNonTerminalExpression;

	/**
	 * Interpret.
	 *
	 * context
	 *
	 * @param context the context
	 */
	public void interpret(final ContextInterface context) {
	}

}
