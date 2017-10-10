
package coaching.xml;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.*;
import org.w3c.dom.*;

/**
 * DOM Element Mapper Class.
 */
public class ElementMapper {

	private static final Logger log = LoggerFactory.getLogger(ElementMapper.class);
	private String indexName = "id";
	private final Map<String, Element> elementMap = new ConcurrentHashMap<String, Element>();

	/**
	 * Instantiates a new element mapper.
	 */
	public ElementMapper() {
		super();
	}

	/**
	 * Instantiates a new element mapper.
	 *
	 * @param document the document
	 */
	public ElementMapper(final Document document) {
		initialisation(document);
	}

	/**
	 * Initialisation.
	 *
	 * @param document the document
	 */
	public void initialisation(final Document document) {
		final Element documentElement = document.getDocumentElement();
		final NodeList childNodes = documentElement.getChildNodes();
		initialisation(childNodes);
	}

	/**
	 * Initialisation.
	 *
	 * @param nodeList the node list
	 */
	public void initialisation(final NodeList nodeList) {
		for (int index = 0; index < nodeList.getLength(); index++) {
			final Element element = (Element) nodeList.item(index);
			final String key = element.getAttribute(this.indexName);
			this.elementMap.put(key, element);
			ElementMapper.log.info("{}={}", this.indexName, element);
		}
	}

	/**
	 * text.
	 *
	 * @param node the node
	 * @return the text
	 */
	public static String getText(final Node node) {
		// * text from elements, entity
		// references, CDATA sections, and text nodes; but not
		// comments or processing instructions
		final int type = node.getNodeType();
		if (type == Node.COMMENT_NODE || type == Node.PROCESSING_INSTRUCTION_NODE) {
			return "";
		}

		final StringBuffer text = new StringBuffer();

		final String value = node.getNodeValue();
		if (value != null) {
			text.append(value);
		}

		if (node.hasChildNodes()) {
			final NodeList children = node.getChildNodes();
			for (int index = 0; index < children.getLength(); index++) {
				final Node child = children.item(index);
				text.append(getText(child));
			}
		}
		return text.toString();
	}

	/**
	 * Find element.
	 *
	 * @param attributeName the attribute name
	 * @return the element
	 */
	public Element findElement(final String attributeName) {
		final Element element = this.elementMap.get(attributeName);
		return element;
	}

	/**
	 * Find element text.
	 *
	 * @param attributeName the attribute name
	 * @return the string
	 */
	public String findElementText(final String attributeName) {
		final Node node = this.elementMap.get(attributeName);
		return getText(node);
	}

	/**
	 * Index name.
	 *
	 * @param indexAttribute the index attribute
	 * @return the string
	 */
	public String indexName(final String indexAttribute) {
		if (indexAttribute != null) {
			this.indexName = indexAttribute;
		}
		return this.indexName;
	}
}
