
package coaching.config;

/**
 * PlatformConfig class.
 */
public final class PlatformConfig extends AbstractConfiguration {

    public PlatformConfig() {
        this("Platform.properties");
    }

    public PlatformConfig(final String configFilename) {
        super(configFilename);
    }

}
