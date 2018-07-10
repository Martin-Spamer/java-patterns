
package automation;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeTrue;

import coaching.csv.CsvFile;
import coaching.csv.CsvRecord;

/**
 * The abstract ExpectedData class.
 */
public abstract class AbstractExpectedData implements ExpectedDataInterface {

    protected CsvFile csvFile;
    protected String path = "data/";

    public AbstractExpectedData() {
        super();
    }

    public void loadData(final String filename) {
        csvFile = new CsvFile(filename);
    }

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
