
package coaching.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.csv.CsvFile;

/**
 * Provides a example of a crude XML DAO reader.
 *
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */
public final class CsvToDao {

    /**  provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(CsvToDao.class);
    
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
        this.csv.read(resourceName);
    }

    /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
        return String.format("%s [csv=%s, dao=%s]", this.getClass().getSimpleName(), this.csv, this.dao);
    }

}
