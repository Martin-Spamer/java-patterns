
package coaching.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import coaching.resources.XmlResourceLoader;

/**
 * The Class XmlDocumentWrapper.
 */
public final class XmlDocumentWrapper {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlDocumentWrapper.class);

    /** The xml resource. */
    private final Document xmlResource;

    /**
     * Instantiates a new XmlConfig from configuration file name.
     *
     * @param resourceName the resource name
     */
    public XmlDocumentWrapper(final String resourceName) {
        xmlResource = XmlResourceLoader.getXmlResource(resourceName);
        LOG.debug("XmlDocumentWrapper({}) : {}", resourceName, this);
    }

    /**
     * To xml filename.
     *
     * @param configName
     *            the Configuration filename
     * @return the string
     */
    private String toXmlFilename(final String configName) {
        return String.format("%s.xml", configName);
    }

    /**
     * Gets the document element.
     *
     * @return the document element
     */
    public Element getDocumentElement() {
        return xmlResource.getDocumentElement();
    }

    /**
     * Gets the elements by tag name.
     *
     * @param tagname the tagname
     * @return the elements by tag name
     */
    public NodeList getElementsByTagName(final String tagname) {
        return xmlResource.getElementsByTagName(tagname);
    }

    /**
     * Gets the element by id.
     *
     * @param elementId the element id
     * @return the element by id
     */
    public Element getElementById(final String elementId) {
        return xmlResource.getElementById(elementId);
    }
}
