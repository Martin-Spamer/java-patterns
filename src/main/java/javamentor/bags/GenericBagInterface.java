package javamentor.bags;

public interface GenericBagInterface<T> {

	/**
	 * Fill the bag with String values.
	 *
	 * @param the String values as variable length list of arguments.
	 * Accepts 0..N arguments.
	 *
	 * @return this bag for a fluent interface
	 */
	GenericBagInterface<T> fill(T... values);

	/**
	 * Choose a value at random from the bag.
	 *
	 * @return the value as a string.
	 *
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	T pick();

	/**
	 * Choose a value at random from the bag.
	 *
	 * @return the value as a string.
	 *
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	T choose();

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	boolean add(T e);

	/**
	 * Reset.
	 *
	 * @return the bag
	 */
	GenericBagInterface<T> reset();

}