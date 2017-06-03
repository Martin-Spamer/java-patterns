/**
 *  @title       AbstractResourcePool.java
 *  @description TODO
 *	Created      28-Oct-2004
 **/

package idioms.pool;

import java.util.HashSet;
import java.util.Stack;

/**
 * The AbstractResourcePool Class.
 *
 * @param <T> the generic type
 */
public abstract class AltAbstractResourcePool<T> {

	protected int maxPoolSize = Integer.MAX_VALUE;
	protected int defaultPoolSize = Integer.MAX_VALUE;
	protected int minPoolSize = Integer.MIN_VALUE;
	protected Stack<T> freePool = null;
	protected HashSet<T> usedPool = null;

	/**
	 * Instantiates a new abstract resource pool.
	 *
	 * @throws ResourcePoolCreationException the resource pool creation
	 *             exception
	 */
	public AltAbstractResourcePool() throws ResourcePoolCreationException {
		try {
			this.freePool = new Stack<>();
			this.usedPool = new HashSet<>();
		} catch (final Exception exception) {
			throw new ResourcePoolCreationException(exception);
		}
	}

	/**
	 * Borrow.
	 *
	 * @return the t
	 * @throws ResourceBorrowException the resource borrow exception
	 */
	public synchronized T borrow() throws ResourceBorrowException {
		T resource = null;

		// if the pool of free resources is empty
		if (this.freePool.isEmpty()) {
			// if the usedPool is smaller than the threshold
			if (this.usedPool.size() < this.maxPoolSize) {
				// make a new object
				try {
					resource = create();
				} catch (final ResourceCreationException resourceCreationException) {
					throw new ResourceBorrowException(resourceCreationException);
				}
			} else {
				// TODO: throw resource constraint exception ?
			}
		} else {
			// return the first valid resource
			resource = this.freePool.pop();

			// move the valid resource to the used resource pool.
			this.usedPool.add(resource);
		}
		return resource;
	}

	/**
	 * Creates the.
	 *
	 * @return the t
	 * @throws ResourceCreationException the resource creation exception
	 */
	public abstract T create() throws ResourceCreationException;

	/**
	 * Discard.
	 *
	 * @param resource the resource
	 */
	public synchronized void discard(final T resource) {
		// remove the resource from the in use pool.
		this.usedPool.remove(resource);

		// return the resource to the free pool
		this.freePool.push(resource);
	}

	/**
	 * Grow.
	 *
	 * @param growthRate the growth rate
	 */
	public synchronized void grow(final int growthRate) {
		this.defaultPoolSize += growthRate;
	}

	/**
	 * Release.
	 *
	 * @param resource the resource
	 * @throws ResourceReleaseException the resource release exception
	 */
	public synchronized void release(final T resource) throws ResourceReleaseException {
		// remove the resource from the in use pool.
		this.usedPool.remove(resource);

		// return the resource to the free pool
		this.freePool.push(resource);
	}

	/**
	 * Shrink.
	 *
	 * @param shrinkRate the shrink rate
	 */
	public synchronized void shrink(final int shrinkRate) {
		this.defaultPoolSize -= shrinkRate;
	}

}
