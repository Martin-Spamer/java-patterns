package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandSequence extends AbstractCommand {

	private final List<AbstractCommand> sequence = new ArrayList<AbstractCommand>();

	@Override
	public AbstractCommand execute(ParametersInterface commandParameters) {
		for (final AbstractCommand command : sequence) {
			command.execute(commandParameters);
		}
		return this;
	}

	@Override
	public AbstractCommand undo(ParametersInterface commandParameters) {
		for (final AbstractCommand command : sequence) {
			command.undo(commandParameters);
		}
		return this;
	}

}
