/**
 *  @title			AbstractResourcePool.java
 *  @description	TODO
 *	Created			28-Oct-2004
 **/

package coaching.pool;

import java.util.*;

import org.slf4j.*;

/**
 * AbstractResourcePool Class.
 *
 * generic type
 *
 * @param <T> the generic type
 */
public abstract class AbstractAltResourcePool<T> {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected int maxPoolSize = Integer.MAX_VALUE;
	protected int defaultPoolSize = Integer.MAX_VALUE;
	protected int minPoolSize = Integer.MIN_VALUE;
	protected Stack<T> freePool = new Stack<T>();
	protected Set<T> usedPool = new HashSet<T>();

	/**
	 * Borrow resource from pool.
	 *
	 * @return the t
	 * @throws ResourceBorrowException the resource borrow exception
	 */
	public synchronized T borrow() throws ResourceBorrowException {
		T resource = null;

		// pool of free resources is empty
		if (this.freePool.isEmpty()) {
			// threshold
			if (this.usedPool.size() < this.maxPoolSize) {
				// make a new object
				try {
					resource = create();
				} catch (final ResourceCreationException exception) {
					this.log.error("{}", exception.toString());
					throw new ResourceBorrowException(exception);
				}
			} else {
				// TODO: throw resource constraint exception ?
				this.log.info("Used({}) < maxPoolSize({})", this.usedPool.size(), this.maxPoolSize);
			}
		} else {
			// first valid resource
			resource = this.freePool.pop();

			// used resource pool.
			this.usedPool.add(resource);
		}
		return resource;
	}

	/**
	 * Allows pool to create resources to re-populate the pool.
	 *
	 * @return the t
	 * @throws ResourceCreationException the resource creation exception
	 */
	public abstract T create() throws ResourceCreationException;

	/**
	 * Discard a resource to the pool.
	 *
	 * @param resource the resource
	 */
	public synchronized void discard(final T resource) {
		// in use pool.
		this.usedPool.remove(resource);

		// free pool
		this.freePool.push(resource);
	}

	/**
	 * Grow the pool.
	 *
	 * @param growthRate the growth rate
	 */
	public synchronized void grow(final int growthRate) {
		this.defaultPoolSize += growthRate;
	}

	/**
	 * Release a resource back to pool.
	 *
	 * @param resource the resource
	 * @throws ResourceReleaseException the resource release exception
	 */
	public synchronized void release(final T resource) throws ResourceReleaseException {
		// * in use pool.
		this.usedPool.remove(resource);

		// * free pool
		this.freePool.push(resource);
	}

	/**
	 * Shrink the pool size.
	 *
	 * @param shrinkRate the shrink rate
	 */
	public synchronized void shrink(final int shrinkRate) {
		this.defaultPoolSize -= shrinkRate;
	}

}
