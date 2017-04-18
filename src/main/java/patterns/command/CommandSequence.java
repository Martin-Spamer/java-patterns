package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandSequence extends AbstractCommand {

	private final List<AbstractCommand> sequence = new ArrayList<AbstractCommand>();

	@Override
	public AbstractCommand execute() {
		for (final AbstractCommand command : this.sequence) {
			command.execute();
		}
		return this;
	}

	@Override
	public AbstractCommand undo() {
		for (final AbstractCommand command : this.sequence) {
			command.undo();
		}
		return this;
	}

}