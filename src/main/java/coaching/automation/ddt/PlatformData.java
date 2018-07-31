
package coaching.automation.ddt;

/**
 * The PlatformData class.
 */
public final class PlatformData extends AbstractExpectedData implements ExpectedDataInterface {

    /** single static instance within class loader. */
    private static final PlatformData INSTANCE = new PlatformData();

    /** The platform. */
    private String platform = null;

    /**
     * Default constructor.
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
        super.initialise("PlatformData.csv");
    }

    /**
     * Gets the instance.
     *
     * @return the instance
     */
    protected static synchronized PlatformData getInstance() {
        return INSTANCE;
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

    @Override
    public String toString() {
        return String
                .format("%s [platform=%s %s]",
                        this.getClass().getSimpleName(),
                        platform,
                        super.toString());
    }

}
