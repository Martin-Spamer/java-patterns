
package coaching.config;

/**
 * An abstract Configuration class. Loads Configuration Properties from a
 * .properties file.
 */
public class Configuration extends AbstractConfiguration {

    /**
     * Instantiates a new abstract configuration.
     */
    public Configuration() {
        super();
    }

    /**
     * Instantiates a new abstract configuration.
     *
     * @param configFilename the Configuration filename
     */
    public Configuration(final String configFilename) {
        super(configFilename);
    }

    /**
     * Value for key, allows an environment value to override the property.
     *
     * @param key the key
     * @return the value as a String object.
     */
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
    public String valueFor(final String key, final String defaultValue) {
        final String value = System.getProperty(key);
        if (value == null) {
            return this.properties.getProperty(key, defaultValue);
        } else {
            this.log.warn("Using system property value {} for key {}", value, key);
        }
        return value;
    }
}
