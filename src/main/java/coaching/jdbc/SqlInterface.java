
package coaching.jdbc;

/**
 * The SQL Interface.
 *
 * Good mapping with SQL domain language. Poor mapping with with business domain
 * language. API includes the SQL admin commands.
 *
 */
public interface SqlInterface {

    /**
     * Create the table.
     *
     * @param createSql the create sql
     * @return this for a fluent interface.
     */
    DaoInterface create(final String createSql);

    /**
     * Insert a row in the table.
     *
     * @param insertSql the insert sql
     * @return this for a fluent interface.
     */
    DaoInterface insert(final String insertSql);

    /**
     * select a row in the table.
     *
     * @param sql the select sql.
     * @return this for a fluent interface.
     */
    DaoInterface select(final String sql);

    /**
     * Update row in the table.
     *
     * @param sql the update sql as a String object.
     * @return this for a fluent interface.
     */
    DaoInterface update(final String sql);

    /**
     * Delete row in the table.
     *
     * @param sql the delete sql as a String object.
     * @return this for a fluent interface.
     */
    DaoInterface delete(final String sql);

    /**
     * Drop (delete) the table from the database.
     *
     * @param sql the delete sql as a String object.
     * @return this for a fluent interface.
     */
    DaoInterface drop(final String sql);

}
