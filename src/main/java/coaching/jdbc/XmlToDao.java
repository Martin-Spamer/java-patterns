
package coaching.jdbc;

import coaching.csv.CsvFile;

/**
 * Provides a example of a crude XML DAO reader.
 *
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */
public final class XmlToDao {

    private final CsvFile csv = new CsvFile();
    private final DaoInterface dao = new DynamicDao();

}
