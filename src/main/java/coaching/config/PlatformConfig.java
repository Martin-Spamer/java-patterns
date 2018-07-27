
package coaching.config;

/**
 * PlatformConfig class.
 */
public final class PlatformConfig extends AbstractConfiguration {

    /**
     * Instantiates a new platform config.
     */
    public PlatformConfig() {
        this("Platform.properties");
    }

    /**
     * Instantiates a new platform config.
     *
     * @param configFilename the config filename
     */
    public PlatformConfig(final String configFilename) {
        super(configFilename);
    }

}
