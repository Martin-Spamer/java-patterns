package patterns.command;

public class CompoundCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute() {
		return this;
	}

}
