
package coaching.bags;

/**
 * GenericBagInterface Interface.
 *
 * generic type
 *
 * @param <T> the generic type
 */
public interface GenericBagInterface<T> {

	/**
	 * bag with String values.
	 *
	 * values
	 *
	 * @param values the values
	 * @return this bag for a fluent interface
	 */
	GenericBagInterface<T> fill(T... values);

	/**
	 * bag.
	 *
	 * value as a string.
	 *
	 * @return the t
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	T pick();

	/**
	 * bag.
	 *
	 * value as a string.
	 *
	 * @return the t
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	T choose();

	/**
	 * Adds an.
	 *
	 * e
	 *
	 * @param e the e
	 * @return true, if successful
	 */
	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	boolean add(T e);

	/**
	 * Reset.
	 *
	 * bag
	 *
	 * @return the generic bag interface
	 */
	GenericBagInterface<T> reset();

}