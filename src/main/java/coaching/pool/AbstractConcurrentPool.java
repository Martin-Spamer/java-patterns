
package coaching.pool;

import java.util.concurrent.ConcurrentLinkedDeque;

import org.slf4j.*;

/**
 * ConcurrentPool Class.
 *
 * element type
 *
 * @param <E> the element type
 */
public abstract class AbstractConcurrentPool<E> implements PoolInterface<E> {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected ConcurrentLinkedDeque<E> freePool;
	protected ConcurrentLinkedDeque<E> usedPool;

	/**
	 * Instantiates a new concurrent pool.
	 */
	public AbstractConcurrentPool() {
		this.freePool = new ConcurrentLinkedDeque<E>();
		this.usedPool = new ConcurrentLinkedDeque<E>();
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
	 * @see uk.me.spamer.pool.PoolInterface#take()
	 */
	@Override
	public E take() {
		final E resource = this.freePool.poll();
		this.usedPool.add(resource);
		return resource;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see code.pool.PoolInterface#release(java.lang.Object)
	 */
	@Override
	public PoolInterface<E> release(final E resource) {
		this.freePool.remove(resource);
		this.usedPool.remove(resource);
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
