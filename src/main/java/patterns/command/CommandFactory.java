package patterns.command;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandFactory implements CommandInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	private final Properties properties = new Properties();

	public CommandInterface execute(final String actionName) {
		final String className = this.properties.getProperty(actionName);
		AbstractCommand action;
		try {
			action = (AbstractCommand) Class.forName(className).newInstance();
			action.execute();
		} catch (final Exception e) {
			this.log.error(e.toString());
		}
		return this;
	}

}
