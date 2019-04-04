
package coaching.config;

import java.util.Properties;

import coaching.resources.PropertiesLoader;
import lombok.extern.slf4j.Slf4j;

/**
 * An abstract Configuration class. Loads the Configuration from a Properties
 * file.
 */
@Slf4j
public abstract class AbstractConfiguration implements ConfigInterface {

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
     * @param configFilename the Configuration filename
     */
    protected void loadFrom(final String configFilename) {
        this.properties = PropertiesLoader.getProperties(configFilename);
    }

    /**
     * Fixup the property file extension if necessary.
     *
     * @param configFilename the Configuration filename
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
        return this.properties.getProperty(key);
    }

    /*
     * (non-Javadoc)
     * @see coaching.config.ConfigInterface#getProperty(java.lang.String,
     * java.lang.String)
     */
    @Override
    public String get(final String key, final String defaultValue) {
        return this.properties.getProperty(key, defaultValue);
    }

    /**
     * Value for key, allows an environment value to override the property.
     *
     * @param key the key
     * @return the value as a String object.
     */
    @Override
    public String valueFor(final String key) {
        final String value = System.getProperty(key);
        if (value == null) {
            return this.properties.getProperty(key);
        } else {
            log.warn("Using system property value {} for key {}", value, key);
        }
        return value;
    }

    /**
     * Value for key, allows an environment value to override the property.
     *
     * @param key the key
     * @param defaultValue the default value, if no property found.
     * @return the property value as a String object.
     */
    @Override
    public String valueFor(final String key, final String defaultValue) {
        final String value = System.getProperty(key);
        if (value == null) {
            return this.properties.getProperty(key, defaultValue);
        } else {
            log.warn("Using system property value {} for key {}", value, key);
        }
        return value;
    }

    /*
     * (non-Javadoc)
     * @see coaching.config.ConfigInterface#valueFor(java.lang.String,
     * java.lang.Boolean)
     */
    @Override
    public Boolean valueFor(final String key, final Boolean defaultValue) {
        return Boolean.valueOf(valueFor(key, defaultValue.toString()));
    }

    /*
     * (non-Javadoc)
     * @see coaching.config.ConfigInterface#valueFor(java.lang.String,
     * java.lang.Number)
     */
    @Override
    public Long valueFor(final String key, final Long defaultValue) {
        return new Long(valueFor(key, defaultValue.toString()));
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final String prettyProperties = prettyProperties(this.properties);
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
