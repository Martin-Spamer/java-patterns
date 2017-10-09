
package coaching.jdbc;

/**
 * class CachedTable.
 */
public class CachedTable extends AbstractDataAccessObject {

	private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";
	private static final String USERNAME = "pbpublic";
	private static final String PASSWORD = "pbpublic";

	/**
	 * Instantiates a new cached table.
	 */
	public CachedTable() {
		super(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
	}

}
