package patterns.command;

public class CommandSequence extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

	@Override
	AbstractCommand undo() {
		return null;
	}

}