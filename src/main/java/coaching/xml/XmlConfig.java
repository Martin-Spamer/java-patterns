
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

import coaching.config.AbstractXmlConfig;

/**
 * XML Configuration class.
 */
public final class XmlConfig extends AbstractXmlConfig {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(XmlConfig.class);

    /** configuration element. */
    private Element configElement = null;

    /**
     * Instantiates a new XmlConfig.
     */
    public XmlConfig() {
        super();
        log.debug("XmlConfig()");
    }

    /**
     * Instantiates a new XmlConfig from configuration file name.
     *
     * @param filename
     *            the Configuration filename
     */
    public XmlConfig(final String filename) {
        super(filename);
        log.debug("XmlConfig({})", filename);
    }

    /**
     * To xml filename.
     *
     * @param configName
     *            the Configuration filename
     * @return the string
     */
    protected String toXmlFilename(final String configName) {
        return String.format("%s.xml", configName);
    }

    /**
     * Load xml.
     *
     * @param configFile the config file
     */
    protected void loadXml(final File configFile) {
        loadXml(configFile.getPath());
    }

    /**
     * Load xml.
     *
     * @param configFilename the config filename
     */
    protected void loadXml(final String configFilename) {
        final File configFile = new File(configFilename);
        loadXml(configFile);
    }

    /**
     * Stream for resource.
     *
     * @param propertyFileName the property file name
     * @return the input stream
     */
    protected InputStream streamForResource(final String propertyFileName) {
        final ClassLoader classLoader = Thread
            .currentThread()
            .getContextClassLoader();
        return classLoader.getResourceAsStream(propertyFileName);
    }

    /**
     * Load configuration file.
     *
     * @param configInputStream the config input stream
     */
    protected void loadXmlStream(final InputStream configInputStream) {
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
            try {
                final DocumentBuilder documentBuilder = documentBuilderFactory
                    .newDocumentBuilder();
                final Document document = documentBuilder
                    .parse(configInputStream);
                configElement = document.getDocumentElement();
            } catch (final ParserConfigurationException parserConfigurationException) {
                LOG.error(parserConfigurationException.toString());
            }
        } catch (final Exception exception) {
            LOG.error(exception.toString(), exception);
        }
    }

    /**
     * Load xml file.
     *
     * @param configFile the config file
     */
    public void loadXmlFile(final File configFile) {
        try {
            final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
                .newInstance();
            try {
                final DocumentBuilder documentBuilder = documentBuilderFactory
                    .newDocumentBuilder();
                final Document document = documentBuilder.parse(configFile);
                configElement = document.getDocumentElement();
            } catch (final ParserConfigurationException parserConfigurationException) {
                LOG.error(parserConfigurationException.toString());
            }
        } catch (final Exception exception) {
            LOG.error(exception.toString(), exception);
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

    /**
     * Gets the property.
     *
     * @param key the key
     * @return the property
     */
    /*
     * (non-Javadoc)
     * @see framework.config.ConfigInterface#getProperty(java.lang.String)
     */
    public String getProperty(final String key) {
        final NodeList propertyElements = configElement
            .getElementsByTagName("property");
        for (int i = 0; i < propertyElements.getLength(); i++) {
            final Node item = propertyElements.item(i);
            LOG.info("item = {}", item.toString());
        }
        return null;
    }

    /**
     * Gets the property.
     *
     * @param key the key
     * @param defaultValue the default value
     * @return the property
     */
    /*
     * (non-Javadoc)
     * @see framework.config.ConfigInterface#getProperty(java.lang.String,
     * java.lang.String)
     */
    public String getProperty(final String key, final String defaultValue) {
        final String property = getProperty(key);
        return property == null ? defaultValue : property;
    }

    /**
     * tag name.
     *
     * @return the tag name
     */
    protected String getTagName() {
        return configElement.getTagName();
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
        StringBuilder text = new StringBuilder();
        if (node != null) {
            final String value = node.getNodeValue();
            if (value != null) {
                text = new StringBuilder(value);
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
