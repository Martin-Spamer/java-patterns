package patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Sequence of Commands example.
 */
public class SequenceCommand extends AbstractCommand {

	private final List<AbstractCommand> sequence = new ArrayList<AbstractCommand>();

	/**
	 * Append a new command.
	 *
	 * @param the command to be appended
	 * @return true, if successful
	 */
	public boolean append(AbstractCommand command) {
		return this.sequence.add(command);
	}

	/**
	 * Adds an new Command at index.
	 *
	 * @param index the index
	 * @param element the element
	 */
	public void add(int index, AbstractCommand element) {
		this.sequence.add(index, element);
	}

	/**
	 * Removes the command at index.
	 *
	 * @param index the index
	 * @return the abstract command
	 */
	public AbstractCommand remove(int index) {
		return this.sequence.remove(index);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(ParametersInterface commandParameters) {
		this.result = new Result();
		for (final AbstractCommand command : this.sequence) {
			final ResultInterface newResult = command.execute(commandParameters);
			this.result.and(newResult);
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
			this.result = command.execute(commandParameters);
		}
		return this.result;
	}

}
