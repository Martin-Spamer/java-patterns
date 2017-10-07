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
 * An Interface for a Configuration class.
 */
public interface ConfigInterface {

	/**
	 * get property by key.
	 *
	 * @param key the name of key
	 * @return the property value as a String object.
	 */
	public String getProperty(String key);

	/**
	 * property, with default if not found.
	 *
	 * @param key the name of key
	 * @param defaultValue the default value
	 * @return the property value as a String object.
	 */
	public String getProperty(String key, String defaultValue);

}
