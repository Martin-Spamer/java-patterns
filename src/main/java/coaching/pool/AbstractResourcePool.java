

package coaching.pool;

import java.util.concurrent.LinkedBlockingDeque;

import org.slf4j.*;

/**
 * Abstract Resource Pool class.
 *
 * @param <E> the element type
 */
public abstract class AbstractResourcePool<E> implements PoolInterface<E> {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected LinkedBlockingDeque<E> freePool;
	protected LinkedBlockingDeque<E> usedPool;

	/**
	 * Instantiates a new abstract resource pool.
	 */
	public AbstractResourcePool() {
		this.freePool = new LinkedBlockingDeque<E>();
		this.usedPool = new LinkedBlockingDeque<E>();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#add(java.lang.Object)
	 */
	@Override
	public synchronized AbstractResourcePool<E> add(final E resource) {
		this.freePool.add(resource);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#countFree()
	 */
	@Override
	public synchronized int countFree() {
		final int size = this.freePool.size();
		return size;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#countUsed()
	 */
	@Override
	public synchronized int countUsed() {
		final int size = this.usedPool.size();
		return size;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#take()
	 */
	@Override
	public E take() {
		final E resourceFromList = getResourceFromList();
		return resourceFromList;
	}

	/**
	 * resource from list.
	 *
	 * resource from list
	 *
	 * @return the resource from list
	 */
	protected synchronized E getResourceFromList() {
		E resource = null;

		synchronized (this) {
			// See if there is a resource available.
			if (this.freePool.size() > 0) {
				// * free list
				resource = this.freePool.pop();

				// * used list
				this.usedPool.add(resource);
			}
		}
		return resource;
	}

	/**
	 * Offer.
	 *
	 * resource
	 *
	 * @param resource the resource
	 * @return true, if successful
	 */
	protected synchronized boolean offer(final E resource) {
		return this.freePool.offer(resource);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#release(java.lang.Object)
	 */
	@Override
	public synchronized AbstractResourcePool<E> release(final E resource) {
		synchronized (this) {
			if (this.freePool.add(resource)) {
				this.usedPool.remove(resource);
			}
		}
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#remove(java.lang.Object)
	 */
	@Override
	public synchronized AbstractResourcePool<E> remove(final E resource) {
		synchronized (this) {
			this.freePool.remove(resource);
			this.usedPool.remove(resource);
		}
		return this;
	}
}
