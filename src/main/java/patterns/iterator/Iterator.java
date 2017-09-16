
package patterns.iterator;

/**
 * Iterator Class.
 */
public final class Iterator extends AbstractIterator {

	private final Aggregate aggregate = null;

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.AbstractIterator#first()
	 */
	@Override
	public AbstractItem first() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.AbstractIterator#next()
	 */
	@Override
	public AbstractItem next() {
		return null;
	}

	@Override
	public boolean isDone() {
		return true;
	}

	@Override
	public AbstractItem currentItem() {
		return null;
	}

}
