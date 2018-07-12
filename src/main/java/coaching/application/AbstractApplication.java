
package coaching.application;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * The Class AbstractApplication.
 */
public abstract class AbstractApplication {

    /** The Constant log. */
    protected static final Logger log = LoggerFactory.getLogger(Application.class);
    
    /** The args. */
    protected String[] args = null;
    
    /** The document builder factory. */
    private DocumentBuilderFactory documentBuilderFactory = null;
    
    /** The document builder. */
    private DocumentBuilder documentBuilder = null;
    
    /** The document. */
    private Document document = null;

    /**
     * The Constructor.
     */
    public AbstractApplication() {
        super();
    }

    /**
     * The Constructor.
     *
     * @param args the args
     */
    public AbstractApplication(final String[] args) {
        this.args = args;
    }

    /**
     * Initialisation.
     *
     * @return true, if successful
     */
    public boolean initialisation() {
        return initialisation(this.getClass().getSimpleName() + ".xml");
    }

    /**
     * initialisation.
     * 
     * configuration filename
     *
     * @param configFilename the config filename
     * @return true, if successful
     */
    public boolean initialisation(final String configFilename) {
        return initialisation(new File(configFilename));
    }

    /**
     * initialisation the.
     * 
     * configuration file
     *
     * @param configFile the config file
     * @return true, if successful
     */
    public boolean initialisation(final File configFile) {
        boolean returnValue = false;
        try {
            this.documentBuilderFactory = DocumentBuilderFactory.newInstance();
            this.documentBuilder = this.documentBuilderFactory.newDocumentBuilder();
            this.document = this.documentBuilder.parse(configFile);

            final Element documentElement = this.document.getDocumentElement();
            if (documentElement != null) {
                final Element commandHandlerElement = getElement(documentElement, "COMMAND_HANDLER");
                log.info("commandHandlerElement = {}", commandHandlerElement);
                final String commandHandlerClassName = getElementAttribute(documentElement,
                        "COMMAND_HANDLER",
                        "className");
                log.info("commandHandlerClassName = {}", commandHandlerClassName);
            } else {
                log.info("documentElement = null");
            }
            returnValue = true;
        } catch (final Exception exception) {
            log.error(exception.toString());
        }
        return returnValue;
    }

    /**
     * element.
     * 
     * document element
     * element name
     * element
     *
     * @param documentElement the document element
     * @param elementName the element name
     * @return the element
     */
    public Element getElement(final Element documentElement, final String elementName) {
        Element element = null;
        final NodeList nodelist = documentElement.getElementsByTagName(elementName);
        if (nodelist != null) {
            if (nodelist.getLength() == 0) {
                log.info("%s is missing for %s ", elementName, documentElement.toString());
            } else {
                if (nodelist.getLength() > 1) {
                    log.info("Surplus Elements %s ignored", elementName, documentElement.toString());
                }
                element = (Element) nodelist.item(0);
            }
        }
        return element;
    }

    /**
     * element attribute.
     * 
     * document element
     * element name
     * attribute name
     * element attribute
     *
     * @param documentElement the document element
     * @param elementName the element name
     * @param attributeName the attribute name
     * @return the element attribute
     */
    public String getElementAttribute(final Element documentElement,
            final String elementName,
            final String attributeName) {
        final Element element = getElement(documentElement, elementName);
        return element.getAttribute(attributeName);
    }

}
