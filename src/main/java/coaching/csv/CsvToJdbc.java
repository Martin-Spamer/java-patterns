
package coaching.csv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.csv.CsvFile.FileNotLoadedException;
import coaching.jdbc.DynamicDao;

/**
 * A class to read a CSV file and write data to JDBC table.
 */
public class CsvToJdbc {

    /** provides logging. */
    private final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** CSV file. */
    private CsvFile csvFile;

    private DynamicDao dao;

    /** filename. */
    private String filename;

    /** JDBC driver. */
    private String driver;

    /** JDBC connection url. */
    private String url;

    /** username. */
    private String username;

    /** password. */
    private String password;

    /** tableName. */
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
     * @param csvFile
     *            the csv file
     */
    public CsvToJdbc(final CsvFile csvFile) {
        this.csvFile = csvFile;
    }

    /**
     * Column headers.
     *
     * @return the column headers
     */
    public String getColumnHeaders() {
        return csvFile.getColumnNames();
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
                log.error(e.getLocalizedMessage(), e);
            }
        } catch (final ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /**
     * Make statement.
     *
     * @param connection
     *            the connection
     * @return the statement
     * @throws SQLException
     *             the SQL exception
     */
    private Statement makeStatement(final Connection connection)
            throws SQLException {
        return connection.createStatement();
    }

    /**
     * Process.
     *
     * @throws FileNotLoadedException the file not loaded exception
     */
    public void process() throws FileNotLoadedException {
        process(driver, url, username, password, "tableName");
    }

    /**
     * Process.
     *
     * @param driver the driver
     * @param url the url
     * @param user the user
     * @param password the password
     * @param table the table
     * @throws FileNotLoadedException the file not loaded exception
     */
    protected void process(final String driver,
            final String url,
            final String user,
            final String password,
            final String table) throws FileNotLoadedException {
        makeJdbcConnection(driver, url, user, password);
        csvFile = new CsvFile(filename);
        for (int index = 0; index < csvFile.rowCount(); index++) {
            final CsvRecord record = csvFile.getRecord(index);
            log.info(record.toString());
            writeRecord(record);
        }
    }

    /**
     * csv file.
     *
     * @param csvFile
     *            the csv file
     * @return the csv to jdbc
     */
    public CsvToJdbc setCsvFile(final CsvFile csvFile) {
        this.csvFile = csvFile;
        return this;
    }

    /**
     * driver.
     *
     * @param driver
     *            the driver
     * @return the csv to jdbc
     */
    public CsvToJdbc setDriver(final String driver) {
        this.driver = driver;
        return this;
    }

    /**
     * filename.
     *
     * @param filename
     *            the filename
     * @return the csv to jdbc
     */
    public CsvToJdbc setFilename(final String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * password.
     *
     * @param password
     *            the password
     * @return the csv to jdbc
     */
    public CsvToJdbc setPassword(final String password) {
        this.password = password;
        return this;
    }

    /**
     * table name.
     *
     * @param tableName
     *            the table name
     * @return the csv to jdbc
     */
    public CsvToJdbc setTableName(final String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * url.
     *
     * @param url
     *            the url
     * @return the csv to jdbc
     */
    public CsvToJdbc setUrl(final String url) {
        this.url = url;
        return this;
    }

    /**
     * username.
     *
     * @param username
     *            the username
     * @return the csv to jdbc
     */
    public CsvToJdbc setUsername(final String username) {
        this.username = username;
        return this;
    }

    /**
     * Write a row from a line to the CSV file.
     *
     * @param record the record
     */
    public void writeRecord(final CsvRecord record) {
        final String sql = createSql(record);
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = makeStatement(connection);
            final ResultSet resultSet = statement.getResultSet();
            if (statement.execute(sql)) {
                log.info("{} ok", resultSet);
            } else {
                if (statement.getUpdateCount() == 1) {
                    log.info("{} ok", resultSet);
                } else {
                    log.info("failed {}", statement.getWarnings());
                }
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (final SQLException e) {
                log.error(e.getLocalizedMessage(), e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (final SQLException e) {
                log.error(e.getLocalizedMessage(), e);
            }
        }
    }

    /**
     * Creates the sql.
     *
     * insert into %table% (%field%,...) from (%value%,...)
     *
     * @param record
     *            the record
     * @return the string buffer
     */
    protected String createSql(final CsvRecord record) {
        final StringBuilder sql = new StringBuilder();
        sql.append("insert into ");
        sql.append(tableName);
        sql.append(getColumnHeaders());
        sql.append(" VALUES ");
        sql.append(record.toString());
        log.info("sql = {}", sql);
        return sql.toString();
    }
}
