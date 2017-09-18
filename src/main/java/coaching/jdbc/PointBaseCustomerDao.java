/*
 * Template for Dao - Data Access Object
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

	private static final String SELECT_FROM_CUSTOMERS = "SELECT * from customers";
	private static final Logger LOG = LoggerFactory.getLogger(PointBaseCustomerDao.class);
	private Connection connection = null;

	/**
	 * Instantiates a new point base customer dao.
	 */
	public PointBaseCustomerDao() {
		this("", "", "");
	}

	/**
	 * Creates a new instance of DaoTemplate.
	 *
	 * @param connectionUrl the connection url
	 * @param userId the user id
	 * @param password the password
	 */
	public PointBaseCustomerDao(final String connectionUrl, final String userId, final String password) {
		try {
			this.connection = DriverManager.getConnection(connectionUrl, userId, password);
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/**
	 * database SQL to
	 * <code>
	 * SELECT * from customer table.
	 * </code>
	 */
	public void read() {
		try {
			final Statement statement = this.connection.createStatement();
			final ResultSet resultSet = statement.executeQuery(SELECT_FROM_CUSTOMERS);
			final ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

			final int colCount = resultSetMetaData.getColumnCount();

			final StringBuffer output = new StringBuffer();
			while (resultSet.next()) {
				for (int i = 1; i <= colCount; i++) {
					final String columnName = resultSetMetaData.getColumnName(i);
					final Object value = resultSet.getObject(i);
					output.append(columnName + "=");
					if (value != null) {
						output.append(value.toString().trim() + ",");
					}
				}
				output.append("\n");
			}

			LOG.info(output.toString());

			resultSet.close();
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/**
	 * database SQL to
	 * <code>INSERT INTO CUSTOMER_TBL
	 * 	(CUSTOMER_NUM,POSTCODE,DISCOUNT_CODE)
	 * VALUES
	 * 	(999,'AA99 9ZZ','N')
	 * </code>
	 */
	public void write() {
		try {
			final Statement statement = this.connection.createStatement();

			final String sql = "INSERT INTO CUSTOMER_TBL (CUSTOMER_NUM, POSTCODE,DISCOUNT_CODE) VALUES (999,'AA99 9ZZ','N')";
			final int result = statement.executeUpdate(sql);

			LOG.info("Rows updated: " + result + " for " + sql);
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/**
	 * database SQL
	 * <code>
	 * UPDATE CUSTOMER_TBL SET NAME ='DataMentor' WHERE CUSTOMER_NUM=999
	 * </code>
	 */
	public void update() {
		try {
			final Statement statement = this.connection.createStatement();
			final String sql = "UPDATE CUSTOMER_TBL SET NAME ='DataMentor' WHERE CUSTOMER_NUM=999";
			final int result = statement.executeUpdate(sql);
			LOG.info("Rows updated: " + result + " for " + sql);
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/**
	 * database SQL
	 * <code>
	 * 	DELETE FROM CUSTOMER_TBL WHERE
	 * FIELD-NAME='VALUE'
	 * </code>
	 */
	public void delete() {
		try {
			final Statement statement = this.connection.createStatement();
			final String sql = "DELETE FROM CUSTOMER_TBL WHERE CUSTOMER_NUM=999";
			final int result = statement.executeUpdate(sql);
			LOG.info("Rows updated: " + result + " for " + sql);
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/** * DB connection. */
	@Override
	public void finalize() {
		try {
			this.connection.close();
		} catch (final SQLException exception) {
			LOG.error("{}", exception.toString());
		}
	}

	/**
	 * main method.
	 *
	 * command line arguments
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final String connectionUrl = "jdbc:pointbase://localhost:9092/sample";
		final String userId = "PBPUBLIC";
		final String password = "PBPUBLIC";

		try {
			Class.forName("com.pointbase.jdbc.jdbcUniversalDriver");

			try {
				final PointBaseCustomerDao dao = new PointBaseCustomerDao(connectionUrl, userId, password);
				dao.read();
				dao.write();
				dao.update();
				dao.delete();
			} catch (final Exception exception) {
				LOG.error("{}", exception.toString());
			}
		} catch (final Exception exception) {
			LOG.error("{}", exception.toString());
		}
	}
}
