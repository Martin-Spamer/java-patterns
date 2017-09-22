

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
	 * @param values the values
	 * @return this bag for a fluent interface
	 */
	public GenericBagInterface<T> fill(T... values);

	/**
	 * bag.
	 *
	 * @return the t
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	public T pick();

	/**
	 * bag.
	 *
	 * @return the t
	 * @see idioms.BagInterface#fill(java.lang.String)
	 */
	public T choose();

	/**
	 * Adds an.
	 *
	 * @param e the e
	 * @return true, if successful
	 */
	public boolean add(T e);

	/**
	 * Reset.
	 *
	 * @return the generic bag interface
	 */
	public GenericBagInterface<T> reset();

}