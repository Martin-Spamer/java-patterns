/**
 * This file is part of Automated Testing Framework for Java (atf4j).
 *
 * Atf4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Atf4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with atf4j.  If not, see http://www.gnu.org/licenses/.
 */

package idioms.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The AbstractConfig Class.
 */
public abstract class AbstractConfig implements ConfigInterface {

	protected final Logger LOG = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected final Properties properties = new Properties();
	protected final String configFilename;

	/**
	 * Instantiates a new abstract configuration.
	 */
	public AbstractConfig() {
		this.configFilename = this.getClass().getSimpleName();
		load(this.configFilename);
	}

	/**
	 * Instantiates a new abstract configuration.
	 *
	 * @param configFilename the configuration filename
	 */
	AbstractConfig(final String configFilename) {
		this.configFilename = configFilename;
		load(configFilename);
	}

	/**
	 * Load.
	 *
	 * @param configFilename the configuration filename
	 */
	private void load(final String configFilename) {
		loadFromXmlFile(inputStream(toXmlFilename(configFilename)));
		loadFromPropertyFile(inputStream(toPropertyFilename(configFilename)));
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

	/**
	 * Load from property file.
	 *
	 * @param resourceAsStream the resource as stream
	 */
	public void loadFromPropertyFile(final InputStream resourceAsStream) {
		if (resourceAsStream != null) {
			try {
				this.properties.load(resourceAsStream);
			} catch (final IOException e) {
				this.LOG.error(e.toString());
			}
		}
	}

	/**
	 * Load from xml file.
	 *
	 * @param resourceAsStream the resource as stream
	 */
	public void loadFromXmlFile(final InputStream resourceAsStream) {
		if (resourceAsStream != null) {
			try {
				this.properties.loadFromXML(resourceAsStream);
			} catch (final InvalidPropertiesFormatException e) {
				this.LOG.error(e.toString());
			} catch (final IOException e) {
				this.LOG.error(e.toString());
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
			property = this.properties.getProperty(key);
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
			property = this.properties.getProperty(key, defaultValue);
		}
		return property;
	}

	/**
	 * To property filename.
	 *
	 * @param configFilename the configuration filename
	 * @return the string
	 */
	protected String toPropertyFilename(final String configFilename) {
		return String.format("%s.properties", configFilename);
	}

	/**
	 * To xml filename.
	 *
	 * @param configFilename the configuration filename
	 * @return the string
	 */
	protected String toXmlFilename(final String configFilename) {
		return String.format("%s.xml", configFilename);
	}

	@Override
	public String toString() {
		final String prettyProperties = prettyProperties(this.properties);
		return String.format("properties = %s", prettyProperties);
	}

	private String prettyProperties(final Properties properties) {
		return properties.toString().replace("{", "{\n\t").replace(", ", "\n\t").replace("}", "\n\t}");
	}

}
