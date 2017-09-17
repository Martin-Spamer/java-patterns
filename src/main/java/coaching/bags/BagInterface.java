
package coaching.bags;

/**
 * BagInterface Interface.
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
	 * bag.
	 *
	 * value as a string.
	 *
	 * @return the string
	 */
	public String pick();

	/**
	 * bag.
	 *
	 * value as a string.
	 *
	 * @return the string
	 */
	public String choose();

	/**
	 * back to its initial state.
	 *
	 * @return this bag for a fluent interface
	 */
	public BagInterface reset();

}
