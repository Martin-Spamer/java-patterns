package patterns.command;

import java.util.HashMap;
import java.util.Properties;

import javax.swing.AbstractAction;

@SuppressWarnings("serial")
public class CommandMap extends HashMap<String, AbstractAction> implements CommandInterface {

	private final Properties properties = new Properties();

	public CommandInterface execute(final String actionName) {
		final String className = properties.getProperty(actionName);
		try {
			final AbstractCommand action = (AbstractCommand) Class.forName(className).newInstance();
			action.execute();
		} catch (final InstantiationException e) {
			e.printStackTrace();
		} catch (final IllegalAccessException e) {
			e.printStackTrace();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		}
		return this;
	}

}
