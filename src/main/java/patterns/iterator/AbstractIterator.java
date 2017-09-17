package patterns.iterator;

import org.slf4j.*;

/**
 * AbstractIterator Class.
 */
public abstract class AbstractIterator implements IteratorInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	/**
	 * First.
	 *
	 * @return the abstract item
	 */
	@Override
	public abstract ItemInterface first();

	/**
	 * Next.
	 *
	 * @return the abstract item
	 */
	@Override
	public abstract ItemInterface next();

	/**
	 * Checks if is done.
	 */
	@Override
	public abstract boolean isDone();

	/**
	 * Current item.
	 */
	@Override
	public abstract ItemInterface currentItem();

}
