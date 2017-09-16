package patterns.interpreter;

import java.util.Vector;

/**
 * An abstract Expression Class.
 */
public abstract class AbstractExpression {

	public Vector<?> abstractExpression;

	/**
	 * Interpret.
	 *
	 * @param context the context
	 * @return true, if successful, otherwise false.
	 */
	public boolean interpret(final ContextInterface context) {
		return false;
	}

}
