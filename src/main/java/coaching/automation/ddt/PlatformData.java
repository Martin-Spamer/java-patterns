
package coaching.automation.ddt;

import coaching.csv.CsvFile.FileNotLoadedException;

/**
 * The PlatformData class.
 */
public final class PlatformData extends AbstractExpectedData implements ExpectedDataInterface {

    /** single static instance within class loader. */
    private static PlatformData INSTANCE = new PlatformData();

    /** The platform. */
    protected String platform = null;

    /**
     * The Constructor.
     *
     * @throws FileNotLoadedException
     */
    private PlatformData() {
        super();
        setPlatform(System.getProperty("platform", "local"));
        loadPlatformData();
    }

    /**
     * The Constructor.
     *
     * @param platform the platform
     * @throws FileNotLoadedException
     */
    public PlatformData(final String platform) {
        super();
        setPlatform(platform);
        loadPlatformData();
    }

    /**
     * Load platform data.
     *
     * @throws FileNotLoadedException
     */
    private void loadPlatformData() {
        super.loadData("PlatformData.csv");
    }

    /**
     * Gets the instance.
     *
     * @return the instance
     * @throws FileNotLoadedException
     */
    protected static synchronized PlatformData getInstance() {
        return INSTANCE;
    }

    /**
     * Platform.
     *
     * @param platform the platform
     * @return the platform data
     * @throws FileNotLoadedException
     */
    public static PlatformData platform(final String platform) {
        return PlatformData.getInstance().setPlatform(platform);
    }

    /**
     * Sets the platform.
     *
     * @param platform the platform
     * @return the platform data
     */
    protected PlatformData setPlatform(final String platform) {
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

    /**
     * With tag.
     *
     * @param tag the tag
     * @return the string
     * @throws FileNotLoadedException
     */
    public static String withTag(final String tag) {
        return PlatformData.getInstance().getTagged(tag);
    }

    /**
     * With characteristic.
     *
     * @param tag the tag
     * @return the string
     * @throws FileNotLoadedException
     */
    public static String withCharacteristic(final String tag) {
        return PlatformData.getInstance().getTagged(tag);
    }

    /**
     * All with tag.
     *
     * @param tag the tag
     * @return the string[]
     * @throws FileNotLoadedException
     */
    public static String[] allWithTag(final String tag) {
        return PlatformData.getInstance().getAllTagged(tag);
    }

}
