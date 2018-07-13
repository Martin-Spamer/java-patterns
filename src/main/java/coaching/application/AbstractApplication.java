
package coaching.application;

import java.io.File;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * An abstract Application class.
 */
public abstract class AbstractApplication {

    /** logging provided. */
    protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    /** initialisation arguments. */
    protected String[] args = null;

    protected Document document = null;
    protected Element documentElement;

    /**
     * Default Constructor.
     */
    public AbstractApplication() {
        super();
        log.info(toString());
    }

    /**
     * Constructor.
     *
     * @param args the args
     */
    public AbstractApplication(final String[] args) {
        super();
        this.args = args;
        log.info(toString());
    }

    /**
     * Initialisation.
     *
     * @return true, if successful
     */
    protected boolean initialisation() {
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
    protected boolean initialisation(final String configFilename) {
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
    protected boolean initialisation(final File configFile) {
        boolean returnValue = false;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            document = documentBuilder.parse(configFile);
            documentElement = document.getDocumentElement();

            if (documentElement != null) {
                final Element commandHandlerElement = getElement("COMMAND_HANDLER");
                log.info("commandHandlerElement = {}", commandHandlerElement);
                final String commandHandlerClassName = getElementAttribute(
                        "COMMAND_HANDLER",
                        "className");
                log.info("commandHandlerClassName = {}", commandHandlerClassName);
            } else {
                log.warn("documentElement = null");
            }
            returnValue = true;
        } catch (final Exception exception) {
            log.error(exception.toString(), exception);
        }
        return returnValue;
    }

    /**
     * Gets the element.
     *
     * @param elementName the element name
     * @return the element
     */
    protected Element getElement(final String elementName) {
        Element element = null;
        final NodeList nodelist = documentElement.getElementsByTagName(elementName);
        if (nodelist != null) {
            if (nodelist.getLength() == 0) {
                log.debug("%s is missing for %s ", elementName, documentElement.toString());
            } else {
                if (nodelist.getLength() > 1) {
                    log.trace("Surplus Elements %s ignored", elementName, documentElement.toString());
                }
                element = (Element) nodelist.item(0);
            }
        }
        return element;
    }

    /**
     * Gets the element attribute.
     *
     * @param elementName the element name
     * @param attributeName the attribute name
     * @return the element attribute
     */
    protected String getElementAttribute(
            final String elementName,
            final String attributeName) {
        final Element element = getElement(elementName);
        return element.getAttribute(attributeName);
    }

    @Override
    public String toString() {
        return String
            .format("%s [args=%s, document=%s, documentElement=%s]",
                    this.getClass().getSimpleName(),
                    Arrays.toString(args),
                    document,
                    documentElement);
    }

}
