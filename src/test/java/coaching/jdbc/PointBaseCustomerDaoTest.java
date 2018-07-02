
package coaching.jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * class PointBaseCustomerDaoTest.
 */
@Ignore("Requires PointBase DB availability")
public class PointBaseCustomerDaoTest {

    private static final Logger LOG = LoggerFactory.getLogger(PointBaseCustomerDaoTest.class);

    private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
    private final static String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";
    private final static String USERNAME = "PBPUBLIC";
    private final static String PASSWORD = "PBPUBLIC";

    /**
     * Unit Test to point base customer dao.
     */
    @Test
    public void testPointBaseCustomerDao() {
        final DaoInterface dao = new PointBaseCustomerDao();
        assertNotNull(dao);
    }

    /**
     * Unit Test to point base customer dao url user password.
     */
    @Test
    public void testPointBaseCustomerDaoUrlUserPassword() {
        assertNotNull(new PointBaseCustomerDao());
        try {
            final DaoInterface dao = new PointBaseCustomerDao();
            assertNotNull(dao);
        } catch (final Exception exception) {
            LOG.error(exception.toString());
        }
    }

    /**
     * Unit Test to point base customer dao url user password.
     */
    @Test
    public void testPointBaseCustomerDaoTypical() {
        final PointBaseCustomerDao dao = new PointBaseCustomerDao();
        assertNotNull(dao);
        try {
            dao.create();
            dao.read();
            dao.update();
            dao.delete();
        } catch (final Exception exception) {
            LOG.error(exception.toString());
        }
    }
}
