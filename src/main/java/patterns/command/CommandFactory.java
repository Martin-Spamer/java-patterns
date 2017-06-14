
package patterns.command;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory for creating Command objects.
 *
 * Commands are cheap to instantiate.
 */
public final class CommandFactory implements InvokerInterface {

	private static final String COMMANDS_PROPERTIES = "commands.properties";
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Properties properties;

	/**
	 * Instantiates a new command factory.
	 *
	 * exception
	 *
	 * @throws Exception the exception
	 */
	public CommandFactory() throws Exception {
		super();
		properties = new Properties();
		properties.load(inputStream(COMMANDS_PROPERTIES));
		log.info("properties = {}", properties);
	}

	/**
	 * Instantiates a new command factory.
	 *
	 * filename
	 * exception
	 *
	 * @param filename the filename
	 * @throws Exception the exception
	 */
	public CommandFactory(final String filename) throws Exception {
		super();
		properties = new Properties();
		properties.load(inputStream(filename));
		log.info("properties = {}", properties);
	}

	/**
	 * Instantiates a new command factory.
	 *
	 * properties
	 *
	 * @param properties the properties
	 */
	public CommandFactory(final Properties properties) {
		super();
		this.properties = properties;
		log.info("properties = {}", this.properties);
	}

	/**
	 * Input stream.
	 *
	 * resource name
	 * input stream
	 *
	 * @param resourceName the resource name
	 * @return the input stream
	 */
	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.command.InvokerInterface#execute(java.lang.String)
	 */
	@Override
	public ResultInterface execute(final String actionName) throws MissingCommandException {
		try {
			final String className = properties.getProperty(actionName);
			if (className != null) {
				if (className.length() > 0) {
					AbstractCommand action;
					action = (AbstractCommand) Class.forName(className).newInstance();
					if (action != null) {
						return action.execute(new Parameters());
					} else {
						throw new MissingCommandException("Class not found. " + className);
					}
				} else {
					throw new MissingCommandException("Command class name not defined for ActionName");
				}
			} else {
				throw new MissingCommandException("Command Class not defined in properties file for ActionName");
			}
		} catch (final Exception e) {
			throw new MissingCommandException(e.toString());
		}
	}
}
