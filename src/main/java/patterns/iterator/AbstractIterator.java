
package patterns.iterator;

/**
 * AbstractIterator Class.
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
	abstract public boolean isDone();

	/**
	 * Current item.
	 */
	abstract public AbstractItem currentItem();

}
