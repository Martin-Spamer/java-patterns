
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
	public AbstractCommandParameters setPrameter(final String key, final String value);

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
	public String valueFor(final String key);

	/**
	 * Value for.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the boolean
	 */
	public Boolean valueFor(final String key, final Boolean defaultValue);

	/**
	 * Value for.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the string
	 */
	public String valueFor(final String key, final String defaultValue);

	/**
	 * Value for.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the long
	 */
	public Long valueFor(final String key, final Long defaultValue);

}
