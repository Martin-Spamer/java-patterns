package patterns.command;

public class ConditionalCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return super.execute();
	}

	@Override
	public AbstractCommand undo() {
		return super.execute();
	}

}
