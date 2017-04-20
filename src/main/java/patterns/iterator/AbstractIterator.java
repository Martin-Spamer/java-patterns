
package patterns.iterator;

/**
 * The AbstractIterator Class.
 */
public abstract class AbstractIterator {

	/**
	 * First.
	 *
	 * @return the abstract item
	 */
	abstract public AbstractItem first();

	/**
	 * Next.
	 *
	 * @return the abstract item
	 */
	abstract public AbstractItem next();

	/**
	 * Checks if is done.
	 */
	abstract public void isDone();

	/**
	 * Current item.
	 */
	abstract public void currentItem();
}