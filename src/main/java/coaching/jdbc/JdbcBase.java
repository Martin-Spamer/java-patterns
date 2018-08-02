/**
 * JdbcTest.java
 *
 * Created on 06 June 2005, 09:28
 */

package coaching.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An abstract JDBC base class to be extended to create a DAO.
 */
public abstract class JdbcBase {

    /** provides logging. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** Provides JDBC connections. */
    protected ConnectionFactory connectionFactory = null;

    /** Current connection. */
    protected Connection connection = null;

    /** The SQL statement. */
    protected Statement statement = null;

    /** The query results. */
    protected ResultSet resultSet = null;

    /** The metadata for the results. */
    protected ResultSetMetaData resultSetMetaData = null;

    /** The metadata for the entire database. */
    protected DatabaseMetaData databaseMetaData = null;

    /**
     * Instantiates a new jdbc base.
     */
    public JdbcBase() {
        initialise();
    }

    /**
     * Initialise.
     */
    private void initialise() {
        this.connectionFactory = ConnectionFactory.getInstance();
    }

    /**
     * Query.
     *
     * @return the jdbc base
     * @throws SQLException the SQL exception
     */
    protected JdbcBase query() throws SQLException {
        final String query = JdbcConfig.query();
        return query(query);
    }

    /**
     * Query.
     *
     * @param query the query
     * @return the jdbc base
     * @throws SQLException the SQL exception
     */
    protected JdbcBase query(final String query) throws SQLException {
        this.connection = this.connectionFactory.newConnection();
        this.statement = this.connection.createStatement();
        this.resultSet = this.statement.executeQuery(query);
        this.resultSetMetaData = this.resultSet.getMetaData();
        return this;
    }

    /**
     * Column labels.
     *
     * @return the array list< string>
     * @throws SQLException the SQL exception
     */
    protected ArrayList<String> columnLabels() throws SQLException {
        final ArrayList<String> columns = new ArrayList<String>();
        for (int i = 1; i < this.resultSetMetaData.getColumnCount(); i++) {
            final String columnName = this.resultSetMetaData.getColumnName(i);
            columns.add(columnName);
        }
        return columns;
    }

    /**
     * Body to string.
     *
     * @return the string
     * @throws SQLException
     */
    protected String bodyToString() throws SQLException {
        final ArrayList<String> columns = columnLabels();
        final ArrayList<String> values = new ArrayList<String>();

        while (this.resultSet.next()) {
            for (final String columnName : columns) {
                values.add(this.resultSet.getString(columnName));
            }
            return values.toString();
        }
        return null;
    }

    /**
     * Close.
     */
    public void close() {
        try {
            this.resultSet.close();
            this.statement.close();
            this.connection.close();
        } catch (final SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#finalize()
     */
    @Override
    public void finalize() {
        close();
    }

    @Override
    public String toString() {
        return String
            .format("%s [statement=%s, resultSet=%s, resultSetMetaData=%s, databaseMetaData=%s]",
                    this.getClass().getSimpleName(),
                    this.statement,
                    this.resultSet,
                    this.resultSetMetaData,
                    this.databaseMetaData);
    }

}
