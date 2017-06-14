
package javamentor.pool;

/**
 * PoolInterface Interface.
 *
 * element type
 *
 * @param <E> the element type
 */
public interface PoolInterface<E> {

	/**
	 * Adds the.
	 *
	 * element
	 * pool interface
	 *
	 * @param element the element
	 * @return the pool interface
	 */
	PoolInterface<E> add(E element);

	/**
	 * Count free.
	 *
	 * int
	 *
	 * @return the int
	 */
	int countFree();

	/**
	 * Count used.
	 *
	 * int
	 *
	 * @return the int
	 */
	int countUsed();

	/**
	 * pool.
	 *
	 * e
	 *
	 * @return the e
	 */
	E take();

	/**
	 * Release element back to pool.
	 *
	 * t
	 * pool interface
	 *
	 * @param t the t
	 * @return the pool interface
	 */
	PoolInterface<E> release(E t);

	/**
	 * pool.
	 *
	 * element
	 * pool interface
	 *
	 * @param element the element
	 * @return the pool interface
	 */
	PoolInterface<E> remove(E element);

}
