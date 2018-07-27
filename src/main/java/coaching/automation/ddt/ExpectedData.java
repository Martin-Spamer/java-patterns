
package coaching.automation.ddt;

import coaching.csv.CsvFile.FileNotLoadedException;

/**
 * A class to provide the ExpectedData for automated testing.
 *
 * Provides the data expected by an automated test case. This class abstract the
 * platform away behind a label and allows the automated test data to be
 * smoothly retrieved based on a characteristic of the data. e.g.
 *
 * Given a credit customer ...
 * Given a cash customer ...
 *
 */
public final class ExpectedData extends AbstractExpectedData
        implements ExpectedDataInterface {

    /** single static instance within the class loader. */
    private static final ExpectedData INSTANCE = new ExpectedData();

    /** The platform. */
    private String platform = null;

    /**
     * Gets the instance.
     *
     * @return the instance
     */
    private static synchronized ExpectedData getInstance() {
        return INSTANCE;
    }

    /**
     * Default constructor.
     */
    private ExpectedData() {
        super();
        setPlatform(System.getProperty("platform", "local"));
        initialise();
    }

    /**
     * Constructor for specific platform.
     *
     * @param platform the platform
     */
    public ExpectedData(final String platform) {
        super();
        setPlatform(platform);
        initialise();
    }

    /**
     * Load platform data.
     */
    private void initialise() {
        try {
            super.initialise("ExpectedData.csv");
        } catch (final FileNotLoadedException e) {
            log.error(e.toString());
        }
    }

    /**
     * Platform.
     *
     * @param platform the platform
     * @return the expected data
     * @throws FileNotLoadedException the file not loaded exception
     */
    public static ExpectedData platform(final String platform)
            throws FileNotLoadedException {
        return ExpectedData.getInstance().setPlatform(platform);
    }

    /**
     * Sets the platform.
     *
     * @param platform the platform
     * @return the expected data
     */
    protected ExpectedData setPlatform(final String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Gets the platform.
     *
     * @return the platform
     */
    protected String getPlatform() {
        return platform;
    }

    public static ExpectedData fromCsv() {
        return ExpectedData.getInstance().loadFromCsv();
    }

    private ExpectedData loadFromCsv() {
        String simpleName = this.getClass().getSimpleName();
        String filename = String.format("%s.csv", simpleName);
        log.info("{}", filename);
        return this;
    }

    public static ExpectedData fromXml() {
        return ExpectedData.getInstance().loadFromXml();
    }

    private ExpectedData loadFromXml() {
        String simpleName = this.getClass().getSimpleName();
        String filename = String.format("%s.xml", simpleName);
        log.info("{}", filename);
        return this;
    }

    public static ExpectedData fromJson() {
        return ExpectedData.getInstance().loadFromJson("");
    }

    private ExpectedData loadFromJson(final String jsonFilename) {
        String simpleName = this.getClass().getSimpleName();
        String filename = String.format("%s.json", simpleName);
        log.info("{}", filename);
        return this;
    }

    /**
     * With tag.
     *
     * @param tag the tag
     * @return the string
     * @throws FileNotLoadedException the file not loaded exception
     */
    public static String withTag(final String tag)
            throws FileNotLoadedException {
        return ExpectedData.getInstance().getTagged(tag);
    }

    /**
     * With characteristic.
     *
     * @param tag the tag
     * @return the string
     * @throws FileNotLoadedException the file not loaded exception
     */
    public static String withCharacteristic(final String tag)
            throws FileNotLoadedException {
        return ExpectedData.getInstance().getTagged(tag);
    }

    /**
     * All with tag.
     *
     * @param tag the tag
     * @return the string[]
     * @throws FileNotLoadedException the file not loaded exception
     */
    public static String[] allWithTag(final String tag)
            throws FileNotLoadedException {
        return ExpectedData.getInstance().getAllTagged(tag);
    }

    /**
     * Debug string.
     *
     * @return the string
     */
    public static String debugString() {
        return ExpectedData.getInstance().toString();
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("ExpectedData [platform=%s]", platform);
    }

}
