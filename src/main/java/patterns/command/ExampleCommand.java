package patterns.command;

import patterns.mvc.controller.ResultInterface;

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
	public ResultInterface execute(ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(ParametersInterface commandParameters) {
		return super.undo(commandParameters);
	}

}
