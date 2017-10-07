
package coaching.jdbc;

import java.sql.*;

import org.slf4j.*;

/**
 * Abstract Data Access object.
 *
 * @author martin.spamer
 */
public abstract class AbstractDataAccessObject implements DaoInterface {

	protected static final Logger log = LoggerFactory.getLogger(AbstractDataAccessObject.class);
	protected ConnectionFactory connectionFactory;
	protected ResultSet resultSet;
	protected ResultSetMetaData resultSetMetaData;

	/**
	 * Creates a new instance of DaoTemplate.
	 *
	 * @param driverClassName the driver class name
	 */
	public AbstractDataAccessObject(final String driverClassName) {
		try {
			Class.forName(driverClassName);
		} catch (final ClassNotFoundException e) {
			log.error("{}", e.toString());
		}
	}

	/**
	 * Creates a new instance of DaoTemplate.
	 *
	 * @param driverClassName the driver class name
	 * @param connectionUrl the connection url
	 * @param username the username
	 * @param password the password
	 */
	public AbstractDataAccessObject(final String driverClassName,
	        final String connectionUrl,
	        final String username,
	        final String password) {
		this(driverClassName);
		this.connectionFactory = new ConnectionFactory(driverClassName, connectionUrl, username, password);
	}

	/**
	 * database SQL to
	 * <code>
	 * 	INSERT INTO CUSTOMER_TBL
	 * 		(CUSTOMER_NUM,POSTCODE,DISCOUNT_CODE)
	 * 	VALUES
	 * 		(999,'AA99 9ZZ','N')
	 * </code>.
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	@Override
	public DaoInterface create(final String sql) {
		return sql(sql);
	}

	/**
	 * database SQL to
	 * <code>
	 * 	SELECT * from customer table.
	 * </code>
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	@Override
	public DaoInterface read(final String sql) {
		try {
			final Connection connection = this.connectionFactory.getConnection();
			final Statement statement = connection.createStatement();
			final ResultSet resultSet = statement.executeQuery(sql);
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
			log.info(output.toString());
			resultSet.close();
			statement.close();
			connection.close();
		} catch (final SQLException exception) {
			log.error("{}", exception.toString());
		}
		return this;
	}

	/**
	 * database SQL
	 * <code>
	 * 	UPDATE
	 * 		CUSTOMER_TBL
	 * 	SET
	 * 		NAME ='DataMentor'
	 * 	WHERE
	 * 		CUSTOMER_NUM=999
	 * </code>.
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	@Override
	public DaoInterface update(final String sql) {
		return sql(sql);
	}

	/**
	 * database SQL
	 * <code>
	 * 	DELETE FROM
	 * 		CUSTOMER_TBL
	 * 	WHERE
	 * 		FIELD-NAME='VALUE'
	 * </code>.
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	@Override
	public DaoInterface delete(final String sql) {
		return sql(sql);
	}

	public DaoInterface sql(final String sql) {
		try {
			final Connection connection = this.connectionFactory.getConnection();
			final Statement statement = connection.createStatement();
			final int result = statement.executeUpdate(sql);
			log.info("Rows updated: {}", result);
			statement.close();
			connection.close();
		} catch (final SQLException exception) {
			log.error("{}", exception.toString());
		}
		return this;
	}
}
