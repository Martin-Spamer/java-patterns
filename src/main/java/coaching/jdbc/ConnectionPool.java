
package coaching.jdbc;

import java.sql.Connection;
import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;

/**
 * A Pool class for JDBC connections.
 */
@SuppressWarnings("serial")


@Slf4j
public final class ConnectionPool extends ArrayList<Connection> {

}
