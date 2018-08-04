
package coaching.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.csv.CsvFile;

/**
 * JdbcToCsv class.
 */
public final class DaoToCsv {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(DaoToCsv.class);

    /** Data access object. */
    private DaoInterface dao;

    /** Output CSV file. */
    private final CsvFile csv = new CsvFile();

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String
            .format("%s [dao=%s, csvFile=%s]",
                    this.getClass().getSimpleName(),
                    this.dao,
                    this.csv);
    }

}
