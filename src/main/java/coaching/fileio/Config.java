package coaching.fileio;

import java.io.*;
import java.util.Properties;

import org.slf4j.*;

/**
 * Configuration Class.
 */
@SuppressWarnings("serial")
public class Config extends Properties {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private String propertyFileName = this.getClass().getSimpleName() + ".properties";
	private boolean loaded = false;

	/**
	 * Construct a new configuration instance.
	 *
	 * @throws ConfigurationException the configuration exception
	 */
	public Config() throws ConfigurationException {
		super();
		loadResource();
	}

	/**
	 * Construct a new configuration instance.
	 *
	 * @param propertyFileName the property file name
	 * @throws ConfigurationException the configuration exception
	 */
	public Config(final String propertyFileName) throws ConfigurationException {
		super();
		setPropertyFileName(propertyFileName);
		loadResource(this.propertyFileName);
	}

	/**
	 * Instantiates a new configuration.
	 *
	 * @param properties the system properties
	 */
	public Config(final Properties properties) {
		super(properties);
	}

	/**
	 * Sets the property file name.
	 *
	 * @param propertyFileName the property file name
	 * @return this for a fluent interface.
	 */
	public Config setPropertyFileName(final String propertyFileName) {
		final String suffix = ".properties";
		if (propertyFileName.endsWith(suffix)) {
			this.propertyFileName = propertyFileName;
		} else {
			this.propertyFileName = String.format("%s%s", propertyFileName, suffix);
		}
		return this;
	}

	/**
	 * Gets the property file name.
	 *
	 * @return the property file name
	 */
	public String getPropertyFileName() {
		return propertyFileName;
	}

	/**
	 * Checks if is loaded.
	 *
	 * @return true, if is
	 * 			loaded
	 */
	public boolean isLoaded() {
		return loaded;
	}

	/**
	 * Load the configuration from the property filename.
	 *
	 * @return this for a fluent interface.
	 * @throws ConfigurationException the configuration exception
	 */
	public Config loadPropertyFile() throws ConfigurationException {
		return loadFrom(propertyFileName);
	}

	/**
	 * Load the configuration from the property filename.
	 *
	 * @return this for a fluent interface.
	 * @throws ConfigurationException the configuration exception
	 */
	public Config loadResource() throws ConfigurationException {
		return loadResource(propertyFileName);
	}

	/**
	 * Load the configuration from the resources.
	 *
	 * @param propertyFileName the property file name
	 * @return this for a fluent interface.
	 * @throws ConfigurationException the configuration exception
	 */
	public Config loadResource(final String propertyFileName) throws ConfigurationException {
		final InputStream streamForResource = streamForResource(propertyFileName);
		return loadFrom(streamForResource);
	}

	/**
	 * Load the configuration form the property file name.
	 *
	 * @param propertyFileName the property file name
	 * @return this for a fluent interface.
	 * @throws ConfigurationException the configuration exception
	 */
	public Config loadFrom(final String propertyFileName) throws ConfigurationException {
		try {
			final FileInputStream inStream = new FileInputStream(propertyFileName);
			super.load(inStream);
			loaded = true;
		} catch (final Exception e) {
			log.error("{}", e.toString());
			throw new ConfigurationException(e);
		}
		return this;
	}

	/**
	 * Load the configuration form the property file name.
	 *
	 * @param streamForResource the property InputStream
	 * @return this for a fluent interface.
	 * @throws ConfigurationException the configuration exception
	 */
	public Config loadFrom(final InputStream streamForResource) throws ConfigurationException {
		try {
			super.load(streamForResource);
			loaded = true;
		} catch (final Exception e) {
			log.error("{}", e.toString());
			throw new ConfigurationException(e);
		}
		return this;
	}

	/**
	 * Stream for resource.
	 *
	 * @param propertyFileName the property file name
	 * @return the input stream
	 */
	protected InputStream streamForResource(final String propertyFileName) {
		final ClassLoader classLoader = this.getClass().getClassLoader();
		final InputStream resourceAsStream = classLoader.getResourceAsStream(propertyFileName);
		return resourceAsStream;
	}

	/**
	 * Save the configuration.
	 *
	 * property file name
	 *
	 * @param propertyFileName the property file name
	 * @return this for a fluent interface.
	 * @throws ConfigurationException the configuration exception
	 */
	public Config save(final String propertyFileName) throws ConfigurationException {
		final File propertyFile = new File(propertyFileName);
		try {
			save(propertyFile);
		} catch (final ConfigurationException e) {
			log.error("{}", e.toString());
			throw new ConfigurationException(e);
		}
		return this;
	}

	/**
	 * Save the configuration.
	 *
	 * property file
	 *
	 * @param propertyFile the property file
	 * @return this for fluent interface.
	 * @throws ConfigurationException the configuration exception
	 */
	public Config save(final File propertyFile) throws ConfigurationException {
		try {
			final FileOutputStream outStream = new FileOutputStream(propertyFile);
			final String comments = "# Header " + propertyFileName;
			super.store(outStream, comments);
		} catch (final IOException e) {
			log.error("{}", e.toString());
			throw new ConfigurationException(e);
		}
		return this;
	}

	/**
	 * Configuration Exception Class.
	 */
	public class ConfigurationException extends Exception {

		/**
		 * Instantiates a new configuration exception.
		 */
		public ConfigurationException() {
			super();
		}

		/**
		 * Instantiates a new configuration exception.
		 *
		 * @param message the message
		 */
		public ConfigurationException(final String message) {
			super(message);
		}

		/**
		 * Instantiates a new configuration exception.
		 *
		 * @param cause the cause
		 */
		public ConfigurationException(final Throwable cause) {
			super(cause);
		}
	}

	/**
	 * Load property file.
	 *
	 * @param string the string
	 */
	public void loadPropertyFile(final String string) {
		// TODO Auto-generated method stub
	}
}
