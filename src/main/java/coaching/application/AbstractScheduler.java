
package coaching.application;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class AbstractScheduler.
 */
public abstract class AbstractScheduler {

    /** The log. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
    
    /** The args. */
    private String[] args = null;
    
    /** The properties. */
    private Properties properties = null;

    /**
     * The Constructor.
     */
    public AbstractScheduler() {
        super();
        loadConfiguration();
    }

    /**
     * The Constructor.
     *
     * @param args the args
     */
    public AbstractScheduler(final String[] args) {
        super();
        this.args = args;
        loadConfiguration(args);
    }

    /**
     * The Constructor.
     *
     * @param properties the properties
     */
    public AbstractScheduler(final Properties properties) {
        super();
        loadConfiguration(properties);
    }

    /**
     * Load configuration.
     */
    private void loadConfiguration() {
        final String filename = defaultFilename();
        try {
            final InputStream resourceAsStream = getClass().getResourceAsStream(filename);
            properties.load(resourceAsStream);
        } catch (final Exception e) {
            log.error(e.toString());
        }
    }

    /**
     * Default filename.
     *
     * @return the string
     */
    private String defaultFilename() {
        return String.format("%s.properties", this.getClass().getSimpleName());
    }

    /**
     * Load configuration.
     *
     * @param properties the properties
     */
    private void loadConfiguration(final Properties properties) {
        this.properties = properties;
    }

    /**
     * Load configuration.
     *
     * @param args the args
     */
    private void loadConfiguration(final String[] args) {
        try {
            if (args != null) {
                for (final String arg : this.args) {
                    String key = arg.substring(0, arg.indexOf("="));
                    log.info("key = {}", key);
                    String value = arg.substring(arg.length());
                    log.info("value = {}", value);
                    properties.setProperty(key, value);
                }
            }
        } catch (final IndexOutOfBoundsException indexOutOfBoundsException) {
            log.error("{} : reading args", indexOutOfBoundsException, args);
        }
    }

    /**
     * Sets the properties.
     *
     * @param properties the properties
     * @return the abstract scheduler
     */
    public AbstractScheduler setProperties(final Properties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Execute.
     *
     * @return the abstract scheduler
     */
    public AbstractScheduler execute() {
        return execute(properties);
    }

    /**
     * Execute.
     *
     * @param properties the properties
     * @return the abstract scheduler
     */
    public AbstractScheduler execute(final Properties properties) {
        final Enumeration<?> keys = properties.propertyNames();
        while (keys.hasMoreElements()) {
            final String key = (String) keys.nextElement();
            final String value = properties.getProperty(key);
            try {
                final Thread thread = (Thread) Class.forName(value).newInstance();
                thread.start();
            } catch (final Exception exception) {
                log.error(exception.toString());
            }
        }
        return this;
    }
}
