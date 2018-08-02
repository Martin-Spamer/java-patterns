
package coaching.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A factory for creating Connection objects.
 */
public final class ConnectionFactory implements ConnectionFactoryInterface {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** Instantiate the single instance of this class. */
    private static final ConnectionFactory INSTANCE = new ConnectionFactory();

    /**
     * Private constructor prevents wild instantiations.
     */
    private ConnectionFactory() {
        super();
        try {
            final String driver = JdbcConfig.driver();
            Class.forName(driver);
        } catch (final ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Returns this single shared instance.
     *
     * @return the instance
     * @returns the single instance.
     */
    public static ConnectionFactory getInstance() {
        return INSTANCE;
    }

    /**
     * Gets the connection.
     *
     * @return the connection
     */
    public static Connection getConnection() {
        final Connection newConnection = INSTANCE.newConnection();
        return newConnection;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.ConnectionFactoryInterface#newConnection()
     */
    @Override
    public Connection newConnection() {
        try {
            final Connection connection = DriverManager
                .getConnection(JdbcConfig.url(),
                        JdbcConfig.username(),
                        JdbcConfig.password());
            return connection;
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    @Override
    public String toString() {
        return String
            .format("%s [JdbcConfig=%s]",
                    this.getClass().getSimpleName(),
                    JdbcConfig.getInstance().toString());
    }
}
