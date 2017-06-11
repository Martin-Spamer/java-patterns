package patterns.command;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CommandMap Class.
 *
 * When the Commands are expensive to construct borrow them from resource pool
 * and return when finished.
 */
@SuppressWarnings("serial")
public final class CommandMap extends HashMap<String, AbstractCommand> {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * Execute.
	 *
	 * @param actionName the action name
	 * @return the result interface
	 * @throws MissingCommandException
	 */
	public ResultInterface execute(final String actionName) throws MissingCommandException {
		if (actionName == null) {
			throw new RuntimeException("actionName cannot be null");
		} else {
			final CommandInterface command = get(actionName);
			if (command == null) {
				final String message = String.format("command %s not found", actionName);
				throw new MissingCommandException(message);
			} else {
				return command.execute(new Parameters());
			}
		}
	}
}
