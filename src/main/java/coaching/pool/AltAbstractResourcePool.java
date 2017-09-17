/**
 *  @title       AbstractResourcePool.java
 *  @description TODO
 *	Created      28-Oct-2004
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
public abstract class AltAbstractResourcePool<T> {
	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected int maxPoolSize = Integer.MAX_VALUE;
	protected int defaultPoolSize = Integer.MAX_VALUE;
	protected int minPoolSize = Integer.MIN_VALUE;
	protected Stack<T> freePool = null;
	protected HashSet<T> usedPool = null;

	/**
	 * Instantiates a new abstract resource pool.
	 *
	 * @throws ResourcePoolCreationException the resource pool creation exception
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

		// * pool of free resources is empty
		if (this.freePool.isEmpty()) {
			// * threshold
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
			// * first valid resource
			resource = this.freePool.pop();

			// * used resource pool.
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
		// * in use pool.
		this.usedPool.remove(resource);

		// * free pool
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
		// * in use pool.
		this.usedPool.remove(resource);

		// * free pool
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
