package patterns.command;

interface CommandInterface {

	abstract CommandInterface execute(ParametersInterface commandParameters);

	abstract CommandInterface undo(ParametersInterface commandParameters);

}
