package idioms.config;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * The XmlConfig Class.
 */
public class XmlConfig implements ConfigInterface {
	private static final Logger LOG = LoggerFactory.getLogger(XmlConfig.class);
	private static DocumentBuilderFactory documentBuilderFactory = null;
	private static DocumentBuilder documentBuilder = null;
	private Document document = null;
	private Element configElement = null;
	private NodeList context = null;
	private int index = 0;

	static {
		XmlConfig.documentBuilderFactory = javax.xml.parsers.DocumentBuilderFactory.newInstance();
		try {
			XmlConfig.documentBuilder = XmlConfig.documentBuilderFactory.newDocumentBuilder();
		} catch (final ParserConfigurationException parserConfigurationException) {
			LOG.error(parserConfigurationException.toString());
		}
	}

	/**
	 * Instantiates a new XmlConfig.
	 */
	public XmlConfig() {
		load(new File(this.getClass().getSimpleName() + ".xml"));
	}

	/**
	 * Instantiates a new XmlConfig.
	 *
	 * @param configElement the configuration element
	 */
	public XmlConfig(final Element configElement) {
		this.configElement = configElement;
	}

	/**
	 * Instantiates a new XmlConfig.
	 *
	 * @param configFilename the configuration file
	 */
	public XmlConfig(final File configFilename) {
		load(configFilename);
	}

	/**
	 * Instantiates a new XmlConfig.
	 *
	 * @param configFilename the configuration file name
	 */
	public XmlConfig(final String configFilename) {
		load(new File(configFilename));
	}

	/**
	 * First element by tag name.
	 *
	 * @param elementName the element name
	 * @return the element
	 */
	private Element firstElementByTagName(final String elementName) {
		this.context = this.configElement.getElementsByTagName(elementName);
		return (Element) this.context.item(this.index = 0);
	}

	/**
	 * Gets the attribute.
	 *
	 * @param attributeName the attribute name
	 * @return the attribute
	 */
	protected String getAttribute(final String attributeName) {
		return this.configElement.getAttribute(attributeName);
	}

	/**
	 * Gets the elements by tag name.
	 *
	 * @param elementName the element name
	 * @return the elements by tag name
	 */
	protected org.w3c.dom.NodeList getElementsByTagName(final String elementName) {
		return this.configElement.getElementsByTagName(elementName);
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
	 * Gets the tag name.
	 *
	 * @return the tag name
	 */
	protected String getTagName() {
		return this.configElement.getTagName();
	}

	/**
	 * Load.
	 *
	 * @param configFile the configuration file
	 */
	public void load(final File configFile) {
		try {
			this.document = XmlConfig.documentBuilder.parse(configFile);
			this.configElement = this.document.getDocumentElement();
		} catch (final Exception exception) {
			XmlConfig.LOG.info("{}", exception.toString());
		}
	}

	/**
	 * Load.
	 *
	 * @param configFilename the configuration filename
	 */
	public void load(final String configFilename) {
		load(new File(configFilename));
	}

	/**
	 * Next element by tag name.
	 *
	 * @return the element
	 */
	protected Element nextElementByTagName() {
		return (Element) this.context.item(++this.index);
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
		return null != this.configElement ? toXml(this.configElement) : "null";
	}

	/**
	 * To xml.
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
				final org.w3c.dom.NodeList children = node.getChildNodes();
				for (int i = 0; i < children.getLength(); i++) {
					text.append(toXml(children.item(i)));
				}
			}
		}
		return text.toString();
	}
}
