package patterns.command;

import java.util.ArrayList;
import java.util.List;

public class CommandSequence extends AbstractCommand {

	private final List<AbstractCommand> sequence = new ArrayList<AbstractCommand>();
	private CommandInterface result;

	@Override
	public AbstractCommand execute(ParametersInterface commandParameters) {
		for (final AbstractCommand command : this.sequence) {
			this.result = command.execute(commandParameters).result();
		}
		return this;
	}

	@Override
	public AbstractCommand undo(ParametersInterface commandParameters) {
		for (final AbstractCommand command : this.sequence) {
			this.result = command.execute(commandParameters).result();
		}
		return this;
	}

	@Override
	public CommandInterface result() {
		return this.result;
	}

}
