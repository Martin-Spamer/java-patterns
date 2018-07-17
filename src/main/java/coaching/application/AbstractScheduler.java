
package coaching.application;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import coaching.resources.PropertiesLoader;
import coaching.resources.XmlResourceLoader;

/**
 * An abstract Scheduler class.
 */
public abstract class AbstractScheduler {

    /** logging provided. */
    protected final Logger log = LoggerFactory
        .getLogger(this.getClass().getSimpleName());

    /** initialisation arguments. */
    private String[] args = null;

    /** initialisation arguments as properties. */
    private Properties properties = null;
    private Document xmlDoc = null;

    /**
     * Default Constructor.
     */
    public AbstractScheduler() {
        initialise();
        log.info("AbstractScheduler() : {}", this);
    }

    public AbstractScheduler(final String resourceName) {
        initialise(resourceName);
        log.info("AbstractScheduler({}) : {}", resourceName, this);
    }

    public AbstractScheduler(final String[] args) {
        initialise(args);
        log.info("AbstractScheduler({}) = {}", args, this);
    }

    private void initialise(final String[] args) {
        this.args = args;
        initialise();
    }

    private void initialise() {
        final String simpleName = this.getClass().getSimpleName();
        properties = PropertiesLoader.getProperties(simpleName);
        xmlDoc = XmlResourceLoader.getXmlResource(simpleName);
    }

    private void initialise(final String resourceName) {
        properties = PropertiesLoader.getProperties(resourceName);
        xmlDoc = XmlResourceLoader.getXmlResource(resourceName);
    }

    public AbstractScheduler(final Properties properties) {
        initialisation(properties);
        log.info("AbstractScheduler({}) = {}", properties, this);
    }

    private void initialisation(final Properties properties) {
        this.properties = properties;
    }

    /**
     * Execute.
     *
     * @return the abstract scheduler
     */
    public AbstractScheduler execute() {
        xmlDoc = XmlResourceLoader.getXmlResource(resourceName());
        return execute(xmlDoc);
    }

    /**
     * Default xml schedule filename.
     *
     * @return the string
     */
    private String resourceName() {
        final String simpleName = this.getClass().getSimpleName();
        return String.format("%s.xml", simpleName);
    }

    private AbstractScheduler execute(final Document xmlDoc) {
        return null;
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
                final Thread thread = (Thread) Class
                    .forName(value)
                    .newInstance();
                log.debug("{}", thread);
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
            .format("%s [args=%s, properties=%s]",
                    this.getClass().getSimpleName(),
                    Arrays.toString(args),
                    properties);
    }

}
