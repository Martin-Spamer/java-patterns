



package patterns.command;

import java.util.*;

/**
 * Sequence of Commands example.
 */
public class SequenceCommand extends AbstractCommand {

	private final List<AbstractCommand> sequence = new ArrayList<AbstractCommand>();

	/**
	 * Append a new command.
	 *
	 * command
	 *
	 * @param command the command
	 * @return true, if successful
	 */
	public boolean append(AbstractCommand command) {
		return sequence.add(command);
	}

	/**
	 * Adds an new Command at index.
	 *
	 * index
	 * element
	 *
	 * @param index the index
	 * @param element the element
	 */
	public void add(int index, AbstractCommand element) {
		sequence.add(index, element);
	}

	/**
	 * command at index.
	 *
	 * index
	 * abstract command
	 *
	 * @param index the index
	 * @return the abstract command
	 */
	public AbstractCommand remove(int index) {
		return sequence.remove(index);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#execute(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface execute(ParametersInterface commandParameters) {
		result = new Result();
		for (final AbstractCommand command : sequence) {
			final ResultInterface newResult = command.execute(commandParameters);
			result.and(newResult);
		}
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.AbstractCommand#undo(patterns.command.
	 * ParametersInterface)
	 */
	@Override
	public ResultInterface undo(ParametersInterface commandParameters) {
		for (final AbstractCommand command : sequence) {
			result = command.execute(commandParameters);
		}
		return result;
	}

}
