
package coaching.jdbc;

import java.sql.*;

import org.slf4j.*;

/**
 * A factory for creating Connection objects.
 */
public class ConnectionFactory {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/student";
	private static final String USER = "root";
	private static final String PASSWORD = "root";

	private String connectionUrl = JDBC_URL;
	private String username = USER;
	private String password = PASSWORD;

	/**
	 * Instantiates a new connection factory.
	 */
	public ConnectionFactory() {
		this(JDBC_DRIVER, JDBC_URL, USER, PASSWORD);
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
		this.connectionUrl = connectionUrl;
		this.username = username;
		this.password = password;
		try {
			Class.forName(driverClassName);
		} catch (final ClassNotFoundException e) {
			this.log.error("{}", e.toString());
		}
	}

	/**
	 * Get jdbc connection for the database.
	 *
	 * @return the connection
	 */
	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(this.connectionUrl, this.username, this.password);
		} catch (final Exception e) {
			this.log.error("{}", e.toString());
		}
		return connection;
	}

}
