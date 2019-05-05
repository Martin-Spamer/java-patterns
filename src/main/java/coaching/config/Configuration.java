
package coaching.config;

import lombok.extern.slf4j.Slf4j;

/**
 * An abstract Configuration class. Loads Configuration Properties from a
 * .properties file.
 */


@Slf4j
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
