
package coaching.xml;

import java.io.File;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * XML Configuration class.
 */
public class XmlResource {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(XmlResource.class);

    /** configuration element. */
    private Element configElement = null;

    /**
     * Load configuration file.
     *
     * @param configFile
     *            the Configuration file
     */
    protected void loadXmlFromStream(final InputStream configInputStream) {
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            try {
                final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                final Document document = documentBuilder.parse(configInputStream);
                configElement = document.getDocumentElement();
            } catch (final ParserConfigurationException parserConfigurationException) {
                LOG.error(parserConfigurationException.toString());
            }
        } catch (final Exception exception) {
            LOG.error(exception.toString());
        }
    }

    public void loadXmlFromFile(final File configFile) {
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            try {
                final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
                final Document document = documentBuilder.parse(configFile);
                configElement = document.getDocumentElement();
            } catch (final ParserConfigurationException parserConfigurationException) {
                LOG.error(parserConfigurationException.toString());
            }
        } catch (final Exception exception) {
            LOG.error(exception.toString());
        }
    }

    /**
     * attribute.
     *
     * @param attributeName
     *            the attribute name
     * @return the attribute
     */
    protected String getAttribute(final String attributeName) {
        return configElement.getAttribute(attributeName);
    }

    /**
     * elements by tag name.
     *
     * @param elementName
     *            the element name
     * @return the elements by tag name
     */
    protected NodeList getElementsByTagName(final String elementName) {
        return configElement.getElementsByTagName(elementName);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return null != configElement ? toXmlString(configElement) : "null";
    }

    /**
     * To xml string.
     *
     * @param node
     *            the node
     * @return the string
     */
    private String toXmlString(final Node node) {
        StringBuffer text = new StringBuffer();
        if (node != null) {
            final String value = node.getNodeValue();
            if (value != null) {
                text = new StringBuffer(value);
            }
            if (node.hasChildNodes()) {
                final NodeList children = node.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    final Node item = children.item(i);
                    final String xml = toXmlString(item);
                    text.append(xml);
                }
            }
        }
        return text.toString();
    }
}
