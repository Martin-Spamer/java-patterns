package idioms.bags;

import java.util.ArrayList;
import java.util.Random;

/**
 * Simple Bag Class.
 */
@SuppressWarnings("serial")
public class GenericBag<T> extends ArrayList<T> {
	private final Random random = new Random();

	/** The initial state. */
	private T[] initialState = null;

	/**
	 * Instantiates a new empty bag.
	 */
	public GenericBag() {
		super();
		fill(this.initialState);
	}

	/**
	 * Instantiates a new bag from string array.
	 *
	 * @param values the values
	 */
	public GenericBag(final T... values) {
		fill(values);
	}

	/**
	 * Fill.
	 *
	 * @param values the values
	 * @return the bag
	 */
	public GenericBag<T> fill(final T... values) {
		this.initialState = values;
		for (final T value : values) {
			this.add(value);
		}
		return this;
	}

	/**
	 * Choose from bag.
	 *
	 * @return the string
	 */
	public T choose() {
		final int size = this.size();
		if (size > 0) {
			final int nextInt = this.random.nextInt(size);
			return this.remove(nextInt);
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	@Override
	public boolean add(T e) {
		return super.add(e);
	}

	/**
	 * Reset.
	 *
	 * @return the bag
	 */
	public GenericBag<T> reset() {
		return fill(this.initialState);
	}

}
