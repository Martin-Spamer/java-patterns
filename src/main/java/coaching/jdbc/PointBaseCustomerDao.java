/**
 * Data Access Object Template.
 *
 * Created on 07 September 2004, 10:38
 */

package coaching.jdbc;

/**
 * Data Access object for Point Base sample customer table.
 *
 * @author martin.spamer
 */
public final class PointBaseCustomerDao extends AbstractDataAccessObject {

	private static final String JDBC_DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String JDBC_URL = "jdbc:pointbase:server://localhost/sample";
	private static final String USER = "PBPUBLIC";
	private static final String PASSWORD = "PBPUBLIC";

	private static final String SELECT_SQL = "SELECT * from customers";
	private static final String INSERT_SQL = "INSERT INTO CUSTOMER_TBL (CUSTOMER_NUM, POSTCODE,DISCOUNT_CODE) VALUES (999,'AA99 9ZZ','N')";
	private static final String UPDATE_SQL = "UPDATE CUSTOMER_TBL SET NAME ='DataMentor' WHERE CUSTOMER_NUM=999";
	private static final String DELETE_SQL = "DELETE FROM CUSTOMER_TBL WHERE CUSTOMER_NUM=999";

	/**
	 * Instantiates a DAO for a point base customer.
	 */
	public PointBaseCustomerDao() {
		super(JDBC_DRIVER, JDBC_URL, USER, PASSWORD);
	}

	public void create() {
		super.create(INSERT_SQL);
	}

	public void read() {
		super.create(SELECT_SQL);
	}

	public void update() {
		super.create(UPDATE_SQL);
	}

	public void delete() {
		super.create(DELETE_SQL);
	}

}
