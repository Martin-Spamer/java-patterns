
package coaching.jdbc;

/**
 * An interface for JDBC Data Access Object.
 */
public interface DaoInterface {

    /**
     * Sets the driver.
     *
     * @param driver the driver
     * @return this for a fluent interface.
     * @throws ClassNotFoundException the class not found exception
     */
    DaoInterface setDriver(final String driver) throws ClassNotFoundException;

    /**
     * Sets the url.
     *
     * @param url the JDBC connection url.
     * @return this for a fluent interface.
     */
    DaoInterface setUrl(final String url);

    /**
     * Sets the username.
     *
     * @param username the username
     * @return this for a fluent interface.
     */
    DaoInterface setUsername(final String username);

    /**
     * Sets the password.
     *
     * @param password the password
     * @return this for a fluent interface.
     */
    DaoInterface setPassword(final String password);

    /**
     * Sets the schema name.
     *
     * @param schemaName the schema
     * @return this for a fluent interface.
     */
    DaoInterface setSchemaName(final String schemaName);

    /**
     * Sets the table name.
     *
     * @param tableName the table name
     * @return the dao interface
     */
    DaoInterface setTableName(String tableName);

    /**
     * Creates the table.
     *
     * @return the dao interface
     */
    DaoInterface createTable();

    /**
     * Drop table.
     *
     * @return the dao interface
     */
    DaoInterface dropTable();

}
