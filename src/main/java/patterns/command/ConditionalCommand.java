package patterns.command;

public class ConditionalCommand extends AbstractCommand {

	@Override
	public AbstractCommand execute(ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

	@Override
	public AbstractCommand undo(ParametersInterface commandParameters) {
		return super.execute(commandParameters);
	}

}
