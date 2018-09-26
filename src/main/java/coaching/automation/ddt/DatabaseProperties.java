
package coaching.automation.ddt;

import coaching.config.AbstractConfiguration;

/**
 * A class to provide database connection properties.
 */
public class DatabaseProperties extends AbstractConfiguration {

    private static final String DATABASE_PROPERTIES = "database.properties";

    /**
     * Default constructor.
     */
    public DatabaseProperties() {
        super(DATABASE_PROPERTIES);
    }

    public DatabaseProperties(final String platform) {
        super(String.format("%s/%s", platform, DATABASE_PROPERTIES));
    }

}
