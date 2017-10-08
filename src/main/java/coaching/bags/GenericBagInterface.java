


package coaching.bags;

/**
 * Generic Bag Interface.
 *
 * Requires a generic type.
 *
 * @param <T> the generic type
 */
public interface GenericBagInterface<T> {

	/**
	 * bag with T values.
	 *
	 * @param values the values
	 * @return this bag for a fluent interface
	 */
	public GenericBagInterface<T> fill(T... values);

	/**
	 * Add an instance of T to the bag.
	 *
	 * @param t the t
	 * @return true, if successful, otherwise false.
	 */
	public boolean add(T t);

	/**
	 * pick from the bag.
	 *
	 * @return the value as type T
	 */
	public T pick();

	/**
	 * choose from bag.
	 *
	 * @return the value as type T
	 */
	public T choose();

	/**
	 * Reset the bag to its initial state.
	 *
	 * @return the generic bag interface
	 */
	public GenericBagInterface<T> reset();

}
