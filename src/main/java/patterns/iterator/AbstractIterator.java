
package patterns.iterator;

/**
 * AbstractIterator Class.
 */
public abstract class AbstractIterator {

	/**
	 * First.
	 *
	 * abstract item
	 *
	 * @return the abstract item
	 */
	abstract public AbstractItem first();

	/**
	 * Next.
	 *
	 * abstract item
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