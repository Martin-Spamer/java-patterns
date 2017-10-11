
package coaching.jdbc;

import static org.junit.Assert.assertNotNull;

import org.junit.*;
import org.slf4j.*;

/**
 * Unit test for XmlDAO class.
 */
@Ignore("Requires PointBase DB availability")
public class XmlDAOTest {

	private static final Logger LOG = LoggerFactory.getLogger(XmlDAOTest.class);
	private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String JDBC_URL = "jdbc:pointbase:server://localhost/sample";
	private static final String USER = "PBPUBLIC";
	private static final String PASSWORD = "PBPUBLIC";
	private static final String SQL = "SELECT * from customers";

	/**
	 * Unit Test to xml DAO.
	 */
	@Test
	public void testXmlDao() {
		final XmlDao dao = new XmlDao();
		assertNotNull("Value cannot be null", dao);
		LOG.info("{}", dao);
	}

	/**
	 * Unit Test to xml dao url user password.
	 */
	@Test
	public void testXmlDaoUrlUserPassword() {
		final XmlDao dao = new XmlDao();
		assertNotNull("Value cannot be null", dao);
		LOG.info("{}", dao);
	}

}
