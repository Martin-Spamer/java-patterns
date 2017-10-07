

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
		final DaoInterface dao = new PointBaseCustomerDao();
		assertNotNull("Value cannot be null", dao);
	}

	/**
	 * Unit Test to point base customer dao url user password.
	 */
	@Test
	public void testPointBaseCustomerDaoUrlUserPassword() {
		assertNotNull("Value cannot be null", new PointBaseCustomerDao());
		try {
			final DaoInterface dao = new PointBaseCustomerDao();
			assertNotNull("Value cannot be null", dao);
		} catch (final Exception exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/**
	 * Unit Test to point base customer dao url user password.
	 */
	@Test
	public void testPointBaseCustomerDaoTypical() {
		final PointBaseCustomerDao dao = new PointBaseCustomerDao();
		assertNotNull("Value cannot be null", dao);
		try {
			dao.create();
			dao.read();
			dao.update();
			dao.delete();
		} catch (final Exception exception) {
			LOG.error("{}", exception.toString());
		}
	}
}
