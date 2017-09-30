
package coaching.csv;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.*;

/**
 * CsvToJdbcTest Class.
 */
public class CsvToJdbcTest {
	protected final Logger log = LoggerFactory.getLogger(CsvToJdbcTest.class);
	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "password";
	private final String filename = "./data/data.csv";
	private final String tableName = "tableName";

	/**
	 * Fluent Interface.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testFluentInterface() throws Exception {
		final CsvToJdbc instance = new CsvToJdbc();
		assertEquals(instance, instance.setDriver(DRIVER));
		assertEquals(instance, instance.setUrl(URL));
		assertEquals(instance, instance.setUsername(USERNAME));
		assertEquals(instance, instance.setPassword(PASSWORD));
		assertEquals(instance, instance.setTableName(tableName));
		assertEquals(instance, instance.setFilename(filename));
	}

}
