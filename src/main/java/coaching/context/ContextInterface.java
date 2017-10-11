
package coaching.context;

import java.util.Properties;

/**
 * interface ContextInterface.
 */
public interface ContextInterface {

	/**
	 * Sets the properties.
	 *
	 * @param properties the properties
	 * @return the context interface for fluent interface.
	 */
	ContextInterface setProperties(Properties properties);

	/**
	 * Sets the property.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the context interface for fluent interface.
	 */
	ContextInterface setProperty(String key, String value);

	/**
	 * Gets the property.
	 *
	 * @param key the key
	 * @return the property
	 * @see java.util.Properties#getProperty(java.lang.String)
	 */
	String getProperty(String key);

}
