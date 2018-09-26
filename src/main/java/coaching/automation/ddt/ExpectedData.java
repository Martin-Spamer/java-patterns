
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
        initialise();
    }

    /**
     * Load platform data.
     */
    private void initialise() {
        try {
            super.initialise("ExpectedData.csv");
        } catch (final FileNotLoadedException e) {
            this.log.error(e.toString());
        }
    }

    /**
     * From csv.
     *
     * @return the expected data
     */
    public static ExpectedData fromCsv() {
        return ExpectedData.getInstance().loadFromCsv();
    }

    public static ExpectedData fromCsv(final String filename) {
        return ExpectedData.getInstance().loadFromCsv(filename);
    }

    /**
     * Load from csv.
     *
     * @return the expected data
     */
    private ExpectedData loadFromCsv() {
        final String simpleName = this.getClass().getSimpleName();
        final String filename = String.format("%s.csv", simpleName);
        this.log.info("{}", filename);
        return this;
    }

    private ExpectedData loadFromCsv(final String filename) {
        this.log.info("{}", filename);
        return this;
    }

    /**
     * From xml.
     *
     * @return the expected data
     */
    public static ExpectedData fromXml() {
        return ExpectedData.getInstance().loadFromXml();
    }

    public static ExpectedData fromXml(final String filename) {
        return ExpectedData.getInstance().loadFromXml(filename);
    }

    /**
     * Load from xml.
     *
     * @return the expected data
     */
    private ExpectedData loadFromXml() {
        final String simpleName = this.getClass().getSimpleName();
        final String filename = String.format("%s.xml", simpleName);
        this.log.info("{}", filename);
        return this;
    }

    private ExpectedData loadFromXml(final String filename) {
        this.log.info("{}", filename);
        return this;
    }

    /**
     * From json.
     *
     * @return the expected data
     */
    public static ExpectedData fromJson() {
        return ExpectedData.getInstance().loadFromJson();
    }

    public static ExpectedData fromJson(final String filename) {
        return ExpectedData.getInstance().loadFromJson(filename);
    }

    /**
     * Load from json.
     *
     * @return the expected data
     */
    private ExpectedData loadFromJson() {
        final String simpleName = this.getClass().getSimpleName();
        final String filename = String.format("%s.json", simpleName);
        this.log.info("{}", filename);
        return this;
    }

    private ExpectedData loadFromJson(final String filename) {
        this.log.info("{}", filename);
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
     * @see coaching.automation.ddt.AbstractExpectedData#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [%s]",
                    this.getClass().getSimpleName(),
                    super.toString());
    }

}
