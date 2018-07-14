
package coaching.application;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import coaching.resources.PropertiesLoader;

/**
 * An abstract Scheduler class.
 */
public abstract class AbstractScheduler {

    /** logging provided. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** initialisation arguments. */
    private String[] args = null;

    /** initialisation arguments as properties. */
    private Properties properties = null;

    /**
     * The Constructor.
     */
    public AbstractScheduler() {
        super();
        loadConfiguration();
        log.info(toString());
    }

    public AbstractScheduler(final String[] args) {
        super();
        this.args = args;
        loadConfiguration();
    }

    public AbstractScheduler(final Properties properties) {
        super();
        this.properties = properties;
        loadConfiguration();
    }

    private void loadConfiguration() {
        properties = PropertiesLoader.getProperties(defaultFilename());
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
                log.debug(thread.toString());
                thread.start();
            } catch (final Exception exception) {
                log.error(exception.toString(), exception);
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return String
            .format("%s [args=%s, properties=%s]", this.getClass().getSimpleName(), Arrays.toString(args), properties);
    }

}
