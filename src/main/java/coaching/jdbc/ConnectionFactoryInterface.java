
package coaching.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * The Interface ConnectionFactoryInterface.
 */
public interface ConnectionFactoryInterface {

    /**
     * Get jdbc connection for the database.
     *
     * @return the connection
     * @throws SQLException the SQL exception
     */
    Connection newConnection() throws SQLException;

}
