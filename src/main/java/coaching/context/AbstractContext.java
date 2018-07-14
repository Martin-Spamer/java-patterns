
package coaching.context;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An abstract class to manage the current Context.
 */
public abstract class AbstractContext implements ContextInterface {

    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** The properties. */
    private Properties properties = null;

    /**
     * Instantiates a new abstract context.
     */
    public AbstractContext() {
        super();
        setProperties(new Properties());
    }

    /**
     * Instantiates a new abstract context.
     *
     * @param properties
     *            the properties
     */
    public AbstractContext(final Properties properties) {
        super();
        setProperties(properties);
    }

    /*
     * (non-Javadoc)
     * @see
     * patterns.interpreter.ContextInterface#setProperties(java.util.Properties)
     */
    @Override
    public ContextInterface setProperties(final Properties properties) {
        this.properties = properties;
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.interpreter.ContextInterface#setProperty(java.lang.String,
     * java.lang.String)
     */
    @Override
    public ContextInterface setProperty(final String key, final String value) {
        properties.setProperty(key, value);
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.interpreter.ContextInterface#getProperty(java.lang.String)
     */
    @Override
    public String getProperty(final String key) {
        return properties.getProperty(key);
    }

    /*
     * (non-Javadoc)
     * @see coaching.context.ContextInterface#getProperty(java.lang.String,
     * java.lang.String)
     */
    @Override
    public String getProperty(final String key, final String defaultValue) {
        return properties.getProperty(key);
    }

}
