/*
 * ConfigInterface.java
 *
 * Created on 06 May 2006, 14:39
 *
 * To change this template, choose Tools | Template Manager
 * editor.
 */

package coaching.config;

/**
 * Interface for a Configuration class.
 */
public interface ConfigInterface {

	/**
	 * property.
	 *
	 * @param key the key
	 * @return the property
	 */
	String getProperty(String key);

	/**
	 * property, with default if not found.
	 *
	 * key
	 * default value
	 * property
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the property
	 */
	String getProperty(String key, String defaultValue);

}
