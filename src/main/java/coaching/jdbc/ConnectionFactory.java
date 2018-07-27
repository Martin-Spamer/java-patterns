
package coaching.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory for creating Connection objects.
 */
public class ConnectionFactory implements ConnectionFactoryInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** The username. */
    private String username = null;

    /** The password. */
    private String password = null;

    /** The connection url. */
    private String connectionUrl = null;

    /**
     * Instantiates a new connection factory.
     *
     * @param driverClassName
     *            the driver class name
     * @param connectionUrl
     *            the connection url
     * @param username
     *            the username
     * @param password
     *            the password
     */
    public ConnectionFactory(final String driverClassName,
            final String connectionUrl,
            final String username,
            final String password) {
        this.connectionUrl = connectionUrl;
        this.username = username;
        this.password = password;
        try {
            Class.forName(driverClassName);
        } catch (final ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.ConnectionFactoryInterface#newConnection()
     */
    @Override
    public Connection newConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl, username, password);
    }

}
