package coaching.factory;

import java.util.Properties;

import coaching.resources.PropertiesLoader;

/**
 * A Factory class for creating Class objects.
 */
public class ClassFactory {

    /** Instantiate the single instance of this class. */
    private static ClassFactory instance = new ClassFactory();

    /** properties holding mappings for a key to a class name. */
    private static Properties properties = PropertiesLoader.getProperties("ClassFactory.properties");

    /**
     * Private constructor prevents wild instantiations.
     */
    private ClassFactory() {
        super();
    }

    /**
     * Get the single instance.
     *
     * @return the instance.
     */
    public static ClassFactory getInstance() {
        return instance;
    }

    /**
     * Gets the instance.
     *
     * @param resourceName the resource name
     * @return the instance
     */
    public static ClassFactory getInstance(final String resourceName) {
        properties = PropertiesLoader.getProperties(resourceName);
        return instance;
    }

    /**
     * Get the classname for the key.
     * The classname will be fully qualified by package/namespace.
     *
     * @param key the key
     * @return the string
     */
    public static String classNameFor(final String key) {
        return properties.getProperty(key);
    }

    /**
     * New instance.
     *
     * @param key the key
     * @return the object
     * @throws ClassNotFoundException the class not found exception
     * @throws InstantiationException the instantiation exception
     * @throws IllegalAccessException the illegal access exception
     */
    public static Object newInstance(final String key) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = properties.getProperty(key);
        return Class.forName(className).newInstance();
    }

    public static Number create() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        return create("number");
    }

    /**
     * Factory method to create a new instance of class by key.
     *
     * @param key the key
     * @return new instance of ClassFactory
     * @throws ClassNotFoundException the class not found exception
     * @throws InstantiationException the instantiation exception
     * @throws IllegalAccessException the illegal access exception
     */
    public static Number create(final String key) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = properties.getProperty(key);
        return (Number) Class.forName(className).newInstance();
    }

}
