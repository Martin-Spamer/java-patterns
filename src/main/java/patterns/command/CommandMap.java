package patterns.command;

import java.util.HashMap;

@SuppressWarnings("serial")
public class CommandMap extends HashMap<String, AbstractCommand> implements CommandInterface {

	public CommandInterface execute(final String actionName) {
		final AbstractCommand command = this.get(actionName);
		command.execute();
		return this;
	}

}
