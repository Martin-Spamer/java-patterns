
package coaching.jdbc;

import java.util.List;

import coaching.csv.CsvRecord;

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

    DaoInterface setTableName(String tableName);

    DaoInterface createTable();

    DaoInterface dropTable();

    void insertRows(List<CsvRecord> rowList);
}
