package patterns.command;

public interface CommandInterface {

	abstract CommandInterface execute(ParametersInterface commandParameters);

	abstract CommandInterface undo(ParametersInterface commandParameters);

}
