
package coaching.context;

import java.util.Properties;

/**
 * Context Interface.
 */
public interface ContextInterface {

	/**
	 * Sets the properties.
	 *
	 * @param properties the properties
	 * @return the context interface for fluent interface.
	 */
	public ContextInterface setProperties(final Properties properties);

	/**
	 * Sets the property.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the context interface for fluent interface.
	 */
	public ContextInterface setProperty(final String key, final String value);

	/**
	 * Gets the property.
	 *
	 * @param key the key
	 * @return the property
	 * @see java.util.Properties#getProperty(java.lang.String)
	 */
	public String getProperty(final String key);

	public String getProperty(final String key, final String defaultValue);
}
