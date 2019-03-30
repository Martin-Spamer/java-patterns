
package coaching.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Data Access object.
 *
 * Uses domain language to provide a CRUD interface. Create Read Update Delete
 * interface.
 */
public abstract class AbstractDao extends JdbcBase implements CrudInterface, DaoInterface {

    /** DROP_SQL constant. */
    public static final String DROP_SQL = "DROP TABLE IF EXISTS {TableName}";

    /** CREATE_SQL constant. */
    // Columns = (id INTEGER, name STRING, details STRING)
    public static final String CREATE_SQL = "CREATE TABLE {TableName} {ColumnNames}";

    /** COUNT_SQL constant. */
    public static final String COUNT_SQL = "SELECT COUNT(*) FROM {TableName}";

    /** SELECT_SQL constant. */
    public static final String SELECT_SQL = "SELECT * FROM {TableName}";

    /** SELECT_COLUMNS_SQL constant. */
    public static final String SELECT_COLUMNS_SQL = "SELECT {ColumnNames} FROM {TableName}";

    // {FIELDS} = ({ID}, {NAME}, {DETAILS})
    // {DATA} = ({ID}, {NAME}, {DETAILS})
    /** INSERT_SQL constant. */
    public static final String INSERT_SQL = "INSERT INTO {TableName} {ColumnNames} VALUES {ColumnValues}";

    /** UPDATE_SQL constant. */
    public static final String UPDATE_SQL = "UPDATE {TableName} SET {Field} = {Value} WHERE ID = {Key}";

    /** DELETE_SQL constant. */
    public static final String DELETE_SQL = "DELETE FROM {TableName} WHERE ID={Key}";

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    /** The jdbc driver. */
    private String jdbcDriver;

    /** The jdbc url. */
    private String jdbcUrl;

    /** The username. */
    private String username;

    /** The password. */
    private String password;

    /** Name of schema. */
    private String schemaName;

    /** Name of table. */
    private String tableName;

    /** resultSet. */
    protected ResultSet resultSet;

    /** resultSetMetaData. */
    protected ResultSetMetaData resultSetMetaData;

    /** The connection factory. */
    protected ConnectionFactory connectionFactory;

    /**
     * Default Constructor.
     */
    public AbstractDao() {
        super();
    }

    /**
     * Instantiates a new abstract dao.
     *
     * @param jdbcDriver the jdbc driver
     * @param jdbcUrl the jdbc url
     * @param username the username
     * @param password the password
     */
    public AbstractDao(final String jdbcDriver, final String jdbcUrl, final String username, final String password) {
        super();
        this.jdbcDriver = jdbcDriver;
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
        connectionFactory = new ConnectionFactory(this.jdbcDriver, this.jdbcUrl, this.username, this.password);
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setDriver(java.lang.String)
     */
    @Override
    public DaoInterface setDriver(final String jdbcDriver) throws ClassNotFoundException {
        this.jdbcDriver = jdbcDriver;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#setUrl(java.lang.String)
     */
    @Override
    public DaoInterface setUrl(final String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
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

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#createTable()
     */
    @Override
    public DaoInterface createTable() {
        try {
            executePreparedStatement(prepare(CREATE_SQL));
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see coaching.jdbc.DaoInterface#dropTable()
     */
    @Override
    public DaoInterface dropTable() {
        try {
            executePreparedStatement(prepare(DROP_SQL));
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /* (non-Javadoc)
    * @see coaching.jdbc.DaoInterface#describeTable()
    */
    @Override
    public DaoInterface describeTable() {
        return null;
    }

    /**
     * Factory method to create a new instance of AbstractDao.
     *
     * @return new instance of AbstractDao
     */
    @Override
    public CrudInterface createRow() {
        try {
            executePreparedStatement(prepareInsert());
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Creates the row.
     *
     * @param dto the dto
     * @return the crud interface
     */
    protected CrudInterface createRow(final AbstractDto dto) {
        return this;
    }

    /**
     * Creates the row.
     *
     * @param sql the sql
     * @return the crud interface
     */
    protected CrudInterface createRow(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Prepare insert.
     *
     * @return the string
     */
    private String prepareInsert() {
        final String columns = prepareColumns();
        return CREATE_SQL.replace("{ColumnNames}", columns);
    }

    /**
     * Prepare columns.
     *
     * @return the string
     */
    private String prepareColumns() {
        return "(id INTEGER, name STRING, details STRING)";
    }

    /**
     * Read.
     *
     * @return the crud interface
     */
    @Override
    public CrudInterface readRow() {
        try {
            executePreparedStatement(prepare(SELECT_SQL));
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Read rows.
     *
     * @param sql the sql
     * @return the crud interface
     */
    protected CrudInterface readRow(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Count rows.
     *
     * @return the crud interface
     */
    public CrudInterface countRows() {
        try {
            executePreparedStatement(prepare(COUNT_SQL));
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
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

    /**
     * Update row.
     *
     * @param sql the sql
     * @return the crud interface
     */
    public CrudInterface updateRow(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Prepare update sql.
     *
     * @return the string
     */
    private String prepareUpdateSql() {
        return prepare(UPDATE_SQL);
    }

    /**
     * Delete.
     *
     * @return the crud interface
     */
    @Override
    public CrudInterface deleteRow() {
        try {
            executePreparedStatement(prepareDeleteSql());
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Delete row.
     *
     * @param sql the sql
     * @return the crud interface
     */
    public CrudInterface deleteRow(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (final SQLException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Prepare delete sql.
     *
     * @return the string
     */
    private String prepareDeleteSql() {
        return prepare(DELETE_SQL);
    }

    /**
     * Prepare the SQL with Schema and GenericTable names.
     *
     * @param sql the SQL statement
     * @return the prepare
     */
    private String prepare(final String sql) {
        return sql.replace("{SchemaName}", schemaName).replace("{TableName}", tableName);
    }

}
