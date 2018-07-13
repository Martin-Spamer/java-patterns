
package coaching.automation.ddt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * The AbstractPropertyResource class.
 *
 * @deprecated in favour of reusable Configuration
 */
@Deprecated
public abstract class AbstractPropertyResource implements PropertyInterface {

    /** The properties. */
    protected final Properties properties = new Properties();

    /**
     * Sets the property value for a key.
     *
     * @param key the key as a String.
     * @param value the value as a String.
     * @return this for a fluent interface.
     */
    @Override
    public PropertyInterface setProperty(final String key, final String value) {
        properties.setProperty(key, value);
        return this;
    }

    /**
     * Number of values in collection.
     *
     * @return size as int.
     */
    @Override
    public int size() {
        return properties.size();
    }

    /**
     * Gets the property value for the key.
     *
     * @param key the key
     * @return the property
     */
    @Override
    public String getProperty(final String key) {
        return properties.getProperty(key);
    }

    /**
     * Gets the property.
     *
     * @param key the key
     * @param defaultValue the default value
     * @return the property
     */
    @Override
    public String getProperty(final String key, final String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    /**
     * Load.
     *
     * @param resourceName the resource name
     * @return the property interface
     * @throws IOException the IO exception
     */
    public PropertyInterface load(final String resourceName) throws IOException {
        if (resourceName != null) {
            final InputStream inputStream = this.getClass().getResourceAsStream(resourceName);
            return load(inputStream);
        }
        return this;
    }

    /**
     * Load the property values from input stream.
     *
     * @param inputStream the in stream
     * @return this for a fluent interface.
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    public PropertyInterface load(final InputStream inputStream) throws IOException {
        if (inputStream != null) {
            properties.load(inputStream);
        }
        return this;
    }

    /**
     * Load from XML.
     *
     * @param resourceName the resource name
     * @return the property interface
     * @throws IOException the IO exception
     */
    public PropertyInterface loadFromXML(final String resourceName) throws IOException {
        final InputStream inputStream = this.getClass().getResourceAsStream(resourceName);
        return loadFromXML(inputStream);
    }

    /**
     * Load properties from XML.
     *
     * @param inputStream the input stream
     * @return this instance for a fluent interface.
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    public PropertyInterface loadFromXML(final InputStream inputStream) throws IOException {
        if (inputStream != null) {
            properties.loadFromXML(inputStream);
        }
        return this;
    }

    /**
     * Store.
     *
     * @param outStream the out
     * @return this instance for a fluent interface.
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    public PropertyInterface store(final OutputStream outStream) throws IOException {
        String simpleName = this.getClass().getSimpleName();
        this.store(outStream, simpleName);
        return this;
    }

    /**
     * Store.
     *
     * @param out the out
     * @param comment the comment
     * @return this instance for a fluent interface.
     * @throws IOException Signals that an I/O exception has occurred.
     */
    @Override
    public PropertyInterface store(final OutputStream out, final String comment) throws IOException {
        properties.store(out, comment);
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [properties=%s]", this.getClass().getSimpleName(), properties);
    }

}
