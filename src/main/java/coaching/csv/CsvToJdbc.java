/**
 * CsvToJdbc.java
 *
 * Created on 01 December 2004, 15:46
 **/
package coaching.csv;

import java.sql.*;

import org.slf4j.*;

/**
 * CsvToJdbc Class.
 */
public class CsvToJdbc {
	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private CsvFile csvFile;
	private String filename;
	private String driver;
	private String url;
	private String username;
	private String password;
	private String tableName;

	/**
	 * Instantiates a new csv to jdbc.
	 */
	public CsvToJdbc() {
		super();
	}

	/**
	 * Instantiates a new csv to jdbc.
	 *
	 * @param csvFile the csv file
	 */
	public CsvToJdbc(final CsvFile csvFile) {
		this.csvFile = csvFile;
	}

	/**
	 * Column headers.
	 *
	 * @return the column headers
	 */
	private String getColumnHeaders() {
		return this.csvFile.getColumnNames();
	}

	/**
	 * Make jdbc connection.
	 *
	 * @param driver the driver
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 * @return the connection
	 */
	private Connection makeJdbcConnection(final String driver,
	        final String url,
	        final String user,
	        final String password) {
		try {
			Class.forName(driver);
			try {
				return DriverManager.getConnection(url, user, password);
			} catch (final SQLException e) {
				this.log.error("{}", e);
			}
		} catch (final ClassNotFoundException e) {
			this.log.error("{}", e);
		}
		return null;
	}

	/**
	 * Make statement.
	 *
	 * @param connection the connection
	 * @return the statement
	 * @throws SQLException the SQL exception
	 */
	private Statement makeStatement(final Connection connection) throws SQLException {
		return connection.createStatement();
	}

	/**
	 * Process.
	 */
	public void process() {
		process(this.driver, this.url, this.username, this.password, "tableName");
	}

	/**
	 * Process.
	 *
	 * @param driver the driver
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 * @param table the table
	 */
	protected void process(final String driver,
	        final String url,
	        final String user,
	        final String password,
	        final String table) {
		makeJdbcConnection(driver, url, user, password);
		this.csvFile = new CsvFile(this.filename);
		for (int index = 0; index < this.csvFile.size(); index++) {
			final CsvRecord record = this.csvFile.getRecord(index);
			this.log.info(record.toString());
			write(record);
		}
	}

	/**
	 * csv file.
	 *
	 * @param csvFile the csv file
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setCsvFile(final CsvFile csvFile) {
		this.csvFile = csvFile;
		return this;
	}

	/**
	 * driver.
	 *
	 * @param driver the driver
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setDriver(final String driver) {
		this.driver = driver;
		return this;
	}

	/**
	 * filename.
	 *
	 * @param filename the filename
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setFilename(final String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * password.
	 *
	 * @param password the password
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setPassword(final String password) {
		this.password = password;
		return this;
	}

	/**
	 * table name.
	 *
	 * @param tableName the table name
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setTableName(final String tableName) {
		this.tableName = tableName;
		return this;
	}

	/**
	 * url.
	 *
	 * @param url the url
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setUrl(final String url) {
		this.url = url;
		return this;
	}

	/**
	 * username.
	 *
	 * @param username the username
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setUsername(final String username) {
		this.username = username;
		return this;
	}

	/**
	 * Write.
	 *
	 * @param record the record
	 * @throws SQLException the SQL exception
	 */
	public void write(final CsvRecord record) {
		// insert
		// into %table (%field%,...)
		// from (%value%,...)
		final StringBuffer sql = new StringBuffer();
		sql.append("insert into ");
		sql.append(this.tableName);
		sql.append(getColumnHeaders());
		sql.append(" VALUES ");
		sql.append(record.toString());
		this.log.info(sql.toString());

		try {
			final Connection connection = DriverManager.getConnection(this.url, this.username, this.password);
			final Statement statement = makeStatement(connection);
			if (statement.execute(sql.toString())) {
				this.log.info("ok {}", statement.getResultSet().toString());
			} else {
				if (statement.getUpdateCount() == 1) {
					this.log.info("ok {}", statement.getResultSet().toString());
				} else {
					this.log.info("failed {}", statement.getWarnings());
				}
			}
			statement.close();
			connection.close();
		} catch (final SQLException e) {
			this.log.error("{}", e);
		}
	}
}
