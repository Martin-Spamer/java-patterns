
package patterns.command;

import java.util.Properties;

/**
 * interface ContextInterface.
 */
public interface ContextInterface {

	/**
	 * Sets the properties.
	 *
	 * @param properties the properties
	 * @return the context interface
	 */
	public ContextInterface setProperties(Properties properties);

	/**
	 * Gets the properties.
	 *
	 * @return the properties
	 */
	public Properties getProperties();

}
