
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

}
