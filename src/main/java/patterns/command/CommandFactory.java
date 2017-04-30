
package patterns.command;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import patterns.mvc.controller.ResultInterface;

/**
 * A factory for creating Command objects.
 */
public final class CommandFactory implements InvokerInterface {

	private static final String COMMANDS_PROPERTIES = "commands.properties";
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Properties properties;

	/**
	 * Instantiates a new command factory.
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
	public ResultInterface execute(final String actionName) {
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
