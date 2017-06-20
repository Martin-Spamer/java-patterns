
package patterns.interpreter;

import java.util.Vector;

/**
 * AbstractExpression Class.
 */
public abstract class AbstractExpression {

	public Vector<?> abstractExpression;

	/**
	 * Interpret.
	 *
	 * context
	 *
	 * @param context the context
	 * @return
	 */
	public boolean interpret(final ContextInterface context) {
		return false;
	}

}
