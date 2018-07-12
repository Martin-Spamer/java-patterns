
package coaching.automation;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeTrue;

import coaching.csv.CsvFile;
import coaching.csv.CsvRecord;

/**
 * The abstract ExpectedData class.
 */
public abstract class AbstractExpectedData implements ExpectedDataInterface {

    /** The csv file. */
    protected CsvFile csvFile;
    
    /** The path. */
    protected String path = "data/";

    /**
     * The Constructor.
     */
    public AbstractExpectedData() {
        super();
    }

    /**
     * Load data.
     *
     * @param filename the filename
     */
    public void loadData(final String filename) {
        csvFile = new CsvFile(filename);
    }

    /**
     * Gets the tagged.
     *
     * @param tag the tag
     * @return the tagged
     */
    protected String getTagged(final String tag) {
        assumeTrue(csvFile.isLoaded());
        final int rowCount = csvFile.rowCount();
        for (int index = 0; index < rowCount; index++) {
            final CsvRecord record = csvFile.getRecord(index);
            assertNotNull(record);
            if (record.getColumn(0).toUpperCase().contains(tag.toUpperCase())) {
                return record.toString();
            }
        }
        return null;
    }

    /**
     * Gets the all tagged.
     *
     * @param tag the tag
     * @return the all tagged
     */
    protected String[] getAllTagged(final String tag) {
        assumeTrue(csvFile.isLoaded());
        ArrayList<String> all = new ArrayList<String>();
        assumeTrue(csvFile.isLoaded());
        final int rowCount = csvFile.rowCount();
        for (int index = 0; index < rowCount; index++) {
            final CsvRecord record = csvFile.getRecord(index);
            assertNotNull(record);
            if (record.getColumn(0).toUpperCase().contains(tag.toUpperCase())) {
                all.add(record.toString());
            }
        }
        return (String[]) all.toArray();
    }
}
