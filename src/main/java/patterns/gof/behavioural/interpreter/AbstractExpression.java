
package patterns.gof.behavioural.interpreter;

import java.util.Vector;

/**
 * The AbstractExpression Class.
 */
abstract class AbstractExpression {

	/** The my non terminal expression. */
	public Vector myNonTerminalExpression;

	/**
	 * Interpret.
	 *
	 * @param context the context
	 */
	public void interpret(final Context context) {
	}
}