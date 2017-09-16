
package coaching.config;

import java.io.File;

import javax.xml.parsers.*;

import org.slf4j.*;
import org.w3c.dom.*;

/**
 * XmlConfiguration Class.
 */
public class XmlConfig implements ConfigInterface {
	private static final Logger LOG = LoggerFactory.getLogger(XmlConfig.class);
	private DocumentBuilder documentBuilder = null;
	private Document document = null;
	private Element configElement = null;
	private NodeList context = null;
	private int index = 0;

	/**
	 * Instantiates a new XmlConfig.
	 */
	public XmlConfig() {
		load(new File(this.getClass().getSimpleName() + ".xml"));
	}

	/**
	 * Instantiates a new XmlConfig from configuration file
	 *
	 * @param configFilename the Configuration filename
	 */
	public XmlConfig(final File configFilename) {
		load(configFilename);
	}

	/**
	 * Instantiates a new XmlConfig from configuration file name
	 *
	 * @param configFilename the Configuration filename
	 */
	public XmlConfig(final String configFilename) {
		load(new File(configFilename));
	}

	/**
	 * Instantiates a new XmlConfig from configuration element
	 *
	 * @param configElement the Configuration element
	 */
	public XmlConfig(final Element configElement) {
		this.configElement = configElement;
	}

	/**
	 * Load configuration filename
	 *
	 * @param configFilename the Configuration filename
	 */
	public void load(final String configFilename) {
		load(new File(configFilename));
	}

	/**
	 * Load configuration file
	 *
	 * @param configFile the Configuration file
	 */
	public void load(final File configFile) {
		try {
			final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			try {
				documentBuilder = documentBuilderFactory.newDocumentBuilder();
				document = documentBuilder.parse(configFile);
				configElement = document.getDocumentElement();
			} catch (final ParserConfigurationException parserConfigurationException) {
				LOG.error(parserConfigurationException.toString());
			}
		} catch (final Exception exception) {
			LOG.info("{}", exception.toString());
		}
	}

	/**
	 * First element by tag name.
	 *
	 * @param elementName the element name
	 * @return the element
	 */
	private Element firstElementByTagName(final String elementName) {
		context = configElement.getElementsByTagName(elementName);
		return (Element) context.item(index = 0);
	}

	/**
	 * attribute.
	 *
	 * @param attributeName the attribute name
	 * @return the attribute
	 */
	protected String getAttribute(final String attributeName) {
		return configElement.getAttribute(attributeName);
	}

	/**
	 * elements by tag name.
	 *
	 * @param elementName the element name
	 * @return the elements by tag name
	 */
	protected NodeList getElementsByTagName(final String elementName) {
		return configElement.getElementsByTagName(elementName);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see framework.config.ConfigInterface#getProperty(java.lang.String)
	 */
	@Override
	public String getProperty(final String key) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see framework.config.ConfigInterface#getProperty(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public String getProperty(final String key, final String defaultValue) {
		return null;
	}

	/**
	 * tag name.
	 *
	 * @return the tag name
	 */
	protected String getTagName() {
		return configElement.getTagName();
	}

	/**
	 * Next element by tag name.
	 *
	 * @return the element
	 */
	protected Element nextElementByTagName() {
		return (Element) context.item(++index);
	}

	/**
	 * Sub config.
	 *
	 * @param elementName the element name
	 * @return the xml config
	 */
	public XmlConfig subConfig(final String elementName) {
		return new XmlConfig(firstElementByTagName(elementName));
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return null != configElement ? toXml(configElement) : "null";
	}

	/**
	 * To xml string.
	 *
	 * @param node the node
	 * @return the string
	 */
	private String toXml(final org.w3c.dom.Node node) {
		StringBuffer text = new StringBuffer();
		if (node != null) {
			final String value = node.getNodeValue();
			if (value != null) {
				text = new StringBuffer(value);
			}
			if (node.hasChildNodes()) {
				final NodeList children = node.getChildNodes();
				for (int i = 0; i < children.getLength(); i++) {
					text.append(toXml(children.item(i)));
				}
			}
		}
		return text.toString();
	}
}
