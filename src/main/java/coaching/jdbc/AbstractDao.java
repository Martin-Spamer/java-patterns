
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
    static final String DROP_SQL = "DROP TABLE IF EXISTS {TableName}";

    /** SQL to create the table. */
    // CREATE TABLE {} (id INTEGER, name STRING, details STRING)
    static final String CREATE_SQL = "CREATE TABLE {TableName} {Columns}";

    /** SQL to count the number of rows in the table. */
    static final String COUNT_SQL = "SELECT (*) FROM {TableName}";

    /** SQL to select all rows in the table. */
    static final String SELECT_SQL = "SELECT * FROM {TableName}";

    /** SQL to insert a row in the table. */
    // INSERT INTO {} (ID, NAME, DATA) VALUES (999,'...','...')
    static final String INSERT_SQL = "INSERT INTO TableName {FIELDS} VALUES {DATA}";

    /** SQL to update rows in the table. */
    // UPDATE TABLE SET FIELD = 'Value' WHERE ID=999
    static final String UPDATE_SQL = "UPDATE {TABLE} SET FIELD = {VALUE} WHERE ID= {KEY}";

    /** SQL to delete rows in the table. */
    // DELETE_SQL = "DELETE FROM TABLE WHERE ID=999
    static final String DELETE_SQL = "DELETE FROM {TABLE} WHERE ID= {KEY}999";

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** connection factory. */
    protected ConnectionFactoryInterface connectionFactory;

    /** JDBC driver class. */
    private String driver;

    /** JDBC Connection URL. */
    private String url;

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
    }

    /**
     * Creates a new instance of AbstractDao.
     *
     * @param driverClassName the driver class name
     * @throws ClassNotFoundException
     */
    public AbstractDao(final String driverClassName) {
        super();
        setDriver(driverClassName);
    }

    /**
     * Creates a new instance of AbstractDao.
     *
     * @param driverClassName the driver class name
     * @param connectionUrl the connection url
     * @param username the username
     * @param password the password
     * @throws ClassNotFoundException
     */
    public AbstractDao(final String driverClassName,
            final String connectionUrl,
            final String username,
            final String password) {
        this(driverClassName);
        connectionFactory = new ConnectionFactory(driverClassName, connectionUrl, username, password);
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setDriver(java.lang.String)
     */
    @Override
    public DaoInterface setDriver(final String driverClassName) {
        try {
            Class.forName(driverClassName);
            driver = driverClassName;
        } catch (final ClassNotFoundException e) {
            log.error(e.toString(), e);
            fail(String.format("JDBC Driver %s not found", driverClassName));
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setUrl(java.lang.String)
     */
    @Override
    public DaoInterface setUrl(final String url) {
        this.url = url;
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

    @Override
    public DaoInterface setSchemaName(final String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    @Override
    public DaoInterface setTableName(final String tableName) {
        this.tableName = tableName;
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
     * execute an sql statement.
     *
     * @param sql
     *            the sql
     * @return the dao interface
     */
    protected CrudInterface executePreparedStatement(final String sql) {
        try {
            final Connection connection = connectionFactory.newConnection();
            final PreparedStatement preparedStatement = connection.prepareStatement(sql);
            final int result = preparedStatement.executeUpdate();
            log.info("Rows updated: {}", result);
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            log.error(e.toString(), e);
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
            Connection connection = connectionFactory.newConnection();

            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            processResultSet(resultSet);

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            log.error(e.toString(), e);
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
    private void processResultSet(final ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            log.info(processRow(resultSet));
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
        final StringBuffer output = new StringBuffer();
        for (int i = 1; i <= colCount; i++) {
            final String columnName = metaData.getColumnName(i);
            final Object value = resultSet.getObject(i);
            if (value == null) {
                output.append(String.format("%s = null,", columnName));
            } else {
                output.append(String.format("%s = %s,", columnName, value.toString().trim()));
            }
        }
        return output.toString();
    }

    public class DriverNotFoundException extends ClassNotFoundException {

        private static final long serialVersionUID = 1L;

    }
}
