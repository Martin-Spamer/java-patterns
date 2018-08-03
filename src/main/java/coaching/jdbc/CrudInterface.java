
package coaching.jdbc;

/**
 * The CRUD (Create, Read, Update, Delete) Interface.
 * Good mapping with business domain language.
 * Useful to isolate the dangerous admin SQL commands.
 * Poor mapping with SQL domain language. ++
 *
 */
public interface CrudInterface {

    /**
     * Create record or row in the table.
     *
     * @return this for a fluent interface.
     */
    CrudInterface createRow();

    /**
     * Read record or row in the table.
     *
     * @return this for a fluent interface.
     */
    CrudInterface readRows();

    /**
     * Update record or row in the table.
     *
     * @return this for a fluent interface.
     */
    CrudInterface updateRow();

    /**
     * Delete record or row in the table.
     *
     * @return this for a fluent interface.
     */
    CrudInterface deleteRow();

}
