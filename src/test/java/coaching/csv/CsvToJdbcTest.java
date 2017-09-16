package coaching.csv;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.*;

/**
 * CsvToJdbcTest Class.
 */
public class CsvToJdbcTest {

	protected final Logger log = LoggerFactory.getLogger(CsvToJdbcTest.class);
	private final String filename = "./data/data.csv";
	private final String driver = "org.postgresql.Driver";
	private final String url = "jdbc:postgresql://localhost";
	private final String username = "postgres";
	private final String password = "password";
	private final String tableName = "tableName";

	/**
	 * Fluent Interface.
	 *
	 * exception
	 *
	 * @throws Exception the exception
	 */
	@Test
	public void testFluentInterface() throws Exception {
		final CsvToJdbc instance = new CsvToJdbc();
		assertEquals(instance, instance.setFilename(this.filename));
		assertEquals(instance, instance.setDriver(this.driver));
		assertEquals(instance, instance.setUrl(this.url));
		assertEquals(instance, instance.setUsername(this.username));
		assertEquals(instance, instance.setPassword(this.password));
		assertEquals(instance, instance.setTableName(this.tableName));
	}

}
