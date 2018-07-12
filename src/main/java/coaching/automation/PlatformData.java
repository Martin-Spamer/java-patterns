
package coaching.automation;

/**
 * The Class PlatformData.
 */
public final class PlatformData extends AbstractExpectedData implements ExpectedDataInterface {

    /** single static instance within class loader. */
    private static PlatformData instance;

    /** The platform. */
    protected String platform = null;

    /**
     * The Constructor.
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
     */
    public PlatformData(final String platform) {
        super();
        setPlatform(platform);
        loadPlatformData();
    }

    /**
     * Load platform data.
     */
    private void loadPlatformData() {
        super.loadData("Customer.csv");
    }

    /**
     * Gets the instance.
     *
     * @return the instance
     */
    protected static synchronized PlatformData getInstance() {
        if (instance == null) {
            instance = new PlatformData();
        }
        return instance;
    }

    /**
     * Platform.
     *
     * @param platform the platform
     * @return the platform data
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
     */
    public static String withTag(final String tag) {
        return PlatformData.getInstance().getTagged(tag);
    }

    /**
     * With characteristic.
     *
     * @param tag the tag
     * @return the string
     */
    public static String withCharacteristic(final String tag) {
        return PlatformData.getInstance().getTagged(tag);
    }

    /**
     * All with tag.
     *
     * @param tag the tag
     * @return the string[]
     */
    public static String[] allWithTag(final String tag) {
        return PlatformData.getInstance().getAllTagged(tag);
    }

}
