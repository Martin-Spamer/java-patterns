
package coaching.jdbc;

import java.sql.SQLException;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JdbcBaseTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(JdbcBaseTest.class);

    public class MockJdbcBase extends JdbcBase {
    }

    @Test
    public void testJdbcBase() {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        LOG.info("{}", jdbcBase);
    }

    @Test
    public void testQuery() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        assertEquals(jdbcBase, jdbcBase.query());
        LOG.info("{}", jdbcBase);
        LOG.info("{}", jdbcBase.columnLabels());
        LOG.info("{}", jdbcBase.bodyToString());
    }

    @Test
    public void testQueryString() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        assertEquals(jdbcBase, jdbcBase.query("select count(*) from sqlite_master"));
        LOG.info("{}", jdbcBase);
    }

    @Test
    public void testColumnLabels() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        LOG.info("{}", jdbcBase.columnLabels());
    }

    @Test
    public void testBodyToString() throws SQLException {
        JdbcBase jdbcBase = new MockJdbcBase();
        assertNotNull(jdbcBase);
        LOG.info("{}", jdbcBase.bodyToString());
    }

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
