
package coaching.idioms;

/**
 * Factory Method Example.
 */
public class FactoryMethod {

	/**
	 * private constructor prevent wild instantiation.
	 */
	private FactoryMethod() {
		super();
	}

	/**
	 * Factory method to create an instance of class from a fully qualified
	 * class name.
	 *
	 * @return the instance of String class.
	 * @throws Exception the exception
	 */
	public static String create() throws Exception {
		return (String) Class.forName("java.lang.String").newInstance();
	}

}
