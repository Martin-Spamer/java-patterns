
package coaching.idioms;

/**
 * Factory Method Example.
 */
public class FactoryMethod {

	/**
	 * Factory method to create an instance of class from a fully qualified
	 * name.
	 *
	 * @return the instance of String.
	 * @throws Exception the exception
	 */
	public static String create() throws Exception {
		return (String) Class.forName("java.lang.String").newInstance();
	}

}
