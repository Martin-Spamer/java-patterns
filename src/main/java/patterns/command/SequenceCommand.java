package patterns.command;

import java.util.ArrayList;
import java.util.List;

import patterns.mvc.controller.ResultInterface;

/**
 * The CommandSequence Class.
 */
public class SequenceCommand extends AbstractCommand {

	private final List<AbstractCommand> sequence = new ArrayList<AbstractCommand>();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(ParametersInterface commandParameters) {
		for (final AbstractCommand command : this.sequence) {
			this.result = command.execute(commandParameters);
		}
		return this.result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(ParametersInterface commandParameters) {
		for (final AbstractCommand command : this.sequence) {
			this.result = this.result.updateResult(command.execute(commandParameters));
		}
		return this.result;
	}

}