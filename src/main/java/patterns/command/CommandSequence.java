
package patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Sequence of Commands example.
 */
public class CommandSequence extends AbstractCommand {

    /** The sequence. */
    private final List<AbstractCommand> sequence = new ArrayList<>();

    /**
     * Append a new command.
     *
     * command
     *
     * @param command the command
     * @return true, if successful, otherwise false.
     */
    public boolean append(final AbstractCommand command) {
        return this.sequence.add(command);
    }

    /**
     * Adds an new Command at index.
     *
     * index element
     *
     * @param index the index
     * @param element the element
     */
    public void add(final int index, final AbstractCommand element) {
        this.sequence.add(index, element);
    }

    /**
     * command at index.
     *
     * index abstract command
     *
     * @param index the index
     * @return the abstract command
     */
    public AbstractCommand remove(final int index) {
        return this.sequence.remove(index);
    }

    /*
     * (non-Javadoc)
     * @see patterns.command.AbstractCommand#execute(patterns.command.
     * ParametersInterface)
     */
    @Override
    public ResultInterface execute(final ParametersInterface commandParameters) {
        this.result = new Result();
        for (final AbstractCommand command : this.sequence) {
            final ResultInterface newResult = command.execute(commandParameters);
            this.result.and(newResult);
        }
        return this.result;
    }

    /*
     * (non-Javadoc)
     * @see patterns.command.AbstractCommand#undo(patterns.command.
     * ParametersInterface)
     */
    @Override
    public ResultInterface undo(final ParametersInterface commandParameters) {
        for (final AbstractCommand command : this.sequence) {
            this.result = command.execute(commandParameters);
        }
        return this.result;
    }

}
