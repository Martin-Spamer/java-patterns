
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit tests for PointbaseDao class.
 */
@Ignore("Requires PointBase DB availability work-in-progress low-priority")


@Slf4j
public final class PointbaseDaoTest {

    /**
     * Unit Test to point base customer dao.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testPointBaseCustomerDao() throws ClassNotFoundException {
        final DaoInterface dao = new PointbaseDao();
        assertNotNull(dao);
    }

    /**
     * Unit Test to point base customer dao url user password.
     *
     * @throws ClassNotFoundException the class not found exception
     */
    @Test
    public void testPointBaseCustomerDaoTypical() throws ClassNotFoundException {
        final PointbaseDao dao = new PointbaseDao();
        assertNotNull(dao);
        dao.createRow();
        dao.readRow();
        dao.updateRow();
        dao.deleteRow();
    }
}
