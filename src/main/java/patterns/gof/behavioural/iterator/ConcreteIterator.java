
package patterns.gof.behavioural.iterator;

/**
 * The Class ConcreteIterator.
 */
class ConcreteIterator extends AbstractIterator {

	/** The my concrete aggregate. */
	public ConcreteAggregate myConcreteAggregate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.behavioural.iterator.AbstractIterator#first()
	 */
	@Override
	public Item first() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.behavioural.iterator.AbstractIterator#next()
	 */
	@Override
	public Item next() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.behavioural.iterator.AbstractIterator#isDone()
	 */
	@Override
	public void isDone() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see patterns.gof.behavioural.iterator.AbstractIterator#currentItem()
	 */
	@Override
	public void currentItem() {
	}
}