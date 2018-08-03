
package coaching.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.fail;

/**
 * Abstract Data Access object.
 *
 * Uses domain language to provide a CRUD interface.
 * Create Read Update Delete interface.
 */
public abstract class AbstractDao
        extends JdbcBase
        implements CrudInterface, DaoInterface {

    private static final String JDBC_DRIVER_NOT_FOUND = "Class not found for JDBC Driver %s";
    private static final String EXECUTION_ERROR = "Executing the SQL\n\t%s\nfailed with error\n\t%s";

    public static final String DROP_SQL = "DROP TABLE IF EXISTS {TableName}";
    // Columns = (id INTEGER, name STRING, details STRING)
    public static final String CREATE_SQL = "CREATE TABLE {TableName} {ColumnNames}";
    public static final String COUNT_SQL = "SELECT COUNT(*) FROM {TableName}";
    public static final String SELECT_SQL = "SELECT * FROM {TableName}";
    public static final String SELECT_COLUMNS_SQL = "SELECT {ColumnNames} FROM {TableName}";
    // {FIELDS} = ({ID}, {NAME}, {DETAILS})
    // {DATA} = ({ID}, {NAME}, {DETAILS})
    public static final String INSERT_SQL = "INSERT INTO {TableName} {ColumnNames} VALUES {ColumnValues}";
    public static final String UPDATE_SQL = "UPDATE {TableName} SET {Field} = {Value} WHERE ID = {Key}";
    public static final String DELETE_SQL = "DELETE FROM {TableName} WHERE ID={Key}";

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** JDBC driver class. */
    private String driverClassName;

    /** JDBC Connection URL. */
    private String connectionUrl;

    /** JDBC username. */
    private String username;

    /** JDBC password. */
    private String password;

    /** Name of schema. */
    private String schemaName;

    /** Name of table. */
    private String tableName;

    /** resultSet. */
    protected ResultSet resultSet;

    /** resultSetMetaData. */
    protected ResultSetMetaData resultSetMetaData;

    /**
     * Default Constructor.
     */
    public AbstractDao() {
        super();
        initialise();
    }

    /**
     * Creates a new instance of AbstractDao.
     *
     * @param driverClassName the driver class name
     */
    public AbstractDao(final String driverClassName) {
        super();
        initialise();
        setDriver(driverClassName);
    }

    /**
     * Creates a new instance of AbstractDao.
     *
     * @param driverClassName the driver class name
     * @param connectionUrl the connection url
     * @param username the username
     * @param password the password
     */
    public AbstractDao(final String driverClassName,
            final String connectionUrl,
            final String username,
            final String password) {
        setDriver(driverClassName);
        setUrl(connectionUrl);
        setUsername(username);
        setPassword(password);
    }

    /**
     * Initialise.
     */
    private void initialise() {
        this.driverClassName = JdbcConfig.driver();
        this.connectionUrl = JdbcConfig.url();
        this.username = JdbcConfig.username();
        this.password = JdbcConfig.password();
        this.schemaName = JdbcConfig.schema();
        this.tableName = JdbcConfig.table();
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setDriver(java.lang.String)
     */
    @Override
    public DaoInterface setDriver(final String driverClassName) {
        try {
            Class.forName(driverClassName);
            this.driverClassName = driverClassName;
        } catch (final ClassNotFoundException e) {
            final String errMsg = String
                .format(JDBC_DRIVER_NOT_FOUND, driverClassName);
            this.log.error(errMsg, e);
            fail(errMsg);
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setUrl(java.lang.String)
     */
    @Override
    public DaoInterface setUrl(final String url) {
        this.connectionUrl = url;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setUsername(java.lang.String)
     */
    @Override
    public DaoInterface setUsername(final String username) {
        this.username = username;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setPassword(java.lang.String)
     */
    @Override
    public DaoInterface setPassword(final String password) {
        this.password = password;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setSchemaName(java.lang.String)
     */
    @Override
    public DaoInterface setSchemaName(final String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setTableName(java.lang.String)
     */
    @Override
    public DaoInterface setTableName(final String tableName) {
        this.tableName = tableName;
        return this;
    }

    @Override
    public DaoInterface createTable() {
        executePreparedStatement(CREATE_SQL);
        return this;
    }

    @Override
    public DaoInterface dropTable() {
        executePreparedStatement(DROP_SQL);
        return this;
    }

    /**
     * Factory method to create a new instance of AbstractDao.
     *
     * @return new instance of AbstractDao
     */
    @Override
    public CrudInterface createRow() {
        executePreparedStatement(prepareInsert());
        return this;
    }

    protected CrudInterface createRow(final String sql) {
        executePreparedStatement(sql);
        return this;
    }

    private String prepareInsert() {
        final String columns = prepareColumns();
        return CREATE_SQL.replace("{ColumnNames}", columns);
    }

    private String prepareColumns() {
        return "(id INTEGER, name STRING, details STRING)";
    }

    public CrudInterface countRows() {
        executePreparedStatement(COUNT_SQL);
        return this;
    }

    /**
     * Read.
     *
     * @return the crud interface
     */
    @Override
    public CrudInterface readRows() {
        executePreparedStatement(SELECT_SQL);
        return this;
    }

    protected CrudInterface readRows(final String sql) {
        executePreparedStatement(sql);
        return this;
    }

    /**
     * Update.
     *
     * @return the crud interface
     */
    @Override
    public CrudInterface updateRow() {
        return updateRow(prepareUpdateSql());
    }

    public CrudInterface updateRow(final String sql) {
        executePreparedStatement(sql);
        return this;
    }

    private String prepareUpdateSql() {
        return UPDATE_SQL
            .replace("{SchemaName}", this.schemaName)
            .replace("{TableName}", this.tableName);
    }

    /**
     * Delete.
     *
     * @return the crud interface
     */
    @Override
    public CrudInterface deleteRow() {
        executePreparedStatement(prepareDeleteSql());
        return this;
    }

    public CrudInterface deleteRow(final String sql) {
        executePreparedStatement(sql);
        return this;
    }

    private String prepareDeleteSql() {
        return DELETE_SQL
            .replace("{SchemaName}", this.schemaName)
            .replace("{TableName}", this.tableName);
    }

    /**
     * execute an SQL statement.
     *
     * @param sql the sql
     * @return the dao interface
     */
    protected void executePreparedStatement(final String sql) {
        this.log.info("executePreparedStatement({}", sql);

        final String statement = prepare(sql);

        try {
            final Connection connection = ConnectionFactory.getConnection();
            final PreparedStatement preparedStatement = connection
                .prepareStatement(statement);
            final int result = preparedStatement.executeUpdate();
            this.log.info("Rows updated: {}", result);
            preparedStatement.close();
            connection.close();
        } catch (final SQLException e) {
            final String errMsg = String
                .format(EXECUTION_ERROR, sql, e.getLocalizedMessage());
            this.log.error(errMsg, e);
            fail(errMsg);
        }
    }

    /**
     * Prepare the SQL with Schema and Table names.
     *
     * @param sql the SQL statement
     * @return the prepare
     */
    private String prepare(final String sql) {
        return sql
            .replace("{SchemaName}", this.schemaName)
            .replace("{TableName}", this.tableName);
    }

    /**
     * Execute query.
     *
     * @param sql the sql
     * @return the dao interface
     */
    protected CrudInterface executeQuery(final String sql) {
        try {
            final Connection connection = ConnectionFactory.getConnection();
            final Statement statement = connection.createStatement();
            this.resultSet = statement.executeQuery(sql);
            processResultSet(this.resultSet);
            this.resultSet.close();
            statement.close();
            connection.close();
        } catch (final SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Handle result set.
     *
     * @param resultSet
     *            the result set
     * @throws SQLException
     *             the SQL exception
     */
    private void processResultSet(final ResultSet resultSet)
            throws SQLException {
        final StringBuilder output = new StringBuilder();
        while (resultSet.next()) {
            this.log.debug("resultSet = {}", resultSet);
            final String rowAsString = processRow(resultSet);
            this.log.info("rowAsString = {}", rowAsString);
            output.append(rowAsString);
        }
    }

    /**
     * Process row.
     *
     * @param resultSet
     *            the result set
     * @return the string
     * @throws SQLException
     *             the SQL exception
     */
    private String processRow(final ResultSet resultSet) throws SQLException {
        final ResultSetMetaData metaData = resultSet.getMetaData();
        final int colCount = metaData.getColumnCount();
        final StringBuilder output = new StringBuilder();
        for (int i = 1; i <= colCount; i++) {
            final String columnName = metaData.getColumnName(i);
            final Object value = resultSet.getObject(i);
            if (value == null) {
                final String msg = String.format("%s = null,", columnName);
                this.log.info("{}", msg);
                output.append(msg);
            } else {
                final String msg = String
                    .format(
                            "%s = %s,",
                            columnName,
                            value.toString().trim());
                this.log.info("{}", msg);
                output.append(msg);
            }
        }
        return output.toString();
    }

    /**
     * DriverNotFoundException.
     */
    public class DriverNotFoundException extends ClassNotFoundException {
        /** serialVersionUID constant. */
        private static final long serialVersionUID = 1L;

        /**
         * Instantiates a new driver not found exception.
         *
         * @param message the message
         * @param e the e
         */
        public DriverNotFoundException(final String message,
                final ClassNotFoundException e) {
            super(message, e);
        }

    }

}
