
package coaching.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for Sqlite.
 */


@Slf4j
public final class SqliteTest {

    /**
     * Unit test to Sqlite.
     *
     * @throws Exception the exception
     */
    @Test
    public void testSqlite() throws Exception {
        final String JDBC_DRIVER = "org.sqlite.JDBC";
        final String JDBC_URL = "jdbc:sqlite::memory:";
        final String USERNAME = "username";
        final String PASSWORD = "password";

        final Connection connection = ConnectionFactory.getConnection();

        final Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);

        createTable(statement);

        insertRecords(statement);
        selectRecords(statement);

        updateRecords(statement);
        selectRecords(statement);

        deleteRecords(statement);
        selectRecords(statement);
    }

    /**
     * Creates the table.
     *
     * @param statement the statement
     * @throws SQLException the SQL exception
     */
    private void createTable(final Statement statement) throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS customer");
        statement.executeUpdate("CREATE TABLE customer (id INTEGER, name STRING, data STRING)");
    }

    /**
     * Insert records.
     *
     * @param statement the statement
     * @throws SQLException the SQL exception
     */
    private void insertRecords(final Statement statement) throws SQLException {
        final int ids[] = { 1, 2, 3, 4, 5 };
        final String names[] = { "Dick Turpin", "Robin Hood", "William Tell", "James Bond", "Robinson Crusoe" };
        for (int i = 0; i < ids.length; i++) {
            final String insert = "INSERT INTO customer values('%s', '%s', null)";
            final String sql = String.format(insert, ids[i], names[i]);
            statement.executeUpdate(sql);
        }
    }

    /**
     * Update records.
     *
     * @param statement the statement
     * @throws SQLException the SQL exception
     */
    private void updateRecords(final Statement statement) throws SQLException {
        statement.executeUpdate("UPDATE customer SET data='VIP' WHERE id='1'");
    }

    /**
     * Select records.
     *
     * @param statement the statement
     * @throws SQLException the SQL exception
     */
    private void selectRecords(final Statement statement) throws SQLException {
        final ResultSet resultSet = statement.executeQuery("SELECT * from customer");
        while (resultSet.next()) {
            log.info("{}) {} {}", resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("data"));
        }
    }

    /**
     * Delete records.
     *
     * @param statement the statement
     * @throws SQLException the SQL exception
     */
    private void deleteRecords(final Statement statement) throws SQLException {
        statement.executeUpdate("DELETE FROM customer WHERE id='5'");
    }

}
