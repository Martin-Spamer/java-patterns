
package javamentor.rules;

import java.io.File;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * RulesEngine Class.
 */
public class RulesEngine {

	private static final Logger log = LoggerFactory.getLogger(RulesEngine.class);
	private DocumentBuilderFactory documentBuilderFactory = null;
	private DocumentBuilder documentBuilder = null;
	private Document document = null;
	private Element documentElement = null;
	private String filename = null;
	private String[] args;

	/**
	 * Instantiates a new rules engine.
	 */
	public RulesEngine() {
		log.info(System.getProperties().toString());
		final String className = this.getClass().getSimpleName();
		filename = className + ".xml";
		initialise(filename);
	}

	/**
	 * Initialise.
	 *
	 * config filename
	 *
	 * @param configFilename the config filename
	 * @return true, if successful
	 */
	public boolean initialise(final String configFilename) {
		return initialise(new File(configFilename));
	}

	/**
	 * Initialise.
	 *
	 * config file
	 *
	 * @param configFile the config file
	 * @return true, if successful
	 */
	public boolean initialise(final File configFile) {
		boolean returnValue = false;
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			document = documentBuilder.parse(configFile);

			documentElement = document.getDocumentElement();
			if (documentElement != null) {
				log.info("documentElement = {}", documentElement);
			}

			returnValue = true;
		} catch (final ParserConfigurationException parserConfigurationException) {
			log.error(parserConfigurationException.toString());
		} catch (final FactoryConfigurationError factoryConfigurationError) {
			log.error(factoryConfigurationError.toString());
		} catch (final Exception exception) {
			log.error(exception.toString());
		}
		return returnValue;
	}

	/**
	 * Instantiates a new rules engine.
	 *
	 * args
	 *
	 * @param args the args
	 */
	public RulesEngine(final String[] args) {
		this.args = args;
		initialise(args);
	}

	/**
	 * Initialise.
	 *
	 * args
	 *
	 * @param args the args
	 */
	private void initialise(final String[] args) {
		log.info("args[]={}", Arrays.toString(args));
	}

	/**
	 * Execute.
	 *
	 * @return true, if successful
	 */
	public boolean execute() {
		final boolean returnValue = false;
		log.info("execute({}) = {}", this.getClass().getSimpleName(), returnValue);
		return returnValue;
	}

	/**
	 * element.
	 *
	 * document element
	 * element name
	 * element
	 *
	 * @param documentElement the document element
	 * @param elementName the element name
	 * @return the element
	 */
	public Element getElement(final Element documentElement, final String elementName) {
		Element element = null;
		final NodeList nodelist = documentElement.getElementsByTagName(elementName);
		if (nodelist != null) {
			if (nodelist.getLength() == 0) {
				final String className = this.getClass().getSimpleName();
				log.info("{}", className);
				log.info("Element {} is missing in element {}", elementName, documentElement.toString());
			} else {
				if (nodelist.getLength() > 1) {
					final String className = this.getClass().getSimpleName();
					log.info("{}", className);
					log.info(" surplus Elements {} ignored in element: {}", elementName, documentElement.toString());
				}
				element = (Element) nodelist.item(0);
			}
		}

		return element;
	}

	/**
	 * element attribute.
	 *
	 * document element
	 * element name
	 * attribute name
	 * element attribute
	 *
	 * @param documentElement the document element
	 * @param elementName the element name
	 * @param attributeName the attribute name
	 * @return the element attribute
	 */
	public String getElementAttribute(final Element documentElement,
	        final String elementName,
	        final String attributeName) {
		final Element element = getElement(documentElement, elementName);
		return element.getAttribute(attributeName);
	}

	/**
	 * main method.
	 *
	 * arguments
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {
		final RulesEngine rulesEngine = new RulesEngine(args);

		final String configFilename = rulesEngine.getClass().getSimpleName() + ".xml";
		rulesEngine.initialise(configFilename);
		rulesEngine.execute();
	}
}
