
package coaching.application;

import java.util.Arrays;
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
 *
 * A Scheduler is specials application used for starting other Applications
 * under specific circumstances, at certain times or in response to specific
 * events.
 */
public abstract class AbstractScheduler {

    /** logging provided. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** initialisation arguments. */
    private final String[] args = null;

    /** initialisation arguments as properties. */
    private Properties properties = null;

    /** The xml doc. */
    private Document xmlDoc = null;

    /**
     * Instantiates a new abstract scheduler.
     *
     * @param args the args
     */
    public AbstractScheduler(final String[] args) {
        final String simpleName = this.getClass().getSimpleName();
        this.properties = PropertiesLoader.getProperties(simpleName);
        this.xmlDoc = XmlResourceLoader.getXmlResource(simpleName);
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
        this.xmlDoc = XmlResourceLoader.getXmlResource(resourceName());
        return execute(this.xmlDoc);
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
            this.log.debug("nodeName : {}", nodeName);
            final String nameAttribute = element.getAttribute("name");
            this.log.debug("nameAttribute : {}", nameAttribute);
            final String classAttribute = element.getAttribute("class");
            this.log.debug("classAttribute : {}", classAttribute);
            final String valueAttribute = element.getAttribute("value");
            this.log.debug("valueAttribute : {}", valueAttribute);
        }
        return this;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [args=%s, properties=%s]",
            this.getClass().getSimpleName(),
            Arrays.toString(this.args),
            this.properties);
    }
}
