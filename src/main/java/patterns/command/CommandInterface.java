package patterns.command;

interface CommandInterface {
	CommandInterface execute(final String actionName);
}
