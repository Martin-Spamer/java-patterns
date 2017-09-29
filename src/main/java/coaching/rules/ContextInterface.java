


package coaching.rules;

import java.util.Properties;

/**
 * Context Interface.
 */
public interface ContextInterface {

	/**
	 * Sets the properties.
	 *
	 * @param properties the properties
	 * @return the context interface
	 */
	public ContextInterface setProperties(final Properties properties);

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	public Properties getProperties();

}
