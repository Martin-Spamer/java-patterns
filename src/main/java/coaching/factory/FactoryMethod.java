
package coaching.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * Factory Method Example.
 */

/** The Constant 			log. */
@Slf4j
public final class FactoryMethod {

    /**
     * private constructor prevent wild instantiation.
     */
    private FactoryMethod() {
        throw new UnsupportedOperationException("Do not instantiate this class, use staticly.");
    }

    /**
     * Factory method to create an instance of class from a fully qualified
     * class name.
     *
     * @return the instance of String class.
     */
    public static String create() {
        try {
            return (String) Class.forName("java.lang.String").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /**
     * Factory method to create a new instance of FactoryMethod.
     *
     * The name
     *
     * @param className the class name
     * @return new instance of FactoryMethod
     */
    public static String create(final String className) {
        try {
            return (String) Class.forName(className).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return null;
    }
}
