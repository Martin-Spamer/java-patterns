
package coaching.bags;

import java.util.*;

/**
 * A Generic Type Bag Class.
 *
 * generic type
 *
 * @param <T> the generic type
 */
@SuppressWarnings("serial")
public class GenericBag<T> extends ArrayList<T> implements GenericBagInterface<T> {
	private final Random random = new Random();

	/** * bag to be reset */
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
	 * Accepts 0..N arguments.
	 *
	 * values
	 *
	 * @param values the values
	 */
	public GenericBag(final T... values) {
		fill(values);
	}

	/*
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see idioms.bags.GenericBagInterface#fill(T)
	 */
	@Override
	public GenericBagInterface<T> fill(final T... values) {
		if (values != null) {
			for (final T value : values) {
				this.add(value);
			}
			this.initialState = values;
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see idioms.bags.GenericBagInterface#choose()
	 */
	@Override
	public T pick() {
		return choose();
	}

	/* (non-Javadoc)
	 * @see idioms.bags.GenericBagInterface#choose()
	 */
	@Override
	public T choose() {
		final int size = size();
		if (size > 0) {
			final int nextInt = this.random.nextInt(size);
			return this.remove(nextInt);
		} else {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see idioms.bags.GenericBagInterface#add(T)
	 */
	@Override
	public boolean add(T e) {
		return super.add(e);
	}

	/* (non-Javadoc)
	 * @see idioms.bags.GenericBagInterface#reset()
	 */
	@Override
	public GenericBagInterface<T> reset() {
		return fill(this.initialState);
	}

}
