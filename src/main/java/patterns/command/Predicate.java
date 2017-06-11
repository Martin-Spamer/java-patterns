package patterns.command;

public class Predicate implements CommandInterface {

	@Override
	public ResultInterface execute(ParametersInterface commandParameters) {
		return null;
	}

	@Override
	public ResultInterface undo(ParametersInterface commandParameters) {
		return null;
	}

	@Override
	public Boolean result() {
		return null;
	}

}
