
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

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(CsvToDao.class);
    private final CsvFile csv = new CsvFile();
    private final DaoInterface dao = new DynamicDao();

}
