
package coaching.jdbc;

import coaching.csv.CsvFile;
import lombok.extern.slf4j.Slf4j;

/**
 * Provides a example of a crude XML DAO reader.
 *
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */


@Slf4j
public final class CsvToDao {

    /** The csv. */
    private final CsvFile csv = new CsvFile();

    /** The dao. */
    private final DaoInterface dao = new DynamicDao();

    /**
     * Instantiates a new csv to dao.
     */
    public CsvToDao() {
        super();
    }

    /**
     * Process.
     *
     * @param resourceName the resource name
     */
    public void process(final String resourceName) {
        csv.read(resourceName);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [csv=%s, dao=%s]", this.getClass().getSimpleName(), csv, dao);
    }

}
