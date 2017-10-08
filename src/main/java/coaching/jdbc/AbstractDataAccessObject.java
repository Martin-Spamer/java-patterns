
package coaching.jdbc;

import java.sql.*;

import org.slf4j.*;

/**
 * Abstract Data Access object.
 *
 * Uses domain language to provide Create Read Update Delete interface.
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
	 * Execute a SQL insert statement for CRUD interface.
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
	 * Execute a SQL select statement for CRUD interface.
	 * <code>
	 * 	SELECT * from customer table.
	 * </code>
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	@Override
	public DaoInterface read(final String sql) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = this.connectionFactory.getConnection();
			statement = connection.createStatement();
			this.resultSet = statement.executeQuery(sql);
			this.resultSetMetaData = this.resultSet.getMetaData();
			final int colCount = this.resultSetMetaData.getColumnCount();

			final StringBuffer output = new StringBuffer();
			while (this.resultSet.next()) {
				for (int i = 1; i <= colCount; i++) {
					final String columnName = this.resultSetMetaData.getColumnName(i);
					final Object value = this.resultSet.getObject(i);
					output.append(columnName + "=");
					if (value != null) {
						final String str = String.format("%s,", value.toString().trim());
						output.append(str);
					}
				}
				output.append("\n");
			}
			log.info(output.toString());
			this.resultSet.close();
			statement.close();
			connection.close();
		} catch (final SQLException exception) {
			log.error("{}", exception.toString());
		} finally {
			try {
				if (this.resultSet != null) {
					this.resultSet.close();
				}
			} catch (final Exception e) {
				log.error("{}", e);
			}
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (final Exception e) {
				log.error("{}", e);
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (final Exception e) {
				log.error("{}", e.toString());
			}
		}
		return this;
	}

	/**
	 * Execute a SQL update statement for CRUD interface.
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
	 * Execute a SQL delete statement for CRUD interface.
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

	/**
	 * execute an sql statement.
	 *
	 * @param sql the sql
	 * @return the dao interface
	 */
	public DaoInterface sql(final String sql) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = this.connectionFactory.getConnection();
			statement = connection.createStatement();
			final int result = statement.executeUpdate(sql);
			log.info("Rows updated: {}", result);
			statement.close();
			connection.close();
		} catch (final SQLException exception) {
			log.error("{}", exception.toString());
		} finally {
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (final Exception e) {
				log.error("{}", e);
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (final Exception e) {
				log.error("{}", e);
			}
		}
		return this;
	}
}
