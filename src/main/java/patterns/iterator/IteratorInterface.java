package patterns.iterator;

/**
 * interface IteratorInterface.
 */
public interface IteratorInterface {

	/**
	 * Current item.
	 *
	 * @return the item interface
	 */
	public ItemInterface currentItem();

	/**
	 * Checks if is done.
	 *
	 * @return true, if successful, otherwise false.
	 * 			done
	 */
	public boolean isDone();

	/**
	 * Next.
	 *
	 * @return the item interface
	 */
	public ItemInterface next();

	/**
	 * First.
	 *
	 * @return the item interface
	 */
	public ItemInterface first();

}
