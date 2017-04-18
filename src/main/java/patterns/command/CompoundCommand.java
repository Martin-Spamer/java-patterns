package patterns.command;

public class CompoundCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

	@Override
	AbstractCommand undo() {
		// TODO Auto-generated method stub
		return null;
	}

}
