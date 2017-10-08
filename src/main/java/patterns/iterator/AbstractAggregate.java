


package patterns.iterator;

import java.util.*;

import org.slf4j.*;

/**
 * class AbstractAggregate.
 */
public abstract class AbstractAggregate implements AggregateInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

	protected final List<ItemInterface> itemList = new ArrayList<ItemInterface>();

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.AggregateInterface#createIterator()
	 */
	@Override
	public IteratorInterface createIterator() {
		log.info("%s.createIterator()", this.getClass().getSimpleName());
		return new Iterator(this);
	}

}
