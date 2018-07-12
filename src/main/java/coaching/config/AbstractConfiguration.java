
package coaching.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class AbstractConfiguration.
 */
public abstract class AbstractConfiguration implements ConfigInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The properties. */
    protected Properties properties = new Properties();

    /** The loaded. */
    protected boolean loaded = false;

    /** The filename. */
    protected String filenameStem;

    /**
     * The Constructor.
     */
    public AbstractConfiguration() {
        super();
        loadFrom(defaultFilename());
    }

    /**
     * The Constructor.
     *
     * @param configFilename the config filename
     */
    public AbstractConfiguration(final String configFilename) {
        super();
        loadFrom(configFilename);
    }

    /**
     * The default filename is the Classname.properties
     *
     * @return the filename as a String object.
     */
    protected String defaultFilename() {
        return toPropertyFilename(this.getClass().getSimpleName());
    }

    /**
     * Load the configuration from the resource with the configFilename.
     *
     * @param configFilename
     *            the Configuration filename
     */
    protected void loadFrom(final String configFilename) {
        final String propertyFilename = toPropertyFilename(configFilename);
        loadFrom(inputStream(propertyFilename));
        properties.setProperty("propertyFilename", propertyFilename);
    }

    /**
     * Fixup the property file extension if necessary.
     *
     * @param configFilename
     *            the Configuration filename
     * @return the string
     */
    protected String toPropertyFilename(final String configFilename) {
        if (configFilename.endsWith(".properties")) {
            return configFilename;
        } else {
            return String.format("%s.properties", configFilename);
        }
    }

    /**
     * Provide an input stream for the resource with the resourceName.
     *
     * @param resourceName
     *            the resource name
     * @return the input stream
     */
    protected InputStream inputStream(final String resourceName) {
        final Thread currentThread = Thread.currentThread();
        final ClassLoader classloader = currentThread.getContextClassLoader();
        return classloader.getResourceAsStream(resourceName);
    }

    /**
     * Load the configuration from the inputStream for the resource.
     *
     * @param resourceAsStream
     *            the resource as stream
     */
    protected void loadFrom(final InputStream resourceAsStream) {
        if (resourceAsStream != null) {
            try {
                properties.load(resourceAsStream);
                loaded = true;
            } catch (final IOException e) {
                log.error(e.toString());
            }
        }
    }

    /*
     * (non-Javadoc)
     * @see coaching.config.ConfigInterface#getProperty(java.lang.String)
     */
    @Override
    public String get(final String key) {
        return properties.getProperty(key);
    }

    /*
     * (non-Javadoc)
     * @see coaching.config.ConfigInterface#getProperty(java.lang.String,
     * java.lang.String)
     */
    @Override
    public String get(final String key, final String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final String prettyProperties = prettyProperties(properties);
        return String.format("%s [properties = %s]", this.getClass().getSimpleName(), prettyProperties);
    }

    /**
     * Pretty print the properties, one per line to aid reading in logs.
     *
     * @param properties the properties
     * @return the properties as String object.
     */
    protected String prettyProperties(final Properties properties) {
        return properties.toString().replace("{", "{\n\t").replace(", ", "\n\t").replace("}", "\n\t}");
    }

}
