
package patterns.command;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

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
	 * @return the result interface
	 */
	public ResultInterface execute(final String actionName) {
		if (actionName == null) {
			throw new RuntimeException("actionName cannot be null");
		} else {
			final CommandInterface command = get(actionName);
			if (command == null) {
				final String message = String.format("command %s not found", actionName);
				throw new RuntimeException(message);
			} else {
				return command.execute(null);
			}
		}
	}
}
