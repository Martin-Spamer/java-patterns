package coaching.rules;

import java.io.*;

import javax.xml.parsers.*;

import org.slf4j.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 * RulesEngine Class.
 */
public class RulesEngine {

	private static final Logger LOG = LoggerFactory.getLogger(RulesEngine.class);
	private Document document = null;
	private Element documentElement = null;

	/**
	 * Instantiates a new rules engine.
	 */
	public RulesEngine() {
		LOG.trace(System.getProperties().toString());
		final String className = this.getClass().getSimpleName();
		final String filename = String.format("%s.xml", className);
		LOG.info("this.filename = {}", filename);
		initialise(filename);
	}

	/**
	 * Initialise with configuration filename
	 *
	 * @param configFilename the configuration filename
	 * @return true, if successful
	 */
	public boolean initialise(final String configFilename) {
		try {
			final DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			if (documentBuilderFactory != null) {
				final DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
				if (documentBuilder != null) {
					final InputStream is = inputStream(configFilename);
					if (null != is) {
						this.document = documentBuilder.parse(is);
						this.documentElement = this.document.getDocumentElement();
						return true;
					}
				}
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			LOG.error("{}", e.toString());
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
