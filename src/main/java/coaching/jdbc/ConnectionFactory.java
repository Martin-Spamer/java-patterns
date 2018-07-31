
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
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** Instantiate the single instance of this class. */
    private static final ConnectionFactory INSTANCE = new ConnectionFactory();

    /** The username. */
    private String username = null;

    /** The password. */
    private String password = null;

    /** The connection url. */
    private String connectionUrl = null;

    /**
     * Private constructor prevents wild instantiations.
     */
    private ConnectionFactory() {
        super();
    }

    /**
     * Instantiates a new connection factory.
     *
     * @param driverClassName the driver class name
     * @param connectionUrl the connection url
     * @param username the username
     * @param password the password
     */
    public ConnectionFactory(final String driverClassName,
            final String connectionUrl,
            final String username,
            final String password) {
        super();
        this.connectionUrl = connectionUrl;
        this.username = username;
        this.password = password;
        try {
            Class.forName(driverClassName);
        } catch (final ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Returns this single shared instance.
     *
     * @returns the single instance.
     */
    public static ConnectionFactory getInstance() {
        return INSTANCE;
    }

    public static Connection getConnection() {
        return getInstance().newConnection();
    }

    @Override
    public Connection newConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(connectionUrl, username, password);
            return connection;
        } catch (SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

}
