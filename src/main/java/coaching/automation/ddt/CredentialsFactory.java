
package coaching.automation.ddt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeTrue;

import coaching.csv.CsvFile;
import coaching.csv.CsvFile.FileNotLoadedException;
import coaching.csv.CsvRecord;

/**
 * The CredentialsFactory class.
 */
public class CredentialsFactory extends AbstractExpectedData
        implements ExpectedDataInterface {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(CredentialsFactory.class);

    /** The csv file. */
    private CsvFile csvFile;

    /** The platform. */
    private String platform;

    /**
     * On.
     *
     * @param platform the platform
     * @return the credentials factory
     * @throws FileNotLoadedException the file not loaded exception
     */
    public static CredentialsFactory on(final String platform)
            throws FileNotLoadedException {
        return new CredentialsFactory(platform);
    }

    /**
     * Default constructor.
     *
     * @throws FileNotLoadedException the file not loaded exception
     */
    public CredentialsFactory() throws FileNotLoadedException {
        super();
        LOG.debug("CredentialsFactory() : {}", this);
        loadFrom(pathForPlatform());
    }

    /**
     * The Constructor.
     *
     * @param platform the platform
     * @throws FileNotLoadedException the file not loaded exception
     */
    public CredentialsFactory(final String platform)
            throws FileNotLoadedException {
        super();
        this.platform = platform;
        LOG.debug("CredentialsFactory({}) : {}", platform, this);
        loadFrom(pathForPlatform());
    }

    /**
     * Load from.
     *
     * @param credentialsFilename the credentials filename
     * @throws FileNotLoadedException the file not loaded exception
     */
    private void loadFrom(final String credentialsFilename)
            throws FileNotLoadedException {
        csvFile = new CsvFile(credentialsFilename);
    }

    /**
     * Path for platform.
     *
     * @return the string
     */
    private String pathForPlatform() {
        final String platform = System.getProperty("platform");
        if (platform == null) {
            return defaultPath();
        }
        return pathFor(platform);
    }

    /**
     * Path for.
     *
     * @param platform the platform
     * @return the string
     */
    private String pathFor(final String platform) {
        return String.format("data/%s/Credentials.csv", platform);
    }

    /**
     * Default path.
     *
     * @return the string
     */
    private String defaultPath() {
        return "data/Credentials.csv";
    }

    /**
     * On platform.
     *
     * @param platform the platform
     * @return the credentials factory
     */
    public CredentialsFactory onPlatform(final String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Tagged.
     *
     * @param tag the tag
     * @return the actor
     */
    public Actor tagged(final String tag) {
        assumeTrue(csvFile.isLoaded());
        final int rowCount = csvFile.rowCount();
        for (int index = 0; index < rowCount; index++) {
            final CsvRecord record = csvFile.getRecord(index);
            assertNotNull(record);
            if (record.getColumn(0).contains(tag)) {
                final Actor credentials = new Actor();
                assertNotNull(credentials);
                credentials.setUsername(record.getColumn(1));
                credentials.setPassword(record.getColumn(2));
                credentials.setEmail(record.getColumn(3));
                return credentials;
            }
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [platform=%s, csvFile=%s]",
                    this.getClass().getSimpleName(),
                    platform,
                    csvFile);
    }

}
