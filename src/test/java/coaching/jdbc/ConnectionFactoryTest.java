
package coaching.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the ConnectionFactory class.
 */
public final class ConnectionFactoryTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(ConnectionFactoryTest.class);

    private ConnectionFactory connectionFactory;

    /**
     * Unit test for connection factory with SqLite.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testSqLiteConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "org.sqlite.JDBC";
        final String JDBC_URL = "jdbc:sqlite:memory";
        final String USERNAME = "username";
        final String PASSWORD = "password";
        connectionFactory = new ConnectionFactory(JDBC_DRIVER, JDBC_URL,
                USERNAME, PASSWORD);
        assertNotNull(connectionFactory);
        final Connection connection = connectionFactory.newConnection();
        assertNotNull(connection);
        LOG.info(connection.toString());
        connection.close();
    }

    /**
     * Unit test connection factory with Pointbase.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Requires Pointbase low-priority")
    public void testPointbaseConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
        final String JDBC_URL = "jdbc:pointbase:server://localhost/sample";
        final String USERNAME = "PBPUBLIC";
        final String PASSWORD = "PBPUBLIC";

        connectionFactory = new ConnectionFactory(JDBC_DRIVER, JDBC_URL,
                USERNAME, PASSWORD);

        assertNotNull(connectionFactory);
        final Connection connection = connectionFactory.newConnection();
        assertNotNull(connection);
        LOG.info(connection.toString());
        connection.close();
    }

    /**
     * Unit test connection factory with MySQL.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Requires MySQL low-priority")
    public void testMySqlConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String JDBC_URL = "jdbc:mysql://localhost:3306/student";
        final String USERNAME = "root";
        final String PASSWORD = "root";

        connectionFactory = new ConnectionFactory(JDBC_DRIVER, JDBC_URL,
                USERNAME, PASSWORD);

        assertNotNull(connectionFactory);
        final Connection connection = connectionFactory.newConnection();
        assertNotNull(connection);
        LOG.info(connection.toString());
        connection.close();
    }

    /**
     * Unit test to connection factory with Oracle.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Requires Oracle low-priority")
    public void testConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
        final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:sample";
        final String USERNAME = "user";
        final String PASSWORD = "password";

        connectionFactory = new ConnectionFactory(JDBC_DRIVER, JDBC_URL,
                USERNAME, PASSWORD);

        assertNotNull(connectionFactory);
        final Connection connection = connectionFactory.newConnection();
        assertNotNull(connection);
        LOG.info(connection.toString());
        connection.close();
    }

    /**
     * Unit test the connection factory with PostgreSQL.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Requires PostgreSQL low-priority")
    public void testPostgresqlConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String JDBC_URL = "jdbc:postgresql://localhost";
        final String USERNAME = "postgres";
        final String PASSWORD = "password";

        connectionFactory = new ConnectionFactory(JDBC_DRIVER, JDBC_URL,
                USERNAME, PASSWORD);

        assertNotNull(connectionFactory);
        final Connection connection = connectionFactory.newConnection();
        assertNotNull(connection);
        LOG.info(connection.toString());
        connection.close();
    }

}
