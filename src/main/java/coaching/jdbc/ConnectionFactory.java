
package coaching.jdbc;

import java.sql.*;

import org.slf4j.*;

/**
 * A factory for creating Connection objects.
 */
public class ConnectionFactory {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private String driverClassName = "com.mysql.jdbc.Driver";
	private String connectionUrl = "jdbc:mysql://localhost:3306/student";
	private String username = "root";
	private String password = "root";

	private static ConnectionFactory connectionFactory = null;

	/**
	 * Instantiates a new connection factory.
	 */
	public ConnectionFactory() {
		try {
			Class.forName(this.driverClassName);
		} catch (final ClassNotFoundException e) {
			this.log.error("{}", e.toString());
		}
	}

	/**
	 * Instantiates a new connection factory.
	 *
	 * @param driverClassName the driver class name
	 */
	public ConnectionFactory(final String driverClassName) {
		try {
			Class.forName(this.driverClassName);
		} catch (final ClassNotFoundException e) {
			this.log.error("{}", e.toString());
		}
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
		try {
			Class.forName(this.driverClassName);
			this.connectionUrl = connectionUrl;
			this.username = username;
			this.password = password;
		} catch (final ClassNotFoundException e) {
			this.log.error("{}", e.toString());
		}
	}

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 * @throws SQLException the SQL exception
	 */
	public Connection getConnection() throws SQLException {
		Connection connection = null;
		connection = DriverManager.getConnection(this.connectionUrl, this.username, this.password);
		return connection;
	}

	/**
	 * Gets the single instance of ConnectionFactory.
	 *
	 * @return single instance of ConnectionFactory
	 */
	public static ConnectionFactory getInstance() {
		if (connectionFactory == null) {
			connectionFactory = new ConnectionFactory();
		}
		return connectionFactory;
	}
}
