/**
 * Created on 06-Jul-2004
 */
package javamentor.associations;

/**
 * PersonInterface Interface.
 */
public interface PersonInterface {

	/**
	 * name.
	 *
	 * new name
	 *
	 * @param name the new
	 * 			name
	 */
	void setName(String name);

	/**
	 * To string.
	 *
	 * string
	 *
	 * @return the string
	 */
	@Override
	String toString();

}
