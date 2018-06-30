
package coaching.config;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractConfiguration implements ConfigInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
    protected final Properties properties;
    protected boolean loaded = false;

    public AbstractConfiguration() {
        super();
        this.properties = new Properties();
    }

    public AbstractConfiguration(final Properties properties) {
        super();
        this.properties = properties;
    }

    /*
     * (non-Javadoc)
     *
     * @see coaching.config.ConfigInterface#getProperty(java.lang.String)
     */
    @Override
    public String get(final String key) {
        return this.properties.getProperty(key);
    }

    /*
     * (non-Javadoc)
     *
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
            this.log.warn("Using system property value {} for key {}", value, key);
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
            this.log.warn("Using system property value {} for key {}", value, key);
        }
        return value;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final String prettyProperties = prettyProperties(this.properties);
        return String.format("properties = %s", prettyProperties);
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
