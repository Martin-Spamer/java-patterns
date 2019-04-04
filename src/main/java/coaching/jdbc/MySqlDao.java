
package coaching.jdbc;

import lombok.extern.slf4j.Slf4j;

/**
 * A Data Access object for a MySQL database.
 */
@Slf4j
public class MySqlDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student";

    /** USER to be used. */
    private static final String USERNAME = "root";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "root";

    /** SQL to DROP the table. */
    static final String DROP_SQL = "DROP TABLE IF EXISTS {}";

    /** SQL to create the table. */
    static final String CREATE_SQL = "CREATE TABLE customer (id INTEGER, name STRING, details STRING)";

    /** SQL to count the number of rows in the table. */
    static final String COUNT_SQL = "SELECT (*) FROM customer";

    /** SQL to select all rows in the table. */
    static final String SELECT_SQL = "SELECT * FROM customer";

    /** SQL to insert a row in the table. */
    static final String INSERT_SQL = "INSERT INTO customer (ID, NAME, DATA VALUES (999,'...','...')";

    /** SQL to update rows in the table. */
    static final String UPDATE_SQL = "UPDATE TABLE SET FIELD = 'Value' WHERE ID=999";

    /** SQL to delete rows in the table. */
    static final String DELETE_SQL = "DELETE FROM TABLE WHERE ID=999";

    /**
     * Instantiates a new my sql dao.
     */
    public MySqlDao() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
