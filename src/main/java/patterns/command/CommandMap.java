package patterns.command;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class CommandMap extends HashMap<String, AbstractCommand> {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	public CommandInterface execute(final String actionName) {
		if (actionName == null) {
		} else {
			final CommandInterface command = this.get(actionName);
			if (command == null) {
			} else {
				command.execute(null);
				return command;
			}
		}
		return null;
	}
}
