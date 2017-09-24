

package patterns.iterator;

/**
 * Iterator Interface.
 */
public interface IteratorInterface {

	/**
	 * First item.
	 *
	 * @return the item interface
	 */
	public ItemInterface first();

	/**
	 * Current item.
	 *
	 * @return the item interface
	 */
	public ItemInterface currentItem();

	/**
	 * Next item.
	 *
	 * @return the item interface
	 */
	public ItemInterface next();

	/**
	 * Checks if is done.
	 *
	 * @return true, if successful, otherwise false.
	 */
	public boolean isDone();

}
