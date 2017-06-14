
package javamentor.pool;

import java.util.concurrent.LinkedBlockingDeque;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * BlockingPool Class.
 *
 * generic type
 *
 * @param <E> the element type
 */
public abstract class BlockingPool<E> implements PoolInterface<E> {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected LinkedBlockingDeque<E> freePool;
	protected LinkedBlockingDeque<E> usedPool;

	/**
	 * Instantiates a new blocking pool.
	 */
	public BlockingPool() {
		this.freePool = new LinkedBlockingDeque<E>();
		this.usedPool = new LinkedBlockingDeque<E>();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#add(java.lang.Object)
	 */
	@Override
	public PoolInterface<E> add(final E resource) {
		this.freePool.add(resource);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#countFree()
	 */
	@Override
	public int countFree() {
		return this.freePool.size();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#countUsed()
	 */
	@Override
	public int countUsed() {
		return this.usedPool.size();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#get()
	 */
	@Override
	public E take() {
		try {
			final E resource = this.freePool.take();
			this.usedPool.add(resource);
			return resource;
		} catch (final InterruptedException e) {
			Thread.currentThread().interrupt();
			this.log.error(e.toString());
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#release(java.lang.Object)
	 */
	@Override
	public PoolInterface<E> release(final E resource) {
		this.usedPool.remove(resource);
		this.freePool.add(resource);
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#remove(java.lang.Object)
	 */
	@Override
	public PoolInterface<E> remove(final E resource) {
		this.freePool.remove(resource);
		this.usedPool.remove(resource);
		return this;
	}

}
