
package coaching.pool;

/**
 * Pool Interface.
 *
 * @param <E> the element type
 */
public interface PoolInterface<E> {

	/**
	 * Adds element to the pool.
	 *
	 * @param element the element
	 * @return the pool interface
	 */
	public PoolInterface<E> add(final E element);

	/**
	 * Count the number of free elements.
	 *
	 * @return the int
	 */
	public int countFree();

	/**
	 * Count the number used elements.
	 *
	 * @return the int
	 */
	public int countUsed();

	/**
	 * Take an element from the pool.
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
	public PoolInterface<E> release(final E t);

	/**
	 * remove an from the pool.
	 *
	 * @param element the element
	 * @return the pool interface
	 */
	public PoolInterface<E> remove(final E element);

}
