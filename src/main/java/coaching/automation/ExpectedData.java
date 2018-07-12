
package coaching.automation;

public final class ExpectedData extends AbstractExpectedData implements ExpectedDataInterface {

    /** single static instance within class loader. */
    private static ExpectedData instance;

    protected String platform = null;

    private ExpectedData() {
        super();
        setPlatform(System.getProperty("platform", "local"));
        loadPlatformData();
    }

    public ExpectedData(final String platform) {
        super();
        setPlatform(platform);
        loadPlatformData();
    }

    private void loadPlatformData() {
        super.loadData("Customer.csv");
    }

    protected static synchronized ExpectedData getInstance() {
        if (instance == null) {
            instance = new ExpectedData();
        }
        return instance;
    }

    public static ExpectedData platform(final String platform) {
        return ExpectedData.getInstance().setPlatform(platform);
    }

    protected ExpectedData setPlatform(final String platform) {
        this.platform = platform;
        return this;
    }

    protected String getPlatform() {
        return platform;
    }

    public static String withTag(final String tag) {
        return ExpectedData.getInstance().getTagged(tag);
    }

    public static String withCharacteristic(final String tag) {
        return ExpectedData.getInstance().getTagged(tag);
    }

    public static String[] allWithTag(final String tag) {
        return ExpectedData.getInstance().getAllTagged(tag);
    }

}
