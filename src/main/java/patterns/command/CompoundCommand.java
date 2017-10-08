
package patterns.command;

/**
 * Compound Command class.
 */
public class CompoundCommand extends AbstractCommand {

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(final ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(final ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

}
