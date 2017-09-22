

package coaching.config;

import java.io.*;
import java.util.InvalidPropertiesFormatException;

import javax.xml.parsers.*;

import org.w3c.dom.*;

/**
 * Xml Configuration Class.
 */
public class XmlConfig extends AbstractConfig {

	private Element configElement = null;

	/**
	 * Instantiates a new XmlConfig.
	 */
	public XmlConfig() {
		load(new File(this.getClass().getSimpleName() + ".xml"));
	}

	/**
	 * Instantiates a new XmlConfig from configuration file.
	 *
	 * @param configFilename the Configuration filename
	 */
	public XmlConfig(final File configFilename) {
		load(configFilename);
	}

	/**
	 * Instantiates a new XmlConfig from configuration file name.
	 *
	 * @param configFilename the Configuration filename
	 */
	public XmlConfig(final String configFilename) {
		loadFromXmlFile(inputStream(toXmlFilename(configFilename)));
	}

	/**
	 * Load from xml file resource as stream.
	 *
	 * @param resourceAsStream the resource as stream
	 */
	public void loadFromXmlFile(final InputStream resourceAsStream) {
		if (resourceAsStream != null) {
			try {
				properties.loadFromXML(resourceAsStream);
			} catch (final InvalidPropertiesFormatException e) {
				log.error(e.toString());
			} catch (final IOException e) {
				log.error(e.toString());
			}
		}
	}

	/**
	 * To xml filename.
	 *
	 * @param configFilename the Configuration filename
	 * @return the string
	 */
	protected String toXmlFilename(final String configFilename) {
		return String.format("%s.xml", configFilename);
	}

	/**
	 * Load configuration filename.
	 *
	 * @param configFilename the Configuration filename
	 */
	public void load(final String configFilename) {
		load(new File(configFilename));
	}

	/**
	 * Load configuration file.
	 *
	 * @param configFile the Configuration file
	 */
	public void load(final File configFile) {
		try {
			final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			try {
				final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
				final Document document = documentBuilder.parse(configFile);
				configElement = document.getDocumentElement();
			} catch (final ParserConfigurationException parserConfigurationException) {
				log.error(parserConfigurationException.toString());
			}
		} catch (final Exception exception) {
			log.info("{}", exception.toString());
		}
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
		final NodeList propertyElements = configElement.getElementsByTagName("property");
		for (int i = 0; i < propertyElements.getLength(); i++) {
			final Node item = propertyElements.item(i);
			log.info("item={}", item.toString());
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
		return configElement.getTagName();
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
					text.append(toXml(children.item(i)));
				}
			}
		}
		return text.toString();
	}
}
