


package patterns.command;

/**
 * ConditionalCommand Class.
 */
public class ConditionalCommand extends AbstractCommand {

	private final boolean predicate = true;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(ParametersInterface commandParameters) {
		if (predicate()) {
			return super.execute(commandParameters);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

	/**
	 * Predicate.
	 *
	 * @return true, if successful
	 */
	private boolean predicate() {
		return predicate;
	}
}
