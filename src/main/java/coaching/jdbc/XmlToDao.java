
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

    private final CsvFile csv = new CsvFile();
    private final DaoInterface dao = new DynamicDao();

    public XmlToDao() {
        super();
    }

    public void process(final String resourceName, final String tableName) {
        this.csv.read(resourceName);
        List<CsvRecord> rowList = this.csv.getRowList();
        this.dao.insertRows(rowList);
    }

    @Override
    public String toString() {
        return String.format("XmlToDao [csv=%s, dao=%s]", this.csv, this.dao);
    }

}
