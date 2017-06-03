
package idioms.csv;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import idioms.csv.CsvToJdbc;

/**
 * The CsvToJdbcTest Class.
 */
public class CsvToJdbcTest {

	/** The log. */
	protected final Logger log = LoggerFactory.getLogger(CsvToJdbcTest.class);

	/** The filename. */
	private final String filename = "./data/data.csv";

	/** The driver. */
	private final String driver = "org.postgresql.Driver";

	/** The url. */
	private final String url = "jdbc:postgresql://localhost";

	/** The username. */
	private final String username = "postgres";

	/** The password. */
	private final String password = "password";

	/** The table name. */
	private final String tableName = "tableName";

	/**
	 * Test process.
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testProcess() throws Exception {
		final CsvToJdbc instance = new CsvToJdbc();
		assertEquals(instance, instance.setFilename(this.filename));
		assertEquals(instance, instance.setDriver(this.driver));
		assertEquals(instance, instance.setUrl(this.url));
		assertEquals(instance, instance.setUsername(this.username));
		assertEquals(instance, instance.setPassword(this.password));
		assertEquals(instance, instance.setTableName(this.tableName));
	}

}
