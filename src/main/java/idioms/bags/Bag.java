package idioms.bags;

import java.util.ArrayList;
import java.util.Random;

/**
 * Simple Bag Class.
 */
@SuppressWarnings("serial")
public class Bag extends ArrayList<String> implements BagInterface {
	private final Random random = new Random();

	/** The initial state. */
	private String[] initialState = new String[0];

	/**
	 * Instantiates a new empty bag.
	 */
	public Bag() {
		super();
		fill(this.initialState);
	}

	/**
	 * Instantiates a new bag from string array.
	 *
	 * @param values the values
	 */
	public Bag(final String... values) {
		fill(values == null ? new String[0] : values);
	}

	/* (non-Javadoc)
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	@Override
	public BagInterface fill(final String... values) {
		this.initialState = values;
		for (final String value : values) {
			this.add(value);
		}
		return this;
	}

	/* (non-Javadoc)
	 * @see idioms.BagInterface#choose()
	 */
	@Override
	public String choose() {
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
	/* (non-Javadoc)
	 * @see idioms.BagInterface#add(java.lang.String)
	 */
	@Override
	public boolean add(String e) {
		return super.add(e);
	}

	/* (non-Javadoc)
	 * @see idioms.BagInterface#reset()
	 */
	@Override
	public BagInterface reset() {
		return fill(this.initialState);
	}

}
