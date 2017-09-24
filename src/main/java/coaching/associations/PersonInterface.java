/**
 * Created on 06-Jul-2004
 */
package coaching.associations;

/**
 * Person Interface.
 */
public interface PersonInterface {

	/**
	 * set the person's name.
	 *
	 * @param name the name
	 * @return this for a fluent interface.
	 */
	public PersonInterface setName(String name);

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName();

}
