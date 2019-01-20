
package coaching.application;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import coaching.resources.PropertiesLoader;
import coaching.resources.XmlResourceLoader;

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

    /** The xml doc. */
    private Document xmlDoc = null;

    /**
     * Default Constructor.
     */
    public AbstractScheduler() {
        initialise();
        log.debug("AbstractScheduler() : {}", this);
    }

    /**
     * Instantiates a new abstract scheduler.
     *
     * @param resourceName the resource name
     */
    public AbstractScheduler(final String resourceName) {
        log.debug("AbstractScheduler({}) : {}", resourceName, this);
        if (resourceName != null) {
            initialise(resourceName);
        } else {
            initialise();
        }
    }

    /**
     * Instantiates a new abstract scheduler.
     *
     * @param args the args
     */
    public AbstractScheduler(final String[] args) {
        log.debug("AbstractScheduler({}) = {}", args, this);
        if (args != null) {
            initialise(args);
        } else {
            initialise();
        }
    }

    /**
     * Instantiates a new abstract scheduler.
     *
     * @param properties the properties
     */
    public AbstractScheduler(final Properties properties) {
        log.debug("AbstractScheduler({}) = {}", properties, this);
        initialisation(properties);
    }

    /**
     * Initialise from default property file.
     */
    private void initialise() {
        final String simpleName = this.getClass().getSimpleName();
        properties = PropertiesLoader.getProperties(simpleName);
        xmlDoc = XmlResourceLoader.getXmlResource(simpleName);
    }

    /**
     * Initialise from named resource file.
     *
     * @param resourceName the resource name
     */
    private void initialise(final String resourceName) {
        try {
            properties = PropertiesLoader.getProperties(resourceName);
        } catch (final Exception e) {
            log.error(e.getLocalizedMessage(), e);
        }

        try {
            xmlDoc = XmlResourceLoader.getXmlResource(resourceName);
        } catch (final Exception e) {
            log.error(e.getLocalizedMessage(), e);
        }
    }

    /**
     * Initialise with String array.
     *
     * @param args the args
     */
    private void initialise(final String[] args) {
        initialise();
        this.args = args;
    }

    /**
     * Initialisation from properties.
     *
     * @param properties the properties
     */
    private void initialisation(final Properties properties) {
        this.properties = properties;
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
     * Execute.
     *
     * @param xmlDoc the xml doc
     * @return the abstract scheduler
     */
    private AbstractScheduler execute(final Document xmlDoc) {
        final NodeList list = xmlDoc.getElementsByTagName("*");
        for (int i = 0; i < list.getLength(); i++) {
            final Element element = (Element) list.item(i);
            final String nodeName = element.getNodeName();
            log.debug("nodeName : {}", nodeName);
            final String nameAttribute = element.getAttribute("name");
            log.debug("nameAttribute : {}", nameAttribute);
            final String classAttribute = element.getAttribute("class");
            log.debug("classAttribute : {}", classAttribute);
            final String valueAttribute = element.getAttribute("value");
            log.debug("valueAttribute : {}", valueAttribute);
        }
        return this;
    }

    /**
     * Execute.
     *
     * @param properties the properties
     * @return the abstract scheduler
     */
    public AbstractScheduler execute(final Properties properties) {
        if (properties != null) {
            final Enumeration<?> keys = properties.propertyNames();
            while (keys.hasMoreElements()) {
                final String key = (String) keys.nextElement();
                final String value = properties.getProperty(key);
                log.debug("{} = {}", key, value);
                try {
                    final Thread thread = (Thread) Class.forName(value).newInstance();
                    log.debug("thread : {}", thread);
                    thread.start();
                } catch (final Exception e) {
                    log.error(e.getLocalizedMessage(), e);
                }
            }
        } else {
            log.warn("Properties cannot be null");
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [args=%s, properties=%s]", this.getClass().getSimpleName(), Arrays.toString(args), properties);
    }

}
