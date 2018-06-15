
package coaching.config;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.InvalidPropertiesFormatException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Xml Configuration Class.
 */
public class XmlConfig extends AbstractConfig {

	private Element configElement = null;

	/**
	 * Instantiates a new XmlConfig.
	 */
	public XmlConfig() {
		super();
		final Class<? extends XmlConfig> className = this.getClass();
		final String simpleName = className.getSimpleName();
		final String pathname = String.format("%s.xml", simpleName);
		final File configFile = new File(pathname);
		load(configFile);
	}

	/**
	 * Instantiates a new XmlConfig from configuration file.
	 *
	 * @param configFilename
	 *            the Configuration filename
	 */
	public XmlConfig(final File configFilename) {
		super();
		load(configFilename);
	}

	/**
	 * Instantiates a new XmlConfig from configuration file name.
	 *
	 * @param configFilename
	 *            the Configuration filename
	 */
	public XmlConfig(final String configFilename) {
		super();
		loadFromXmlFile(inputStream(toXmlFilename(configFilename)));
	}

	/**
	 * Load from xml file resource as stream.
	 *
	 * @param resourceAsStream
	 *            the resource as stream
	 */
	public void loadFromXmlFile(final InputStream resourceAsStream) {
		if (resourceAsStream != null) {
			try {
				this.properties.loadFromXML(resourceAsStream);
			} catch (final InvalidPropertiesFormatException e) {
				this.log.error(e.toString());
			} catch (final IOException e) {
				this.log.error(e.toString());
			}
		}
	}

	/**
	 * To xml filename.
	 *
	 * @param configFilename
	 *            the Configuration filename
	 * @return the string
	 */
	protected String toXmlFilename(final String configFilename) {
		return String.format("%s.xml", configFilename);
	}

	/**
	 * Load configuration filename.
	 *
	 * @param configFilename
	 *            the Configuration filename
	 */
	public void load(final String configFilename) {
		load(new File(configFilename));
	}

	/**
	 * Load configuration file.
	 *
	 * @param configFile
	 *            the Configuration file
	 */
	public void load(final File configFile) {
		try {
			final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			try {
				final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
				final Document document = documentBuilder.parse(configFile);
				this.configElement = document.getDocumentElement();
			} catch (final ParserConfigurationException parserConfigurationException) {
				this.log.error(parserConfigurationException.toString());
			}
		} catch (final Exception exception) {
			this.log.info("{}", exception.toString());
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
		return this.configElement.getAttribute(attributeName);
	}

	/**
	 * elements by tag name.
	 *
	 * @param elementName
	 *            the element name
	 * @return the elements by tag name
	 */
	protected NodeList getElementsByTagName(final String elementName) {
		return this.configElement.getElementsByTagName(elementName);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see framework.config.ConfigInterface#getProperty(java.lang.String)
	 */
	@Override
	public String getProperty(final String key) {
		final NodeList propertyElements = this.configElement.getElementsByTagName("property");
		for (int i = 0; i < propertyElements.getLength(); i++) {
			final Node item = propertyElements.item(i);
			this.log.info("item={}", item.toString());
		}
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
		final String property = getProperty(key);
		return property == null ? defaultValue : property;
	}

	/**
	 * tag name.
	 *
	 * @return the tag name
	 */
	protected String getTagName() {
		return this.configElement.getTagName();
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
	 * To xml string.
	 *
	 * @param node
	 *            the node
	 * @return the string
	 */
	private String toXml(final Node node) {
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
					final String xml = toXml(item);
					text.append(xml);
				}
			}
		}
		return text.toString();
	}
}
