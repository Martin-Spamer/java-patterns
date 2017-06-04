/*
 * ConfigInterface.java
 *
 * Created on 06 May 2006, 14:39
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package javamentor.config;

/**
 * Interface for a Configuration class.
 */
public interface ConfigInterface {

	/**
	 * Gets the property.
	 *
	 * @param key the key
	 * @return the property
	 */
	String getProperty(String key);

	/**
	 * Gets the property, with default if not found.
	 *
	 * @param key the key
	 * @param defaultValue the default value
	 * @return the property
	 */
	String getProperty(String key, String defaultValue);

}
