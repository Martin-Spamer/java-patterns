
package coaching.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit tests for Sqlite.
 */
public final class SqliteTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SqliteTest.class);

    /**
     * Unit test to sqlite.
     *
     * @throws Exception the exception
     */
    @Test
    public void testSqlite() throws Exception {

        Class.forName("org.sqlite.JDBC");
        final Connection connection = DriverManager
            .getConnection("jdbc:sqlite:memory");

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
        statement
            .executeUpdate(
                    "CREATE TABLE customer (id INTEGER, name STRING, data STRING)");
    }

    /**
     * Insert records.
     *
     * @param statement the statement
     * @throws SQLException the SQL exception
     */
    private void insertRecords(final Statement statement) throws SQLException {
        final int ids[] = { 1, 2, 3, 4, 5 };
        final String names[] = { "Dick Turpin", "Robin Hood", "William Tell",
                "James Bond", "Robinson Crusoe" };

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
        final ResultSet resultSet = statement
            .executeQuery("SELECT * from customer");
        while (resultSet.next()) {
            LOG
                .info("{}) {} {}",
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("data"));
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
