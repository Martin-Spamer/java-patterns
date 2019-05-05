
package coaching.jdbc;

import coaching.csv.CsvFile;

/**
 * JdbcToCsv class.
 */
public final class DaoToCsv {

    /** Data access object. */
    private final DaoInterface dao = new DynamicDao();

    /** Output CSV file. */
    private final CsvFile csv = new CsvFile();

    /**
     * Process.
     *
     * @param resourceName the resource name
     */
    public void process(final String resourceName) {
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [dao=%s, csvFile=%s]", this.getClass().getSimpleName(), this.dao, this.csv);
    }

}
