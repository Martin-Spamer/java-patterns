package patterns.command;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandFactory implements InvokerInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Properties properties;

	public CommandFactory() throws Exception {
		super();
		properties = new Properties();
		properties.load(inputStream("commands.properties"));
		log.info("properties = {}", properties);
	}

	public CommandFactory(final String filename) throws Exception {
		super();
		properties = new Properties();
		properties.load(inputStream(filename));
		log.info("properties = {}", properties);
	}

	public CommandFactory(final Properties properties) {
		super();
		this.properties = properties;
		log.info("properties = {}", this.properties);
	}

	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	@Override
	public CommandInterface execute(final String actionName) {
		final String className = properties.getProperty(actionName);
		AbstractCommand action;
		try {
			action = (AbstractCommand) Class.forName(className).newInstance();
			return action.execute(null);
		} catch (final Exception e) {
			log.error(e.toString());
		}
		return null;
	}

}
