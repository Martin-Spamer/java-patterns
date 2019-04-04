
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for PostgreSqlDao class.
 */
@Ignore("Requires PostgreSqlDao DB availability work-in-progress low-priority")
@Slf4j
public final class PostgreSqlDaoTest {

    /**
     * Unit Test to point base customer dao.
     */
    @Test
    public void testPostgresSqlDao() {
        final DaoInterface dao = new PostgresSqlDao();
        assertNotNull(dao);
    }

    /**
     * Unit Test to point base customer dao url user password.
     */
    @Test
    public void testPostgresSqlDaoTypical() {
        PostgresSqlDao dao = new PostgresSqlDao();
        assertNotNull(dao);
        dao.createRow();
        dao.readRow();
        dao.updateRow();
        dao.deleteRow();
    }

}
