/**
 * AbstractRule.java
 *
 * Created on 28 August 2003, 16:10
 */

package idioms.rules;

/**
 * The AbstractCommaAbstractRulend Class.
 */
public class AbstractRule implements CommandInterface {

	protected ContextInterface context = null;

	/**
	 * Instantiates a new abstract command.
	 */
	public AbstractRule(final ContextInterface context) {
		this.context = context;
	}

	@Override
	public void execute(final Parameters parameters) {
		final String className = this.getClass().getSimpleName();
		final String message = String.format("%s.execute(%s) must be declared", className, parameters);
		throw new UnsupportedOperationException(message);
	}

}
