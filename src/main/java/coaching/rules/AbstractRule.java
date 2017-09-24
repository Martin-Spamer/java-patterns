/**
 * AbstractRule.java
 *
 * Created on 28 August 2003, 16:10
 */

package coaching.rules;

/**
 * AbstractCommaAbstractRulend Class.
 */
public abstract class AbstractRule implements CommandInterface {

	protected ContextInterface context = null;

	/**
	 * Instantiates a new abstract command.
	 *
	 * context
	 *
	 * @param context the context
	 */
	public AbstractRule(final ContextInterface context) {
		this.context = context;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * javamentor.rules.CommandInterface#execute(javamentor.rules.Parameters)
	 */
	@Override
	public void execute(final AbstractParameters parameters) {
		final String className = this.getClass().getSimpleName();
		final String message = String.format("%s.execute(%s) must be declared", className, parameters);
		throw new UnsupportedOperationException(message);
	}

}
