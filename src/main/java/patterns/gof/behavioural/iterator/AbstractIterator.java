
package patterns.gof.behavioural.iterator;

/**
 * The AbstractIterator Class.
 */
abstract class AbstractIterator {

	/**
	 * First.
	 *
	 * @return the item
	 */
	abstract public Item first();

	/**
	 * Next.
	 *
	 * @return the item
	 */
	abstract public Item next();

	/**
	 * Checks if is done.
	 */
	abstract public void isDone();

	/**
	 * Current item.
	 */
	abstract public void currentItem();
}