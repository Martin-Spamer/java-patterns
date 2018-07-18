
package coaching.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import coaching.resources.XmlResourceLoader;

public final class XmlDocumentWrapper {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlDocumentWrapper.class);

    private final Document xmlResource;

    /**
     * Instantiates a new XmlConfig from configuration file name.
     *
     * @param filename
     *            the Configuration filename
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

    public Element getDocumentElement() {
        return xmlResource.getDocumentElement();
    }

    public NodeList getElementsByTagName(final String tagname) {
        return xmlResource.getElementsByTagName(tagname);
    }

    public Element getElementById(final String elementId) {
        return xmlResource.getElementById(elementId);
    }
}
