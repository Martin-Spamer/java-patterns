package coaching.config;

import java.io.*;
import java.util.*;

import org.slf4j.*;

/**
 * Abstract Configuration Class.
 */
public abstract class AbstractConfig implements ConfigInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected final Properties properties = new Properties();
	protected final String configFilename;

	/**
	 * Instantiates a new abstract configuration.
	 */
	public AbstractConfig() {
		configFilename = this.getClass().getSimpleName();
		load(configFilename);
	}

	/**
	 * Instantiates a new abstract configuration.
	 *
	 * configuration filename
	 *
	 * @param configFilename the Configuration filename
	 */
	AbstractConfig(final String configFilename) {
		this.configFilename = configFilename;
		load(configFilename);
	}

	/**
	 * configuration from XML filename.
	 *
	 * configuration filename
	 *
	 * @param configFilename the Configuration filename
	 */
	private void load(final String configFilename) {
		loadFromXmlFile(inputStream(toXmlFilename(configFilename)));
		loadFromPropertyFile(inputStream(toPropertyFilename(configFilename)));
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

	/**
	 * Load from property file.
	 *
	 * resource as stream
	 *
	 * @param resourceAsStream the resource as stream
	 */
	public void loadFromPropertyFile(final InputStream resourceAsStream) {
		if (resourceAsStream != null) {
			try {
				properties.load(resourceAsStream);
			} catch (final IOException e) {
				log.error(e.toString());
			}
		}
	}

	/**
	 * Load from xml file.
	 *
	 * resource as stream
	 *
	 * @param resourceAsStream the resource as stream
	 */
	public void loadFromXmlFile(final InputStream resourceAsStream) {
		if (resourceAsStream != null) {
			try {
				properties.loadFromXML(resourceAsStream);
			} catch (final InvalidPropertiesFormatException e) {
				log.error(e.toString());
			} catch (final IOException e) {
				log.error(e.toString());
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see framework.config.ConfigInterface#getProperty(java.lang.String)
	 */
	@Override
	public String getProperty(final String key) {
		String property = System.getProperty(key);
		if (property == null) {
			property = properties.getProperty(key);
		}
		return property;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see framework.config.ConfigInterface#getProperty(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String getProperty(final String key, final String defaultValue) {
		String property = System.getProperty(key);
		if (property == null) {
			property = properties.getProperty(key, defaultValue);
		}
		return property;
	}

	/**
	 * To property filename.
	 *
	 * configuration filename
	 * string
	 *
	 * @param configFilename the Configuration filename
	 * @return the string
	 */
	protected String toPropertyFilename(final String configFilename) {
		return String.format("%s.properties", configFilename);
	}

	/**
	 * To xml filename.
	 *
	 * configuration filename
	 * string
	 *
	 * @param configFilename the Configuration filename
	 * @return the string
	 */
	protected String toXmlFilename(final String configFilename) {
		return String.format("%s.xml", configFilename);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String prettyProperties = prettyProperties(properties);
		return String.format("properties = %s", prettyProperties);
	}

	/**
	 * Pretty properties.
	 *
	 * properties
	 * string
	 *
	 * @param properties the properties
	 * @return the string
	 */
	private String prettyProperties(final Properties properties) {
		return properties.toString().replace("{", "{\n\t").replace(", ", "\n\t").replace("}", "\n\t}");
	}

}
