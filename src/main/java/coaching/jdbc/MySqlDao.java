
package coaching.jdbc;

/**
 * MySqlDao class.
 */
public class MySqlDao extends AbstractDataAccessObject {

    /** JDBC_DRIVER to be used. */
    private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";

    /** JDBC_URL to be used. */
    private static final String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";

    /** USERNAME to be used. */
    private static final String USERNAME = "pbpublic";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "pbpublic";

    /** SELECT_SQL. */
    private static final String SELECT_SQL = "SELECT * FROM customers";

    /** INSERT_SQL. */
    private static final String INSERT_SQL = "INSERT INTO customers (CUSTOMER_NUM, POSTCODE,DISCOUNT_CODE) VALUES (999,'AA99 9ZZ','N')";

    /** UPDATE_SQL. */
    private static final String UPDATE_SQL = "UPDATE customers SET field=value WHERE key=value";

    /** DELETE_SQL. */
    private static final String DELETE_SQL = "DELETE FROM customers WHERE key=value";

    /**
     * Instantiates a new my sql dao.
     */
    public MySqlDao() {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

    public Object setTableName(final String tableName) {
        return this;
    }

    public Object setFilename(final String filename) {
        return this;
    }

    /**
     * Creates the.
     */
    public void create() {
        super.create(INSERT_SQL);
    }

    /**
     * Read.
     */
    public void read() {
        super.read(SELECT_SQL);
    }

    /**
     * Update.
     */
    public void update() {
        super.update(UPDATE_SQL);
    }

    /**
     * Delete.
     */
    public void delete() {
        super.delete(DELETE_SQL);
    }

}
