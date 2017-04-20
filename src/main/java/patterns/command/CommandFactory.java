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
		this.properties = new Properties();
		this.properties.load(inputStream("commands.properties"));
		this.log.info("properties = {}", this.properties);
	}

	public CommandFactory(final String filename) throws Exception {
		super();
		this.properties = new Properties();
		this.properties.load(inputStream(filename));
		this.log.info("properties = {}", this.properties);
	}

	public CommandFactory(final Properties properties) {
		super();
		this.properties = properties;
		this.log.info("properties = {}", this.properties);
	}

	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	@Override
	public CommandInterface execute(final String actionName) {
		final String className = this.properties.getProperty(actionName);
		AbstractCommand action;
		try {
			action = (AbstractCommand) Class.forName(className).newInstance();
			return action.execute(null);
		} catch (final Exception e) {
			this.log.error(e.toString());
		}
		return null;
	}

}
