
package coaching.automation.ddt;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeTrue;

import coaching.csv.CsvFile;
import coaching.csv.CsvFile.FileNotLoadedException;
import coaching.csv.CsvRecord;

/**
 * The abstract ExpectedData class.
 */
public abstract class AbstractExpectedData implements ExpectedDataInterface {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** Csvfile containing the expected data. */
    protected CsvFile csvFile;

    /** The path to the csv file. */
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
     * @throws FileNotLoadedException
     */
    protected void loadData(final String filename) throws FileNotLoadedException {
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
