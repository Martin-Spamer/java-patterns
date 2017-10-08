

package coaching.rules;

import java.util.Properties;

/**
 * Abstract Context Class.
 */
public abstract class AbstractContext implements ContextInterface {

	private Properties properties = null;

	/**
	 * Instantiates a new abstract context.
	 *
	 * @param properties the properties
	 */
	public AbstractContext(final Properties properties) {
		setProperties(properties);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.rules.ContextInterface#setProperties(java.util.Properties)
	 */
	@Override
	public ContextInterface setProperties(final Properties properties) {
		this.properties = properties;
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.rules.ContextInterface#getProperties()
	 */
	@Override
	public Properties getProperties() {
		return this.properties;
	}

	/**
	 * Sets the property.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the object
	 * @see java.util.Properties#setProperty(java.lang.String, java.lang.String)
	 */
	public Object setProperty(final String key, final String value) {
		return this.properties.setProperty(key, value);
	}

	/**
	 * Gets the property.
	 *
	 * @param key the key
	 * @return the property
	 * @see java.util.Properties#getProperty(java.lang.String)
	 */
	public String getProperty(final String key) {
		return this.properties.getProperty(key);
	}

}
