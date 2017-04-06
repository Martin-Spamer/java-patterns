package patterns.gof.behavioural.command;

interface CommandInterface {
	CommandInterface execute(final String actionName);
}
