
package javamentor.bags;

public interface BagInterface {

	/**
	 * Fill the bag with String values.
	 *
	 * @param the String values as variable length list of arguments.
	 * Accepts 0..N arguments.
	 *
	 * @return this bag for a fluent interface
	 */
	BagInterface fill(String... values);

	/**
	 * Pick a value at random from the bag.
	 *
	 * @return the value as a string.
	 */
	String pick();

	/**
	 * choose a value at random from the bag.
	 *
	 * @return the value as a string.
	 */
	String choose();

	/**
	 * Reset the back to its initial state.
	 *
	 * @return this bag for a fluent interface
	 */
	BagInterface reset();

}
