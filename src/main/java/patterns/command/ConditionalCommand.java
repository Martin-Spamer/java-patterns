
package patterns.command;

import patterns.mvc.controller.ResultInterface;

/**
 * The ConditionalCommand Class.
 */
public class ConditionalCommand extends AbstractCommand {

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
		return super.execute(commandParameters);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.AbstractCommand#result()
	 */
	@Override
	public ResultInterface result() {
		return super.result();
	}

}
