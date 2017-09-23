
package coaching.jdbc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * class PointBaseCustomerDaoTest.
 */
public class PointBaseCustomerDaoTest {

	private static final Logger LOG = LoggerFactory.getLogger(PointBaseCustomerDaoTest.class);
	private final static String URL = "jdbc:pointbase://localhost:9092/sample";
	private final static String USER = "PBPUBLIC";
	private final static String PASSWORD = "PBPUBLIC";

	/**
	 * Unit Test to point base customer dao.
	 */
	@Test
	public void testPointBaseCustomerDao() {
		final PointBaseCustomerDao dao = new PointBaseCustomerDao();
		assertNotNull(dao);
	}

	/**
	 * Unit Test to point base customer dao url user password.
	 */
	@Test
	public void testPointBaseCustomerDaoUrlUserPassword() {
		assertNotNull(new PointBaseCustomerDao());
		try {
			final PointBaseCustomerDao dao = new PointBaseCustomerDao(URL, USER, PASSWORD);
			assertNotNull(dao);
		} catch (final Exception exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/**
	 * Unit Test to point base customer dao url user password.
	 */
	@Test
	public void testPointBaseCustomerDaoTypical() {
		assertNotNull(new PointBaseCustomerDao());
		try {
			final PointBaseCustomerDao dao = new PointBaseCustomerDao(URL, USER, PASSWORD);
			dao.read();
			dao.write();
			dao.update();
			dao.delete();
		} catch (final Exception exception) {
			LOG.error("{}", exception.toString());
		}
	}
}
