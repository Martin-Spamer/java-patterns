
package coaching.xml;

import coaching.jdbc.*;

/**
 * class MySqlDao.
 */
public class MySqlDao extends AbstractDataAccessObject {

	private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";
	private static final String USERNAME = "pbpublic";
	private static final String PASSWORD = "pbpublic";

	private static final String SELECT_SQL = "SELECT * from customers";
	private static final String INSERT_SQL = "INSERT INTO CUSTOMER_TBL (CUSTOMER_NUM, POSTCODE,DISCOUNT_CODE) VALUES (999,'AA99 9ZZ','N')";
	private static final String UPDATE_SQL = "UPDATE CUSTOMER_TBL SET NAME ='DataMentor' WHERE CUSTOMER_NUM=999";
	private static final String DELETE_SQL = "DELETE FROM CUSTOMER_TBL WHERE CUSTOMER_NUM=999";

	/**
	 * Instantiates a new my sql dao.
	 */
	public MySqlDao() {
		this(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
	}

	/**
	 * Instantiates a new my sql dao.
	 *
	 * @param driverClassName the driver class name
	 * @param connectionUrl the connection url
	 * @param username the username
	 * @param password the password
	 */
	private MySqlDao(final String driverClassName,
	        final String connectionUrl,
	        final String username,
	        final String password) {
		super(driverClassName, connectionUrl, username, password);
	}

	/**
	 * Creates the.
	 */
	public void create() {
		super.create(INSERT_SQL);
	}

	/**
	 * Read.
	 */
	public void read() {
		super.read(SELECT_SQL);
	}

	/**
	 * Update.
	 */
	public void update() {
		super.update(UPDATE_SQL);
	}

	/**
	 * Delete.
	 */
	public void delete() {
		super.delete(DELETE_SQL);
	}

	/* (non-Javadoc)
	 * @see coaching.jdbc.AbstractDataAccessObject#sql(java.lang.String)
	 */
	@Override
	public DaoInterface sql(final String sql) {
		return super.sql(sql);
	}

}
