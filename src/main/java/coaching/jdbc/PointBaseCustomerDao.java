/**
 * Data Access Object Template.
 *
 * Created on 07 September 2004, 10:38
 */

package coaching.jdbc;

import java.sql.*;

import org.slf4j.*;

/**
 * Data Access object for Point Base sample customer table.
 *
 * @author martin.spamer
 */
public class PointBaseCustomerDao {

	private static final String DELETE_SQL = "DELETE FROM CUSTOMER_TBL WHERE CUSTOMER_NUM=999";
	private static final Logger LOG = LoggerFactory.getLogger(PointBaseCustomerDao.class);
	private static final String DRIVER = "com.pointbase.jdbc.jdbcUniversalDriver";
	private static final String URL = "jdbc:pointbase:server://localhost/sample";
	private static final String USER = "PBPUBLIC";
	private static final String PASSWORD = "PBPUBLIC";
	private static final String SQL = "SELECT * from customers";
	private static final String INSERT_SQL = "INSERT INTO CUSTOMER_TBL (CUSTOMER_NUM, POSTCODE,DISCOUNT_CODE) VALUES (999,'AA99 9ZZ','N')";
	private static final String UPDATE_SQL = "UPDATE CUSTOMER_TBL SET NAME ='DataMentor' WHERE CUSTOMER_NUM=999";

	/**
	 * Instantiates a DAO for a point base customer.
	 */
	public PointBaseCustomerDao() {
		this(URL, USER, PASSWORD);
	}

	/**
	 * Creates a new instance of DaoTemplate.
	 *
	 * @param connectionUrl the connection url
	 * @param user the user name
	 * @param password the password
	 */
	public PointBaseCustomerDao(final String connectionUrl, final String user, final String password) {
		try {
			Class.forName(DRIVER);
		} catch (final ClassNotFoundException e) {
			LOG.error("{}", e.toString());
		}
	}

	/**
	 * database SQL to
	 * <code>
	 * 	SELECT * from customer table.
	 * </code>
	 * @return
	 */
	public PointBaseCustomerDao read() {
		try {
			final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			final Statement statement = connection.createStatement();
			final ResultSet resultSet = statement.executeQuery(SQL);
			final ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			final int colCount = resultSetMetaData.getColumnCount();

			final StringBuffer output = new StringBuffer();
			while (resultSet.next()) {
				for (int i = 1; i <= colCount; i++) {
					final String columnName = resultSetMetaData.getColumnName(i);
					final Object value = resultSet.getObject(i);
					output.append(columnName + "=");
					if (value != null) {
						final String str = String.format("%s,", value.toString().trim());
						output.append(str);
					}
				}
				output.append("\n");
			}
			LOG.info(output.toString());
			resultSet.close();
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
		return this;
	}

	/**
	 * database SQL to
	 * <code>
	 * 	INSERT INTO CUSTOMER_TBL
	 * 		(CUSTOMER_NUM,POSTCODE,DISCOUNT_CODE)
	 * VALUES
	 * 		(999,'AA99 9ZZ','N')
	 * </code>.
	 * @return
	 */
	public PointBaseCustomerDao write() {
		try {
			final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			final Statement statement = connection.createStatement();
			final int result = statement.executeUpdate(INSERT_SQL);
			final String msg = String.format("Rows updated: %s", result);
			LOG.info(msg);
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
		return this;
	}

	/**
	 * database SQL
	 * <code>
	 * 	UPDATE CUSTOMER_TBL SET NAME ='DataMentor' WHERE CUSTOMER_NUM=999
	 * </code>.
	 * @return
	 */
	public PointBaseCustomerDao update() {
		try {
			final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			final Statement statement = connection.createStatement();
			final int result = statement.executeUpdate(UPDATE_SQL);
			LOG.info("Rows updated {}", result);
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
		return this;
	}

	/**
	 * database SQL
	 * <code>
	 * 	DELETE FROM CUSTOMER_TBL WHERE
	 * FIELD-NAME='VALUE'
	 * </code>.
	 * @return
	 */
	public PointBaseCustomerDao delete() {
		try {
			final Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			final Statement statement = connection.createStatement();
			final int result = statement.executeUpdate(DELETE_SQL);
			LOG.info("Rows updated: {}", result);
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
		return this;
	}
}
