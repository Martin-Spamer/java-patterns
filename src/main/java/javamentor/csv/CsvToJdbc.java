/**
 * CsvToJdbc.java
 * Created on 01 December 2004, 15:46
 **/
package javamentor.csv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CsvToJdbc Class.
 */
public class CsvToJdbc {

	private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	private CsvFile csvFile;
	private String filename;
	private String driver;
	private String url;
	private String username;
	private String password;
	private Connection connection;
	private Statement statement;
	private String tableName;

	/**
	 * Instantiates a new csv to jdbc.
	 */
	public CsvToJdbc() {
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
	 * Instantiates a new csv to jdbc.
	 *
	 * @param driver the driver
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 */
	public CsvToJdbc(final String driver, final String url, final String user, final String password) {
		this.driver = driver;
		this.url = url;
		this.username = user;
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#finalize()
	 */
	@Override
	public void finalize() throws SQLException {
		this.statement.close();
		this.connection.close();
	}

	/**
	 * Gets the Column headers.
	 *
	 * @return the Column headers
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
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	private Connection makeJdbcConnection(final String driver,
	        final String url,
	        final String user,
	        final String password) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		this.connection = DriverManager.getConnection(url, user, password);
		this.statement = makeStatement(this.connection);
		return this.connection;
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
	 *
	 * @throws Exception the exception
	 */
	public void process() throws Exception {
		process(this.filename, this.driver, this.url, this.username, this.password, this.tableName);
	}

	/**
	 * Process.
	 *
	 * @param filename the filename
	 * @param driver the driver
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 * @param table the table
	 * @throws Exception the exception
	 */
	protected void process(final String filename,
	        final String driver,
	        final String url,
	        final String user,
	        final String password,
	        final String table) throws Exception {
		makeJdbcConnection(driver, url, user, password);
		this.csvFile = new CsvFile(filename);
		this.tableName = table;
		for (int index = 0; index < this.csvFile.size(); index++) {
			final CSVRecord record = this.csvFile.getRecord(index);
			this.log.info(record.toString());
			write(record);
		}
	}

	/**
	 * Sets the connection.
	 *
	 * @param connection the connection
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setConnection(final Connection connection) {
		this.connection = connection;
		return this;
	}

	/**
	 * Sets the csv file.
	 *
	 * @param csvFile the csv file
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setCsvFile(final CsvFile csvFile) {
		this.csvFile = csvFile;
		return this;
	}

	/**
	 * Sets the driver.
	 *
	 * @param driver the driver
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setDriver(final String driver) {
		this.driver = driver;
		return this;
	}

	/**
	 * Sets the filename.
	 *
	 * @param filename the filename
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setFilename(final String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the password
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setPassword(final String password) {
		this.password = password;
		return this;
	}

	/**
	 * Sets the statement.
	 *
	 * @param statement the statement
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setStatement(final Statement statement) {
		this.statement = statement;
		return this;
	}

	/**
	 * Sets the table name.
	 *
	 * @param tableName the table name
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setTableName(final String tableName) {
		this.tableName = tableName;
		return this;
	}

	/**
	 * Sets the url.
	 *
	 * @param url the url
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setUrl(final String url) {
		this.url = url;
		return this;
	}

	/**
	 * Sets the username.
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
	 * @param intoTable the into table
	 * @throws SQLException the SQL exception
	 */
	public void write(final CSVRecord record) throws SQLException {
		// insert
		// into %table (%field%,...)
		// from (%value%,...)
		final StringBuffer sql = new StringBuffer();
		sql.append("insert into ").append(this.tableName);
		sql.append(getColumnHeaders());
		sql.append(" VALUES ");
		sql.append(record.toString());
		this.log.info(sql.toString());

		if (this.statement.execute(sql.toString())) {
			this.log.info("ok {}", this.statement.getResultSet().toString());
		} else {
			if (this.statement.getUpdateCount() == 1) {
				this.log.info("ok {}", this.statement.getResultSet().toString());
			} else {
				this.log.info("failed {}", this.statement.getWarnings());
			}
		}
	}

}
