
package coaching.jdbc;

import java.sql.SQLException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for JdbcBase.
 */
public class JdbcBaseTest {

    /**  provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(JdbcBaseTest.class);

    /**
     * The Class MockJdbcBase.
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
        LOG.info("{}", jdbcBase);
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
        LOG.info("{}", jdbcBase);
        LOG.info("{}", jdbcBase.columnLabels());
        LOG.info("{}", jdbcBase.bodyToString());
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
        LOG.info("{}", jdbcBase);
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
        LOG.info("{}", jdbcBase.columnLabels());
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
        LOG.info("{}", jdbcBase.bodyToString());
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
        LOG.info("{}", jdbcBase);
        LOG.info("{}", jdbcBase.columnLabels());
        LOG.info("{}", jdbcBase.bodyToString());
    }

}
