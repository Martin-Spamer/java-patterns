
package patterns.command;

import java.util.Set;

/**
 * ParametersInterface Interface.
 */
public interface ParametersInterface {

	/**
	 * prameter.
	 *
	 * key
	 * value
	 * abstract parameters
	 *
	 * @param key the key
	 * @param value the value
	 * @return the abstract parameters
	 */
	AbstractParameters setPrameter(String key, String value);

	/**
	 * String property names.
	 *
	 * sets the
	 *
	 * @return the sets the
	 */
	Set<String> stringPropertyNames();

	/**
	 * Value for.
	 *
	 * key
	 * string
	 *
	 * @param key the key
	 * @return the string
	 */
	String valueFor(String key);

	/**
	 * Value for.
	 *
	 * key
	 * default value
	 * boolean
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the boolean
	 */
	Boolean valueFor(String key, Boolean defaultValue);

	/**
	 * Value for.
	 *
	 * key
	 * default value
	 * string
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the string
	 */
	String valueFor(String key, String defaultValue);

	/**
	 * Value for.
	 *
	 * key
	 * default value
	 * long
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the long
	 */
	Long valueFor(String key, Long defaultValue);

}
