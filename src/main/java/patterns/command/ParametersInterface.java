
package patterns.command;

import java.util.Set;

/**
 * ParametersInterface Interface.
 */
public interface ParametersInterface {

	/**
	 * prameter.
	 *
	 * @param key the key
	 * @param value the value
	 * @return the abstract parameters
	 */
	public AbstractCommandParameters setPrameter(String key, String value);

	/**
	 * String property names.
	 *
	 * @return the sets the
	 */
	public Set<String> stringPropertyNames();

	/**
	 * Value for.
	 *
	 * @param key the key
	 * @return the string
	 */
	public String valueFor(String key);

	/**
	 * Value for.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the boolean
	 */
	public Boolean valueFor(String key, Boolean defaultValue);

	/**
	 * Value for.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the string
	 */
	public String valueFor(String key, String defaultValue);

	/**
	 * Value for.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the long
	 */
	public Long valueFor(String key, Long defaultValue);

}
