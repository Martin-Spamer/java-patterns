
package coaching.jdbc;

/**
 * Provides a example of a crude XML DAO reader.
 *
 * @author martin.spamer
 * @version 0.1 - 12:33:20
 */
public final class CsvToDao extends AbstractDao {

    /**
     * Default Constructor.
     */
    public CsvToDao() {
        super();
    }

    /**
     * CSV file to DAO.
     *
     * @param driverClassName the driver class name
     * @throws ClassNotFoundException the class not found exception
     */
    public CsvToDao(final String driverClassName) {
        super(driverClassName);
    }

}
