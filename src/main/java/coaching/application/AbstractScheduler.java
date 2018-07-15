
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
     * The Constructor.
     */
    public AbstractScheduler() {
        log.info("AbstractScheduler()");
        initialisation();
    }

    public AbstractScheduler(final String resourceName) {
        log.info("AbstractScheduler({})", resourceName);
        initialisation();
    }

    public AbstractScheduler(final String[] args) {
        this.args = args;
        log.info("AbstractScheduler({}) = {}", args, this);
        initialisation();
    }

    public AbstractScheduler(final Properties properties) {
        this.properties = properties;
        log.info("AbstractScheduler({}) = {}", properties, this);
        initialisation();
    }

    private void initialisation() {
        properties = PropertiesLoader.getProperties(propertiesFilename());
    }

    /**
     * Default properties filename.
     *
     * @return the string
     */
    private String propertiesFilename() {
        final String simpleName = this.getClass().getSimpleName();
        return String.format("%s.properties", simpleName);
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
