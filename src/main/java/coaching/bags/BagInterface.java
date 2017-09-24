

package coaching.bags;

/**
 * Bag Interface.
 */
public interface BagInterface {

	/**
	 * bag with String values.
	 *
	 * @param values the values
	 * @return this bag for a fluent interface
	 */
	public BagInterface fill(String... values);

	/**
	 * Adds an item to the bag.
	 *
	 * @param value the value
	 * @return true, if successful, otherwise false.
	 */
	public boolean add(String value);

	/**
	 * pick item from the bag.
	 *
	 * @return the string
	 */
	public String pick();

	/**
	 * choose item from bag.
	 *
	 * @return the string
	 */
	public String choose();

	/**
	 * reset the back to its initial state.
	 *
	 * @return this bag for a fluent interface
	 */
	public BagInterface reset();

}
