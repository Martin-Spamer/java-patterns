

package coaching.jdbc;

/**
 * Data Access Object Interface.
 */
public interface DaoInterface {

	/**
	 * Create record.
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	public DaoInterface create(final String sql);

	/**
	 * Read record.
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	public DaoInterface read(final String sql);

	/**
	 * Update record.
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	public DaoInterface update(final String sql);

	/**
	 * Delete record.
	 *
	 * @param sql the sql
	 * @return this as fluent interface.
	 */
	public DaoInterface delete(final String sql);

}
