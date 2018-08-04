
package coaching.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * A factory for creating Connection objects.
 */
public final class ConnectionFactory implements ConnectionFactoryInterface {

    /** provides logging. */
    private final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    private String jdbcUrl;
    private String username;
    private String password;

    /**
     * Private constructor prevents wild instantiations.
     */
    public ConnectionFactory() {
        super();
        try {
            Class.forName(JdbcConfig.driver());
            this.jdbcUrl = JdbcConfig.url();
            this.username = JdbcConfig.username();
            this.password = JdbcConfig.password();
        } catch (final ClassNotFoundException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
    }

    public ConnectionFactory(final String jdbcDriver,
            final String jdbcUrl,
            final String username,
            final String password) {
        super();
        try {
            Class.forName(jdbcDriver);
            this.jdbcUrl = jdbcUrl;
            this.username = username;
            this.password = password;
        } catch (final ClassNotFoundException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return new ConnectionFactory().newConnection();
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.ConnectionFactoryInterface#newConnection()
     */
    @Override
    public Connection newConnection() throws SQLException {
        assertNotNull(this.jdbcUrl);
        assertNotNull(this.username);
        assertNotNull(this.password);

        return DriverManager
            .getConnection(
                    this.jdbcUrl,
                    this.username,
                    this.password);
    }

    @Override
    public String toString() {
        return String
            .format("%s [JdbcConfig=%s]",
                    this.getClass().getSimpleName(),
                    JdbcConfig.getInstance().toString());
    }

}
