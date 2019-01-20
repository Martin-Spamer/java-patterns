
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

    /** The document. */
    protected Document document = null;

    /** The document element. */
    protected Element documentElement;

    /**
     * Default Constructor.
     */
    public AbstractApplication() {
        super();
        this.log.info("AbstractApplication() = {}", this);
        initialisation(defaultFilename());
    }

    /**
     * Constructor.
     *
     * @param args the args
     */
    public AbstractApplication(final String[] args) {
        super();
        this.args = args;
        this.log.info("AbstractApplication({}) = {}", args, this);
        initialisation(defaultFilename());
    }

    /**
     * Default filename.
     *
     * @return the string
     */
    private String defaultFilename() {
        final String simpleName = this.getClass().getSimpleName();
        return String.format("%s.xml", simpleName);
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
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            this.document = documentBuilder.parse(configFile);
            this.documentElement = this.document.getDocumentElement();

            if (this.documentElement != null) {
                final Element commandHandlerElement = getElement("COMMAND_HANDLER");
                this.log.info("commandHandlerElement = {}", commandHandlerElement);
                final String commandHandlerClassName = getElementAttribute("COMMAND_HANDLER", "className");
                this.log.info("commandHandlerClassName = {}", commandHandlerClassName);
            } else {
                this.log.warn("documentElement = null");
            }
            return true;
        } catch (final Exception e) {
            this.log.error(e.getLocalizedMessage());
        }
        return false;
    }

    /**
     * Gets the element.
     *
     * @param elementName the element name
     * @return the element
     */
    protected Element getElement(final String elementName) {
        Element element = null;
        final NodeList nodelist = this.documentElement.getElementsByTagName(elementName);
        if (nodelist != null) {
            if (nodelist.getLength() == 0) {
                this.log.debug("{} is missing for {}", elementName, this.documentElement);
            } else {
                if (nodelist.getLength() > 1) {
                    this.log.trace("Surplus {} elements ignored", elementName);
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
    protected String getElementAttribute(final String elementName, final String attributeName) {
        final Element element = getElement(elementName);
        return element.getAttribute(attributeName);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [args=%s, document=%s, documentElement=%s]", this.getClass().getSimpleName(), Arrays.toString(this.args), this.document, this.documentElement);
    }

}
