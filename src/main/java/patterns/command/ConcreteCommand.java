package patterns.command;

class ConcreteCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

	@Override
	AbstractCommand undo() {
		return this;
	}

}
