
package coaching.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Factory class for creating Class objects.
 */
public final class ClassFactory {

    /** CLASS_NAME 			constant. */
    private static final String CLASS_NAME = "coaching.factory.ClassFactory";
    
    /** LOG 			constant. */
    private static final Logger LOG = LoggerFactory
        .getLogger(ClassFactory.class);
    
    /** The instance. */
    private static ClassFactory instance;

    /**
     * Instantiates a new class factory.
     */
    private ClassFactory() {
        super();
    }

    /**
     * Gets the instance.
     *
     * @return the instance
     */
    public static ClassFactory getInstance() {
        if (instance == null) {
            return new ClassFactory();
        }
        return instance;
    }

    /**
     * Factory method to create a new instance of ClassFactory.
     *
     * @return new instance of ClassFactory
     */
    public static Object create() {
        try {
            return Class.forName(CLASS_NAME).newInstance();
        } catch (
                InstantiationException |
                    IllegalAccessException |
                    ClassNotFoundException e) {
            LOG.error(e.getLocalizedMessage(), e);
        }
        return null;
    }

    /**
     * Factory method to create a new instance of ClassFactory.
     *
     * @param key the key
     * @return new instance of ClassFactory
     */
    public static Object create(final String key) {
        // TODO className = Commands.get(key);
        return key;
    }

}
