
package coaching.jdbc;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract Data Access object.
 *
 * Uses domain language to provide a CRUD interface.
 * Create Read Update Delete interface.
 */
public abstract class AbstractDao extends JdbcBase
        implements CrudInterface, DaoInterface {

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

    private String jdbcUrl;
    private String username;
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

    public AbstractDao(final String jdbcDriver,
            final String jdbcUrl,
            final String username,
            final String password) {
        super();
    }

    @Override
    public DaoInterface setDriver(final String driver)
            throws ClassNotFoundException {
        return this;
    }

    @Override
    public DaoInterface setUrl(final String url) {
        return this;
    }

    @Override
    public DaoInterface setUsername(final String username) {
        return this;
    }

    @Override
    public DaoInterface setPassword(final String password) {
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
        try {
            executePreparedStatement(prepare(CREATE_SQL));
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    @Override
    public DaoInterface dropTable() {
        try {
            executePreparedStatement(prepare(DROP_SQL));
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
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
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    protected CrudInterface createRow(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
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
        try {
            executePreparedStatement(prepare(COUNT_SQL));
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    /**
     * Read.
     *
     * @return the crud interface
     */
    @Override
    public CrudInterface readRows() {
        try {
            executePreparedStatement(prepare(SELECT_SQL));
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    protected CrudInterface readRows(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
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

    public CrudInterface updateRow(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

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
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    public CrudInterface deleteRow(final String sql) {
        try {
            executePreparedStatement(sql);
        } catch (SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
        return this;
    }

    private String prepareDeleteSql() {
        return prepare(DELETE_SQL);
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

}
