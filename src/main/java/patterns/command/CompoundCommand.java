package patterns.command;

public class CompoundCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return super.execute();
	}

	@Override
	public AbstractCommand undo() {
		return super.execute();
	}

}
