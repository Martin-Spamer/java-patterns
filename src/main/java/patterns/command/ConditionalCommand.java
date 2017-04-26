package patterns.command;

public class ConditionalCommand extends AbstractCommand {

	@Override
	public CommandInterface execute(ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

	@Override
	public CommandInterface undo(ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

	@Override
	public CommandInterface result() {
		// TODO Auto-generated method stub
		return null;
	}

}
