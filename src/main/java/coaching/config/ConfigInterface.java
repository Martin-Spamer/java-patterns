/*
 * ConfigInterface.java
 *
 * Created on 06 May 2006, 14:39
 *
 */

package coaching.config;

/**
 * An Interface for a Configuration class.
 */
public interface ConfigInterface {

    /**
     * get property by key.
     *
     * @param key
     *            the name of key
     * @return the property value as a String object.
     */
    public String getProperty(final String key);

    /**
     * property, with default if not found.
     *
     * @param key
     *            the name of key
     * @param defaultValue
     *            the default value
     * @return the property value as a String object.
     */
    public String getProperty(final String key, final String defaultValue);

}
