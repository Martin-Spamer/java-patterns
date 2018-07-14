
package coaching.jdbc;

/**
 * A Data Access object for PostgreSql Database.
 */
public final class PostgresSqlDao extends AbstractDao {

    /** The classname of the JDBC driver to use. */
    private static final String JDBC_DRIVER = "org.postgresql.Driver";

    /** The URL to use to make JDBC connection. */
    private static final String JDBC_URL = "jdbc:postgresql://localhost";

    /** USERNAME to be used. */
    private static final String USERNAME = "postgres";

    /** PASSWORD to be used. */
    private static final String PASSWORD = "password";

    /**
     * Instantiates a new DAO for PostgreSQL.
     *
     * @throws ClassNotFoundException
     */
    public PostgresSqlDao() throws ClassNotFoundException {
        super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
    }

}
