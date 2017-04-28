
package patterns.command;

import java.util.ArrayList;
import java.util.List;

import patterns.mvc.controller.ResultInterface;

/**
 * The CommandSequence Class.
 */
public class CommandSequence extends AbstractCommand {

	private final List<AbstractCommand> sequence = new ArrayList<AbstractCommand>();
	private ResultInterface result;

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.AbstractCommand#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public CommandInterface execute(ParametersInterface commandParameters) {
		for (final AbstractCommand command : this.sequence) {
			final CommandInterface execute = command.execute(commandParameters);
			this.result = execute.result();
		}
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.AbstractCommand#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public CommandInterface undo(ParametersInterface commandParameters) {
		for (final AbstractCommand command : this.sequence) {
			final CommandInterface execute = command.execute(commandParameters);
			this.result = execute.result();
		}
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.command.AbstractCommand#result()
	 */
	@Override
	public ResultInterface result() {
		return this.result;
	}

}
