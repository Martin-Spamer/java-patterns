
package patterns.iterator;

import java.util.*;

import org.slf4j.*;

/**
 * AbstractIterator Class.
 */
public abstract class AbstractIterator implements IteratorInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	protected AggregateInterface aggregate = null;
	protected final List<ItemInterface> itemList = new ArrayList<ItemInterface>();
	protected int index = 0;

	/**
	 * Instantiates a new iterator.
	 *
	 * @param aggregate the aggregate
	 */
	public AbstractIterator(final AggregateInterface aggregate) {
		super();
		this.aggregate = aggregate;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.IteratorInterface#first()
	 */
	@Override
	public ItemInterface first() {
		index = 0;
		return itemList.get(index);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.IteratorInterface#next()
	 */
	@Override
	public ItemInterface next() {
		index++;
		return itemList.get(index);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.IteratorInterface#isDone()
	 */
	@Override
	public boolean isDone() {
		return index == itemList.size();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.IteratorInterface#currentItem()
	 */
	@Override
	public ItemInterface currentItem() {
		return itemList.get(index);
	}

}
