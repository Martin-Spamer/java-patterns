

package coaching.jdbc;

import static org.junit.Assert.assertNotNull;

import java.sql.*;

import org.junit.Test;

/**
 * Unit test for the ConnectionFactory class.
 */
public class ConnectionFactoryTest {

	/**
	 * Unit Test for typical usage of connection factory.
	 *
	 * @throws SQLException the SQL exception
	 */
	@Test
	public void testConnectionFactory() throws SQLException {
		final ConnectionFactory connectionFactory = new ConnectionFactory();
		assertNotNull(connectionFactory);
		final Connection connection = connectionFactory.getConnection();
		assertNotNull(connection);
		connection.close();
	}

}