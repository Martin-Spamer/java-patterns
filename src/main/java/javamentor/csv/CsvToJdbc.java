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
	 * csv file
	 *
	 * @param csvFile the csv file
	 */
	public CsvToJdbc(final CsvFile csvFile) {
		this.csvFile = csvFile;
	}

	/**
	 * Instantiates a new csv to jdbc.
	 *
	 * driver
	 * url
	 * user
	 * password
	 *
	 * @param driver the driver
	 * @param url the url
	 * @param user the user
	 * @param password the password
	 */
	public CsvToJdbc(final String driver, final String url, final String user, final String password) {
		this.driver = driver;
		this.url = url;
		username = user;
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#finalize()
	 */
	@Override
	public void finalize() throws SQLException {
		statement.close();
		connection.close();
	}

	/**
	 * Column headers.
	 *
	 * Column headers
	 *
	 * @return the column headers
	 */
	private String getColumnHeaders() {
		return csvFile.getColumnNames();
	}

	/**
	 * Make jdbc connection.
	 *
	 * driver
	 * url
	 * user
	 * password
	 * connection
	 * class not found exception
	 * SQL exception
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
		connection = DriverManager.getConnection(url, user, password);
		statement = makeStatement(connection);
		return connection;
	}

	/**
	 * Make statement.
	 *
	 * connection
	 * statement
	 * SQL exception
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
	 * exception
	 *
	 * @throws Exception the exception
	 */
	public void process() throws Exception {
		process(filename, driver, url, username, password, tableName);
	}

	/**
	 * Process.
	 *
	 * filename
	 * driver
	 * url
	 * user
	 * password
	 * table
	 * exception
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
		csvFile = new CsvFile(filename);
		tableName = table;
		for (int index = 0; index < csvFile.size(); index++) {
			final CSVRecord record = csvFile.getRecord(index);
			log.info(record.toString());
			write(record);
		}
	}

	/**
	 * connection.
	 *
	 * connection
	 * csv to jdbc
	 *
	 * @param connection the connection
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setConnection(final Connection connection) {
		this.connection = connection;
		return this;
	}

	/**
	 * csv file.
	 *
	 * csv file
	 * csv to jdbc
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
	 * driver
	 * csv to jdbc
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
	 * filename
	 * csv to jdbc
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
	 * password
	 * csv to jdbc
	 *
	 * @param password the password
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setPassword(final String password) {
		this.password = password;
		return this;
	}

	/**
	 * statement.
	 *
	 * statement
	 * csv to jdbc
	 *
	 * @param statement the statement
	 * @return the csv to jdbc
	 */
	public CsvToJdbc setStatement(final Statement statement) {
		this.statement = statement;
		return this;
	}

	/**
	 * table name.
	 *
	 * table name
	 * csv to jdbc
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
	 * url
	 * csv to jdbc
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
	 * username
	 * csv to jdbc
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
	 * record
	 * SQL exception
	 *
	 * @param record the record
	 * @throws SQLException the SQL exception
	 */
	public void write(final CSVRecord record) throws SQLException {
		// insert
		// into %table (%field%,...)
		// from (%value%,...)
		final StringBuffer sql = new StringBuffer();
		sql.append("insert into ").append(tableName);
		sql.append(getColumnHeaders());
		sql.append(" VALUES ");
		sql.append(record.toString());
		log.info(sql.toString());

		if (statement.execute(sql.toString())) {
			log.info("ok {}", statement.getResultSet().toString());
		} else {
			if (statement.getUpdateCount() == 1) {
				log.info("ok {}", statement.getResultSet().toString());
			} else {
				log.info("failed {}", statement.getWarnings());
			}
		}
	}

}
