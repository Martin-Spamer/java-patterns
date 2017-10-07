package coaching.xml;

import coaching.jdbc.*;

public class MySqlDao extends AbstractDataAccessObject {

	private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String JDBC_URL = "jdbc:pointbase://localhost:9092/sample";
	private static final String USERNAME = "pbpublic";
	private static final String PASSWORD = "pbpublic";

	private static final String SELECT_SQL = "SELECT * from customers";
	private static final String INSERT_SQL = "INSERT INTO CUSTOMER_TBL (CUSTOMER_NUM, POSTCODE,DISCOUNT_CODE) VALUES (999,'AA99 9ZZ','N')";
	private static final String UPDATE_SQL = "UPDATE CUSTOMER_TBL SET NAME ='DataMentor' WHERE CUSTOMER_NUM=999";
	private static final String DELETE_SQL = "DELETE FROM CUSTOMER_TBL WHERE CUSTOMER_NUM=999";

	public MySqlDao() {
		this(JDBC_DRIVER, JDBC_URL, USERNAME, PASSWORD);
	}

	/**
	 * @param driverClassName
	 * @param connectionUrl
	 * @param username
	 * @param password
	 */
	private MySqlDao(final String driverClassName,
	        final String connectionUrl,
	        final String username,
	        final String password) {
		super(driverClassName, connectionUrl, username, password);
	}

	public void create() {
		super.create(INSERT_SQL);
	}

	public void read() {
		super.read(SELECT_SQL);
	}

	public void update() {
		super.update(UPDATE_SQL);
	}

	public void delete() {
		super.delete(DELETE_SQL);
	}

	@Override
	public DaoInterface sql(final String sql) {
		return super.sql(sql);
	}

}
