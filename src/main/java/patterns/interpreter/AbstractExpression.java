
package patterns.interpreter;

import java.util.Vector;

/**
 * The AbstractExpression Class.
 */
public abstract class AbstractExpression {

	public Vector<?> myNonTerminalExpression;

	/**
	 * Interpret.
	 *
	 * @param context the context
	 */
	public void interpret(final ContextInterface context) {
	}

}
