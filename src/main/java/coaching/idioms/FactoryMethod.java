
package coaching.idioms;

import org.slf4j.*;

/**
 * Factory Method Example.
 */
public final class FactoryMethod {

	private static final Logger LOG = LoggerFactory.getLogger(FactoryMethod.class);

	/**
	 * private constructor prevent wild instantiation.
	 */
	private FactoryMethod() {
		super();
	}

	/**
	 * Factory method to create an instance of class from a
	 * fully qualified class name.
	 *
	 * @return the instance of String class.
	 */
	public static String create() {
		try {
			return (String) Class.forName("java.lang.String").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			LOG.error("{}", e);
		}
		return null;
	}
}
