/**
 * This file is part of Automated Testing Framework for Java (atf4j).
 *
 * Atf4j is free software: you can redistribute it and/or modify
 * GNU General Public License as published by
 * License, or
 * (at your option) any later version.
 *
 * hope that it will be useful,
 * implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * GNU General Public License
 * along with atf4j.  If not, see http://www.gnu.org/licenses/.
 */

package javamentor.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstractConfig Class.
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
	 * @param configFilename the config filename
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
	 * @param configFilename the config filename
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
	 * @param configFilename the config filename
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
	 * @param configFilename the config filename
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
