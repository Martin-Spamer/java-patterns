
package patterns.command;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CommandMap Class.
 */
@SuppressWarnings("serial")
public final class CommandMap extends HashMap<String, AbstractCommand> {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Execute.
	 *
	 * @param actionName the action name
	 * @return the command interface
	 */
	public CommandInterface execute(final String actionName) {
		if (actionName == null) {
		} else {
			final CommandInterface command = get(actionName);
			if (command == null) {
			} else {
				command.execute(null);
				return command;
			}
		}
		return null;
	}
}
