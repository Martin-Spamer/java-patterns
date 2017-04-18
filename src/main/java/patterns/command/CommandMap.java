package patterns.command;

import java.util.HashMap;

@SuppressWarnings("serial")
public class CommandMap extends HashMap<String, AbstractCommand> {

	public CommandInterface execute(final String actionName) {
		final CommandInterface command = this.get(actionName);
		command.execute();
		return command;
	}

}
