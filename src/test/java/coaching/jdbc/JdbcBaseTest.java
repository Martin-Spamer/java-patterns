
package coaching.jdbc;

import java.sql.SQLException;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for JdbcBase.
 */


/** The Constant 			log. */
@Slf4j
public class JdbcBaseTest {

    /**
 * The MockJdbcBase.
     */
    public class MockJdbcBase extends JdbcBase {
    }

    /**
     * Unit test to jdbc base.
     */
    @Test
    public void testJdbcBase() {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        log.info("\tjdbcBase :{}", jdbcBase);
    }

    /**
     * Unit test to query.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testQuery() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        assertEquals(jdbcBase, jdbcBase.query());
        log.info("\tjdbcBase : {}", jdbcBase);
        log.info("\tjdbcBase.columnLabels() : {}", jdbcBase.columnLabels());
        log.info("\tjdbcBase.bodyToString() : {}", jdbcBase.bodyToString());
    }

    /**
     * Unit test to query string.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testQueryString() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        assertEquals(jdbcBase, jdbcBase.query("select count(*) from sqlite_master"));
        log.info("\tjdbcBase : {}", jdbcBase);
    }

    /**
     * Unit test to column labels.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testColumnLabels() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        log.info("\tjdbcBase.columnLabels() : {}", jdbcBase.columnLabels());
    }

    /**
     * Unit test to body to string.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testBodyToString() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        log.info("\tjdbcBase.bodyToString() : {}", jdbcBase.bodyToString());
    }

    /**
     * Unit test to prepared statement.
     *
     * @throws SQLException the SQL exception
     */
    @Test
    public void testPreparedStatement() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        String sql = "select count(*) from sqlite_master";
        assertEquals(jdbcBase, jdbcBase.executePreparedStatement(sql));
        log.info("\tjdbcBase : {}", jdbcBase);
        log.info("\tjdbcBase.columnLabels() : {}", jdbcBase.columnLabels());
        log.info("\tjdbcBase.bodyToString() : {}", jdbcBase.bodyToString());
    }

}
