package patterns.command;

class ConcreteCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

}
