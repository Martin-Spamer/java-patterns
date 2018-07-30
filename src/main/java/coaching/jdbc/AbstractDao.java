
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
public abstract class AbstractDao implements CrudInterface, DaoInterface {

    /** SQL to DROP the table. */
    public static final String DROP_SQL = "DROP TABLE IF EXISTS {TableName}";

    /** SQL to create the table. */
    // Columns = (id INTEGER, name STRING, details STRING)
    public static final String CREATE_SQL = "CREATE TABLE {TableName} {Columns}";

    /** SQL to count the number of rows in the table. */
    public static final String COUNT_SQL = "SELECT COUNT(*) FROM {TableName}";

    /** SQL to select all rows in the table. */
    public static final String SELECT_SQL = "SELECT * FROM {TableName}";

    /** SQL to insert a row in the table. */
    // {FIELDS} = ({ID}, {NAME}, {DETAILS})
    // {DATA} = ({ID}, {NAME}, {DETAILS})
    public static final String INSERT_SQL = "INSERT INTO {TableName} {FIELDS} VALUES {DATA}";

    /** SQL to update rows in the table. */
    public static final String UPDATE_SQL = "UPDATE {TABLE} SET {FIELD} = {VALUE} WHERE ID = {KEY}";

    /** SQL to delete rows in the table. */
    public static final String DELETE_SQL = "DELETE FROM {TABLE} WHERE ID={KEY}";

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** connection factory. */
    protected ConnectionFactoryInterface connectionFactory;

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
        makeConnectionFactory();
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
        makeConnectionFactory();
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
        setConnectionFactory(makeConnectionFactory());
    }

    private ConnectionFactoryInterface makeConnectionFactory() {
        return new ConnectionFactory(driverClassName, connectionUrl, username,
                password);
    }

    private void initialise() {
        driverClassName = JdbcConfig.driver();
        connectionUrl = JdbcConfig.url();
        username = JdbcConfig.username();
        password = JdbcConfig.password();
        schemaName = JdbcConfig.schema();
        tableName = JdbcConfig.table();
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
            log.error(e.getLocalizedMessage(), e);
            final String message = String
                .format("Class not found for JDBC Driver %s", driverClassName);
            fail(message);
            /** Consider throwing a new DriverNotFoundException */
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setUrl(java.lang.String)
     */
    @Override
    public DaoInterface setUrl(final String url) {
        connectionUrl = url;
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

    public DaoInterface setConnectionFactory(
            final ConnectionFactoryInterface connectionFactory) {
        this.connectionFactory = connectionFactory;
        return this;
    }

    /**
     * Execute a SQL insert statement for CRUD interface.
     *
     * @param sql the sql
     * @return this as fluent interface.
     */
    @Override
    public CrudInterface create(final String sql) {
        return executePreparedStatement(sql);
    }

    /**
     * Execute a SQL select statement for CRUD interface.
     *
     * @param sql the sql
     * @return this as fluent interface.
     */
    @Override
    public CrudInterface read(final String sql) {
        return executePreparedStatement(sql);
    }

    /**
     * Execute a SQL update statement for CRUD interface.
     *
     * @param sql
     *            the sql
     * @return this as fluent interface.
     */
    @Override
    public CrudInterface update(final String sql) {
        return executePreparedStatement(sql);
    }

    /**
     * Execute a SQL delete statement for CRUD interface.
     *
     * @param sql
     *            the sql
     * @return this as fluent interface.
     */
    @Override
    public CrudInterface delete(final String sql) {
        return executePreparedStatement(sql);
    }

    /**
     * execute an SQL statement.
     *
     * @param sql the sql
     * @return the dao interface
     */
    protected CrudInterface executePreparedStatement(final String sql) {
        log.info("executePreparedStatement({}", sql);
        try {
            final Connection connection = connectionFactory.newConnection();
            final PreparedStatement preparedStatement = connection
                .prepareStatement(sql);
            final int result = preparedStatement.executeUpdate();
            log.info("Rows updated: {}", result);
            preparedStatement.close();
            connection.close();
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Execute query.
     *
     * @param sql the sql
     * @return the dao interface
     */
    protected CrudInterface executeQuery(final String sql) {
        try {
            final Connection connection = connectionFactory.newConnection();
            final Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            processResultSet(resultSet);
            resultSet.close();
            statement.close();
            connection.close();
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
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
            log.debug("resultSet = {}", resultSet);
            final String rowAsString = processRow(resultSet);
            log.info("rowAsString = {}", rowAsString);
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
                log.info("{}", msg);
                output.append(msg);
            } else {
                final String msg = String
                    .format(
                            "%s = %s,",
                            columnName,
                            value.toString().trim());
                log.info("{}", msg);
                output.append(msg);
            }
        }
        return output.toString();
    }

    /**
     * DriverNotFoundException.
     */
    public class DriverNotFoundException extends ClassNotFoundException {

        public DriverNotFoundException(final String message,
                final ClassNotFoundException e) {
        }

        /** serialVersionUID constant. */
        private static final long serialVersionUID = 1L;

    }
}
