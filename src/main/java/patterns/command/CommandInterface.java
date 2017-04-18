package patterns.command;

interface CommandInterface {

	abstract CommandInterface execute();

	abstract CommandInterface undo();

}
