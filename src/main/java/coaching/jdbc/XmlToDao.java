
package coaching.jdbc;

import java.util.List;

import coaching.csv.CsvFile;
import coaching.csv.CsvRecord;

/**
 * Provides a example of a crude XML DAO reader.
 *
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */
public final class XmlToDao {

    /** The csv. */
    private final CsvFile csv = new CsvFile();

    /** The dao. */
    private final DaoInterface dao = new DynamicDao();

    /**
     * Instantiates a new xml to dao.
     */
    public XmlToDao() {
        super();
    }

    /**
     * Process.
     *
     * @param resourceName the resource name
     * @param tableName the table name
     */
    public void process(final String resourceName, final String tableName) {
        csv.read(resourceName);
        final List<CsvRecord> rowList = csv.getRowList();
        // this.dao.insertRows(rowList);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("XmlToDao [csv=%s, dao=%s]", csv, dao);
    }

}
