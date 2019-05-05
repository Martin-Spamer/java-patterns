
package coaching.context;

import java.util.Properties;

/**
 * An abstract class to manage the current Context.
 */
public abstract class AbstractContext implements ContextInterface {

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
     * @param properties the properties
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
        this.properties.setProperty(key, value);
        return this;
    }

    /*
     * (non-Javadoc)
     * @see patterns.interpreter.ContextInterface#getProperty(java.lang.String)
     */
    @Override
    public String getProperty(final String key) {
        return this.properties.getProperty(key);
    }

    /*
     * (non-Javadoc)
     * @see coaching.context.ContextInterface#getProperty(java.lang.String,
     * java.lang.String)
     */
    @Override
    public String getProperty(final String key, final String defaultValue) {
        return this.properties.getProperty(key, defaultValue);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [properties=%s]", this.getClass().getSimpleName(), this.properties);
    }

}
