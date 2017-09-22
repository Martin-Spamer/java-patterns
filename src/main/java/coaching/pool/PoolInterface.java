

package coaching.pool;

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
	 * @param element the element
	 * @return the pool interface
	 */
	public PoolInterface<E> add(E element);

	/**
	 * Count free.
	 *
	 * @return the int
	 */
	public int countFree();

	/**
	 * Count used.
	 *
	 * @return the int
	 */
	public int countUsed();

	/**
	 * pool.
	 *
	 * @return the e
	 */
	public E take();

	/**
	 * Release element back to pool.
	 *
	 * @param t the t
	 * @return the pool interface
	 */
	public PoolInterface<E> release(E t);

	/**
	 * pool.
	 *
	 * @param element the element
	 * @return the pool interface
	 */
	public PoolInterface<E> remove(E element);

}
