package coaching.rules;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * RulesEngine Class.
 */
public class RulesEngine {

	private static final Logger LOG = LoggerFactory.getLogger(RulesEngine.class);
	private DocumentBuilderFactory documentBuilderFactory = null;
	private DocumentBuilder documentBuilder = null;
	private Document document = null;
	private Element documentElement = null;
	private String filename = null;

	/**
	 * Instantiates a new rules engine.
	 */
	public RulesEngine() {
		LOG.trace(System.getProperties().toString());
		final String className = this.getClass().getSimpleName();
		this.filename = String.format("%s.xml", className);
		LOG.info("this.filename = {}", this.filename);
		initialise(this.filename);
	}

	/**
	 * Initialise.
	 *
	 * configuration filename
	 *
	 * @param configFilename the configuration filename
	 * @return true, if successful
	 */
	public boolean initialise(final String configFilename) {
		try {
			this.documentBuilderFactory = DocumentBuilderFactory.newInstance();
			if (this.documentBuilderFactory != null) {
				this.documentBuilder = this.documentBuilderFactory.newDocumentBuilder();
				if (this.documentBuilder != null) {
					final InputStream is = inputStream(configFilename);
					if (null != is) {
						this.document = this.documentBuilder.parse(is);
						return true;
					}
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Input stream.
	 *
	 * @param resourceName the resource name
	 * @return the input stream
	 */
	private InputStream inputStream(final String resourceName) {
		final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		final InputStream resourceAsStream = classloader.getResourceAsStream(resourceName);
		return resourceAsStream;
	}

	/**
	 * Execute.
	 *
	 * @return true, if successful
	 */
	public boolean execute() {
		final boolean returnValue = false;
		LOG.info("execute({}) = {}", this.getClass().getSimpleName(), returnValue);
		if (this.documentElement != null) {
			final NodeList childNodes = this.documentElement.getChildNodes();
			LOG.info("childNodes  = {}", childNodes);
		}
		return returnValue;
	}

	/**
	 * get element attribute.
	 *
	 * @param documentElement the document element
	 * @param elementName the element name
	 * @param attributeName the attribute name
	 * @return the element attribute
	 */
	private String getElementAttribute(final String elementName, final String attributeName) {
		final Element element = getElement(elementName);
		return element.getAttribute(attributeName);
	}

	/**
	 * get element.
	 *
	 * @param elementName the element name
	 * @return the element
	 */
	private Element getElement(final String elementName) {
		Element element = null;
		final NodeList nodelist = this.documentElement.getElementsByTagName(elementName);
		if (nodelist != null) {
			if (nodelist.getLength() == 0) {
				final String className = this.getClass().getSimpleName();
				LOG.info("{}", className);
				LOG.info("Element {} is missing in element {}", elementName, this.documentElement.toString());
			} else {
				if (nodelist.getLength() > 1) {
					final String className = this.getClass().getSimpleName();
					LOG.info("{}", className);
					LOG.info(" surplus Elements {} ignored in element: {}", elementName,
					        this.documentElement.toString());
				}
				element = (Element) nodelist.item(0);
			}
		}
		return element;
	}

}
