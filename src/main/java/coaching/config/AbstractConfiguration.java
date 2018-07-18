
package coaching.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.resources.PropertiesLoader;

/**
 * An abstract Configuration class.
 * Loads the Configuration from an Properties file.
 */
public abstract class AbstractConfiguration implements ConfigInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** The properties. */
    protected Properties properties;

    /** The loaded. */
    protected boolean loaded = false;

    /** The filename. */
    protected String filenameStem;

    /**
     * Default Constructor.
     */
    public AbstractConfiguration() {
        loadFrom(defaultFilename());
    }

    /**
     * Default Constructor.
     *
     * @param configFilename the config filename
     */
    public AbstractConfiguration(final String configFilename) {
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
        properties = PropertiesLoader.getProperties(configFilename);
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
        return String
            .format("%s [properties = %s]",
                    this.getClass().getSimpleName(),
                    prettyProperties);
    }

    /**
     * Pretty print the properties, one per line to aid reading in logs.
     *
     * @param properties the properties
     * @return the properties as String object.
     */
    protected String prettyProperties(final Properties properties) {
        return properties
            .toString()
            .replace("{", "{\n\t")
            .replace(", ", "\n\t")
            .replace("}", "\n\t}");
    }

}
