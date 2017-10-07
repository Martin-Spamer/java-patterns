
package coaching.jdbc;

/**
 * Data Access Object Interface.
 */
public interface DaoInterface {

	/**
	 * Create record.
	 *
	 * @return this as fluent interface.
	 */
	public DaoInterface create(final String sql);

	/**
	 * Read record.
	 *
	 * @return this as fluent interface.
	 */
	public DaoInterface read(final String sql);

	/**
	 * Update record.
	 *
	 * @return this as fluent interface.
	 */
	public DaoInterface update(final String sql);

	/**
	 * Delete record.
	 *
	 * @return this as fluent interface.
	 */
	public DaoInterface delete(final String sql);

}
