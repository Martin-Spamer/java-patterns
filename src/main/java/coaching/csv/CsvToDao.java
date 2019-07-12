
package coaching.csv;

import coaching.jdbc.DynamicDao;

/**
 * A class to read a CSV file and write data to JDBC table.
 */
public final class CsvToDao extends AbstractCsvSource {

    private final DynamicDao dao = new DynamicDao();

    public CsvToDao() {
        super();
    }

    public CsvToDao(final String csvFilename) {
        super(csvFilename);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("CsvToDao [csvFile=%s, dao=%s]", this.csvFile, this.dao);
    }

}
