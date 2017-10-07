package coaching.jdbc;

import static org.junit.Assert.assertNotNull;

import java.sql.*;

import org.junit.Test;

public class ConnectionFactoryTest {

	@Test
	public void testConnectionFactory() throws SQLException {
		final ConnectionFactory connectionFactory = new ConnectionFactory();
		assertNotNull(connectionFactory);
		final Connection connection = connectionFactory.getConnection();
		assertNotNull(connection);
		connection.close();
	}

}
