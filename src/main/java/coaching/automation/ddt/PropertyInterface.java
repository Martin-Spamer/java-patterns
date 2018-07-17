
package coaching.automation.ddt;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * The Interface for Property handing classes.
 */
public interface PropertyInterface {

    /**
     * Sets the property.
     *
     * @param key the key
     * @param value the value
     * @return the property interface
     */
    PropertyInterface setProperty(final String key, final String value);

    /**
     * Gets the property.
     *
     * @param key the key
     * @param defaultValue the default value
     * @return the property
     */
    String getProperty(final String key, final String defaultValue);

    /**
     * Gets the property.
     *
     * @param key the key
     * @return the property
     */
    String getProperty(final String key);

    /**
     * Size.
     *
     * @return the int
     */
    int size();

    /**
     * Load.
     *
     * @param inputStream the input stream
     * @return the property interface
     * @throws Exception the exception
     */
    PropertyInterface load(final InputStream inputStream);

    /**
     * Load from XML.
     *
     * @param inputStream the input stream
     * @return the property interface
     * @throws Exception the exception
     */
    PropertyInterface loadFromXML(final InputStream inputStream);

    /**
     * Store.
     *
     * @param outStream the out stream
     * @return the property interface
     * @throws Exception the exception
     */
    PropertyInterface store(final OutputStream outStream);

    /**
     * Store.
     *
     * @param outStream the out stream
     * @param comment the comment
     * @return the property interface
     * @throws Exception the exception
     */
    PropertyInterface store(final OutputStream outStream, final String comment);

}
