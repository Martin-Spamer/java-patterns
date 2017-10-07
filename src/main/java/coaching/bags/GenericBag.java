

package coaching.bags;

import java.util.*;

/**
 * Generic Type Bag Class.
 *
 * @param <T> the generic type
 */
@SuppressWarnings("serial")
public class GenericBag<T> extends ArrayList<T> implements GenericBagInterface<T> {
	private final Random random = new Random();
	private T[] initialState;

	/**
	 * Instantiates a new empty bag.
	 */
	public GenericBag() {
		super();
	}

	/**
	 * Instantiates a new bag from string array.
	 * Accepts 0..N arguments.
	 *
	 * @param values the values
	 */
	@SafeVarargs
	public GenericBag(final T... values) {
		super();
		fill(values);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.bags.GenericBagInterface#fill(java.lang.Object[])
	 */
	@SuppressWarnings("unchecked")
	@Override
	public GenericBagInterface<T> fill(final T... values) {
		if (values != null) {
			this.initialState = values;
			for (final T value : values) {
				this.add(value);
			}
		}
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	@Override
	public boolean add(final T e) {
		return super.add(e);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.bags.GenericBagInterface#pick()
	 */
	@Override
	public T pick() {
		return choose();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.bags.GenericBagInterface#choose()
	 */
	@Override
	public T choose() {
		final int size = size();
		if (size > 0) {
			final int nextInt = this.random.nextInt(size);
			final T remove = remove(nextInt);
			return remove;
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see coaching.bags.GenericBagInterface#reset()
	 */
	@Override
	public GenericBagInterface<T> reset() {
		return fill(this.initialState);
	}

}
