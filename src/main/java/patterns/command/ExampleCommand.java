
package patterns.command;

/**
 * The ExampleCommand Class.
 */
public class ExampleCommand extends AbstractCommand {

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.AbstractCommand#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public CommandInterface execute(ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.AbstractCommand#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public CommandInterface undo(ParametersInterface commandParameters) {
		return super.undo(commandParameters);
	}

}
