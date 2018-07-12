
package coaching.automation;

public final class PlatformData extends AbstractExpectedData implements ExpectedDataInterface {

    /** single static instance within class loader. */
    private static PlatformData instance;

    protected String platform = null;

    private PlatformData() {
        super();
        setPlatform(System.getProperty("platform", "local"));
        loadPlatformData();
    }

    public PlatformData(final String platform) {
        super();
        setPlatform(platform);
        loadPlatformData();
    }

    private void loadPlatformData() {
        super.loadData("Customer.csv");
    }

    protected static synchronized PlatformData getInstance() {
        if (instance == null) {
            instance = new PlatformData();
        }
        return instance;
    }

    public static PlatformData platform(final String platform) {
        return PlatformData.getInstance().setPlatform(platform);
    }

    protected PlatformData setPlatform(final String platform) {
        this.platform = platform;
        return this;
    }

    protected String getPlatform() {
        return platform;
    }

    public static String withTag(final String tag) {
        return PlatformData.getInstance().getTagged(tag);
    }

    public static String withCharacteristic(final String tag) {
        return PlatformData.getInstance().getTagged(tag);
    }

    public static String[] allWithTag(final String tag) {
        return PlatformData.getInstance().getAllTagged(tag);
    }

}
