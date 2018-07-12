
package coaching.automation;

/**
 * The Class ExpectedData.
 */
public final class ExpectedData extends AbstractExpectedData implements ExpectedDataInterface {

    /** single static instance within class loader. */
    private static ExpectedData instance;

    /** The platform. */
    protected String platform = null;

    /**
     * The Constructor.
     */
    private ExpectedData() {
        super();
        setPlatform(System.getProperty("platform", "local"));
        loadPlatformData();
    }

    /**
     * The Constructor.
     *
     * @param platform the platform
     */
    public ExpectedData(final String platform) {
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
    protected static synchronized ExpectedData getInstance() {
        if (instance == null) {
            instance = new ExpectedData();
        }
        return instance;
    }

    /**
     * Platform.
     *
     * @param platform the platform
     * @return the expected data
     */
    public static ExpectedData platform(final String platform) {
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

    /**
     * With tag.
     *
     * @param tag the tag
     * @return the string
     */
    public static String withTag(final String tag) {
        return ExpectedData.getInstance().getTagged(tag);
    }

    /**
     * With characteristic.
     *
     * @param tag the tag
     * @return the string
     */
    public static String withCharacteristic(final String tag) {
        return ExpectedData.getInstance().getTagged(tag);
    }

    /**
     * All with tag.
     *
     * @param tag the tag
     * @return the string[]
     */
    public static String[] allWithTag(final String tag) {
        return ExpectedData.getInstance().getAllTagged(tag);
    }

}
