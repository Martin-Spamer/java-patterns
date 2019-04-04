
package coaching.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for the ConnectionFactory class.
 */
@Slf4j
public final class ConnectionFactoryTest {

    /**
     * Unit test to connection factory.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testConnectionFactory() throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory(JdbcConfig.driver(),
                JdbcConfig.url(),
                JdbcConfig.username(),
                JdbcConfig.password());
        assertNotNull(connectionFactory);
    }

    /**
     * Unit test for connection factory with SqLite.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testSqLiteConnection() throws SQLException {
        final Connection connection = ConnectionFactory.getConnection();
        assertNotNull(connection);
        log.info("Schema {}", connection.getSchema());
        log.info("Catalog {}", connection.getCatalog());
        connection.close();
    }

    /**
     * Unit test connection factory with Pointbase.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Low-Priority - Requires Pointbase")
    public void testPointbaseConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
        final String JDBC_URL = "jdbc:pointbase:server://localhost/sample";
        final String USERNAME = "PBPUBLIC";
        final String PASSWORD = "PBPUBLIC";

        // ConnectionFactory connectionFactory = new
        // ConnectionFactory(JDBC_DRIVER, JDBC_URL,USERNAME, PASSWORD);
        // assertNotNull(connectionFactory);
        // log.info("{}", connectionFactory.toString());

        final Connection connection = ConnectionFactory.getConnection();
        assertNotNull(connection);
        log.info(connection.toString());
        connection.close();
    }

    /**
     * Unit test connection factory with MySQL.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Low-Priority - Requires MySQL")
    public void testMySqlConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String JDBC_URL = "jdbc:mysql://localhost:3306/student";
        final String USERNAME = "root";
        final String PASSWORD = "root";

        // ConnectionFactory connectionFactory = new
        // ConnectionFactory(JDBC_DRIVER, JDBC_URL,USERNAME, PASSWORD);
        // assertNotNull(connectionFactory);
        // log.info("{}", connectionFactory.toString());

        final Connection connection = ConnectionFactory.getConnection();
        assertNotNull(connection);
        log.info(connection.toString());

        connection.close();
    }

    /**
     * Unit test to connection factory with Oracle.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Low-Priority - Requires Oracle")
    public void testOracleConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
        final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:sample";
        final String USERNAME = "user";
        final String PASSWORD = "password";

        // ConnectionFactory connectionFactory = new
        // ConnectionFactory(JDBC_DRIVER, JDBC_URL,USERNAME, PASSWORD);
        // assertNotNull(connectionFactory);
        // log.info("{}", connectionFactory.toString());

        final Connection connection = ConnectionFactory.getConnection();
        assertNotNull(connection);
        log.info(connection.toString());

        connection.close();
    }

    /**
     * Unit test the connection factory with PostgreSQL.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    @Ignore("Low-Priority - Requires PostgreSQL ")
    public void testPostgresqlConnectionFactory() throws SQLException {
        final String JDBC_DRIVER = "org.postgresql.Driver";
        final String JDBC_URL = "jdbc:postgresql://localhost";
        final String USERNAME = "postgres";
        final String PASSWORD = "password";

        // ConnectionFactory connectionFactory = new
        // ConnectionFactory(JDBC_DRIVER, JDBC_URL,USERNAME, PASSWORD);
        // assertNotNull(connectionFactory);
        // log.info("{}", connectionFactory.toString());

        final Connection connection = ConnectionFactory.getConnection();
        assertNotNull(connection);
        log.info("connection : {}", connection.toString());
        connection.close();
    }

}
