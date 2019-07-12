
package coaching.rules;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import lombok.extern.slf4j.Slf4j;

/**
 * Rules Engine Class.
 */
@Slf4j
public class RulesEngine {

    private Document document = null;
    private Element documentElement = null;

    /**
     * Instantiates a new rules engine.
     */
    public RulesEngine() {
        super();
        initialise();
    }

    /**
     * Initialise.
     */
    protected void initialise() {
        log.trace(System.getProperties().toString());
        final String className = this.getClass().getSimpleName();
        final String configFilename = String.format("%s.xml", className);
        initialise(configFilename);
    }

    /**
     * Initialise with configuration filename.
     *
     * @param configFilename the configuration filename
     * @return true, if successful, otherwise false.
     */
    public boolean initialise(final String configFilename) {
        log.info("initialise({})", configFilename);
        return readXmlDocument(configFilename);
    }

    /**
     * Read xml document.
     *
     * @param configFilename the config filename
     * @return the boolean
     */
    protected boolean readXmlDocument(final String configFilename) {
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            if (documentBuilderFactory != null) {
                DocumentBuilder documentBuilder;
                documentBuilder = documentBuilderFactory.newDocumentBuilder();
                if (documentBuilder != null) {
                    return readXmlStream(configFilename, documentBuilder);
                }
            }
        } catch (final ParserConfigurationException e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return false;
    }

    /**
     * Read xml stream.
     *
     * @param configFilename the config filename
     * @param documentBuilder the document builder
     * @return the boolean
     */
    protected boolean readXmlStream(final String configFilename, final DocumentBuilder documentBuilder) {
        final InputStream is = inputStreamFrom(configFilename);
        try {
            if (is != null) {
                this.document = documentBuilder.parse(is);
                this.documentElement = this.document.getDocumentElement();
                return true;
            }
        } catch (final Exception e) {
            log.error(e.getLocalizedMessage(), e);
        }
        return false;
    }

    /**
     * Input stream.
     *
     * @param resourceName the resource name
     * @return the input stream
     */
    private InputStream inputStreamFrom(final String resourceName) {
        final Thread currentThread = Thread.currentThread();
        final ClassLoader classloader = currentThread.getContextClassLoader();
        final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
        return resourceAsStream;
    }

    /**
     * Execute.
     *
     * @return true, if successful, otherwise false.
     */
    public boolean execute() {
        final boolean returnValue = false;
        log.info("execute({}) = {}", this.getClass().getSimpleName(), returnValue);
        if (this.documentElement != null) {
            final NodeList childNodes = this.documentElement.getChildNodes();
            log.info("childNodes  = {}", childNodes);
        }
        return returnValue;
    }

    /**
     * get element attribute.
     *
     * @param elementName the element name
     * @param attributeName the attribute name
     * @return the element attribute
     */
    protected String getElementAttribute(final String elementName, final String attributeName) {
        final Element element = getElement(elementName);
        return element.getAttribute(attributeName);
    }

    /**
     * get element.
     *
     * @param elementName the element name
     * @return the element
     */
    protected Element getElement(final String elementName) {
        Element element = null;
        final NodeList nodelist = this.documentElement.getElementsByTagName(elementName);
        if (nodelist != null) {
            final int length = nodelist.getLength();
            if (length == 0) {
                final String className = this.getClass().getSimpleName();
                log.info(className);
                log.info("Element {} is missing in element {}", elementName, this.documentElement.toString());
            } else if (length > 1) {
                final String className = this.getClass().getSimpleName();
                log.info(className);
                log.info(" surplus Elements {} ignored in element: {}", elementName, this.documentElement.toString());
                element = (Element) nodelist.item(0);
            }
        }
        return element;
    }
}
