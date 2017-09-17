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
	public ItemInterface first() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see patterns.iterator.AbstractIterator#next()
	 */
	@Override
	public ItemInterface next() {
		return null;
	}

	@Override
	public boolean isDone() {
		return true;
	}

	@Override
	public ItemInterface currentItem() {
		return null;
	}

}
