

package coaching.jdbc;

import java.sql.*;

import org.slf4j.*;

/**
 * A factory for creating Connection objects.
 */
public class ConnectionFactory {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/student";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	private String driverClassName = DRIVER;
	private String connectionUrl = URL;
	private String username = USERNAME;
	private String password = PASSWORD;

	/**
	 * Instantiates a new connection factory.
	 */
	public ConnectionFactory() {
		this(DRIVER, URL, USERNAME, PASSWORD);
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
			Class.forName(DRIVER);
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

}
