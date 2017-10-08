

package patterns.command;

import java.io.*;
import java.util.Properties;

import org.slf4j.*;

/**
 * A factory for creating Command objects.
 *
 * Commands are cheap to instantiate.
 */
public final class CommandFactory implements InvokerInterface {

	private static final Logger LOG = LoggerFactory.getLogger(CommandFactory.class);
	private static final String COMMANDS_PROPERTIES = "commands.properties";
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private final Properties properties = new Properties();

	/**
	 * Instantiates a new command factory.
	 */
	public CommandFactory() {
		super();
		initialise(COMMANDS_PROPERTIES);
	}

	/**
	 * Instantiates a new command factory.
	 *
	 * @param filename the filename
	 */
	public CommandFactory(final String filename) {
		super();
		initialise(filename);
	}

	/**
	 * Initialise.
	 *
	 * @param filename the filename
	 */
	protected void initialise(final String filename) {
		try {
			this.properties.load(inputStream(filename));
			this.log.info("properties = {}", this.properties);
		} catch (final IOException e) {
			LOG.error("{}", e);
		}
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
	public ResultInterface execute(final String actionName) throws MissingCommandException {
		try {
			final String className = this.properties.getProperty(actionName);
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
