
package idioms.pool;

/**
 * The PoolInterface Interface.
 *
 * @param <E> the element type
 */
public interface PoolInterface<E> {

	/**
	 * Adds the.
	 *
	 * @param element the element
	 * @return the pool interface
	 */
	PoolInterface<E> add(E element);

	/**
	 * Count free.
	 *
	 * @return the int
	 */
	int countFree();

	/**
	 * Count used.
	 *
	 * @return the int
	 */
	int countUsed();

	/**
	 * Take element from the pool
	 *
	 * @return the e
	 */
	E take();

	/**
	 * Release element back to pool.
	 *
	 * @param t the t
	 * @return the pool interface
	 */
	PoolInterface<E> release(E t);

	/**
	 * Removes the element from the pool.
	 *
	 * @param element the element
	 * @return the pool interface
	 */
	PoolInterface<E> remove(E element);

}
