/**
 * JdbcTest.java
 *
 * Created on 06 June 2005, 09:28
 */

package coaching.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An abstract JDBC base class to be extended to create a DAO.
 */
public abstract class JdbcBase {

    /** EXECUTION_ERROR constant. */
    private static final String EXECUTION_ERROR = "Executing the SQL\n\t%s\nfailed with error\n\t%s";

    /** provides logging. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The query results. */
    protected ResultSet resultSet = null;

    /** The metadata for the results. */
    protected ResultSetMetaData resultSetMetaData = null;

    /** The metadata for the entire database. */
    protected DatabaseMetaData databaseMetaData = null;

    /**
     * Query.
     *
     * @return this for a fluent interface.
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
     * @return this for a fluent interface.
     * @throws SQLException the SQL exception
     */
    protected JdbcBase query(final String query) throws SQLException {
        this.log.info("query({})", query);

        final Connection connection = ConnectionFactory.getConnection();
        final Statement statement = connection.createStatement();

        this.resultSet = statement.executeQuery(query);
        this.resultSetMetaData = this.resultSet.getMetaData();
        return this;
    }

    /**
     * Execute query.
     *
     * @param sql the sql
     * @return this for a fluent interface.
     * @throws SQLException the SQL exception
     */
    protected JdbcBase executeQuery(final String sql) throws SQLException {
        this.log.info("executeQuery({})", sql);

        final Connection connection = ConnectionFactory.getConnection();
        final Statement statement = connection.createStatement();

        this.resultSet = statement.executeQuery(sql);
        processResultSet(this.resultSet);

        this.resultSet.close();
        statement.close();
        connection.close();
        return this;
    }

    /**
     * execute an SQL statement.
     *
     * @param sql the sql
     * @return this for a fluent interface.
     * @throws SQLException the SQL exception
     */
    protected JdbcBase executePreparedStatement(final String sql) throws SQLException {
        this.log.info("executePreparedStatement({})", sql);

        final Connection connection = ConnectionFactory.getConnection();
        final PreparedStatement preparedStatement = connection.prepareStatement(sql);

        final boolean result = preparedStatement.execute();
        this.log.info("Rows updated : {}", result);

        preparedStatement.close();
        connection.close();

        return this;
    }

    /**
     * Handle result set.
     *
     * @param resultSet the result set
     * @throws SQLException the SQL exception
     */
    private void processResultSet(final ResultSet resultSet) throws SQLException {
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
     * @param resultSet the result set
     * @return the string
     * @throws SQLException the SQL exception
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
                final String msg = String.format("%s = %s,", columnName, value.toString().trim());
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
        public DriverNotFoundException(final String message, final ClassNotFoundException e) {
            super(message, e);
        }

    }

    /**
     * Body to string.
     *
     * @return the string
     * @throws SQLException the SQL exception
     */
    protected String bodyToString() throws SQLException {
        final List<String> columns = columnLabels();
        final List<String> values = new ArrayList<>();
        if (this.resultSet != null) {
            while (this.resultSet.next()) {
                for (final String columnName : columns) {
                    values.add(this.resultSet.getString(columnName));
                }
            }
        }
        return values.toString();
    }

    /**
     * Column labels.
     *
     * @return the list
     * @throws SQLException the SQL exception
     */
    protected List<String> columnLabels() throws SQLException {
        final List<String> columns = new ArrayList<>();
        if (this.resultSetMetaData != null) {
            for (int i = 1; i < this.resultSetMetaData.getColumnCount(); i++) {
                final String columnName = this.resultSetMetaData.getColumnName(i);
                columns.add(columnName);
            }
        }
        return columns;
    }

    /**
     * Close.
     */
    @Override
    protected void finalize() {
        try {
            this.resultSet.close();
        } catch (final SQLException e) {
            this.log.error(e.getLocalizedMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [resultSet=%s, resultSetMetaData=%s, databaseMetaData=%s]",
            this.getClass().getSimpleName(),
            this.resultSet,
            this.resultSetMetaData,
            this.databaseMetaData);
    }

}
