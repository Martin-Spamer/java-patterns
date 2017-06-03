/**
 *  @title       ElementInterface.java
 *  @description TODO
 *	Created      16-Aug-2004
 *
 **/
package idioms.config;

/**
 * The ElementInterface Interface.
 */
public interface ElementInterface {

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public abstract String toString();

	/**
	 * To XML.
	 *
	 * @return the string
	 */
	public abstract String toXML();
}
