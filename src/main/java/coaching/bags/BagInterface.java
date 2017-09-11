
package coaching.bags;

/**
 * BagInterface Interface.
 */
public interface BagInterface {

	/**
	 * bag with String values.
	 *
	 * values
	 *
	 * @param values the values
	 * @return this bag for a fluent interface
	 */
	BagInterface fill(String... values);

	/**
	 * bag.
	 *
	 * value as a string.
	 *
	 * @return the string
	 */
	String pick();

	/**
	 * bag.
	 *
	 * value as a string.
	 *
	 * @return the string
	 */
	String choose();

	/**
	 * back to its initial state.
	 *
	 * @return this bag for a fluent interface
	 */
	BagInterface reset();

}
