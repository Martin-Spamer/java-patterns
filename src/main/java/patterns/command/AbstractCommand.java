package patterns.command;

public abstract class AbstractCommand {

	public AbstractCommand execute() {
		return this;
	}

	AbstractCommand undo() {
		return this;
	}

}
