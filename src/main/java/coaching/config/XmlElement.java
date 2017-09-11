/**
 *  @title       Element.java
 *  @description TODO
 *	Created      16-Aug-2004
 *
 **/

package coaching.config;

import org.w3c.dom.Element;

/**
 * XmlElement Class.
 */
public class XmlElement implements XmlElementInterface {

	private Element element = null;
	private String xmlString = null;

	/**
	 * Instantiates a new xml element.
	 */
	public XmlElement() {
	}

	/**
	 * Instantiates a new xml element.
	 *
	 * element
	 *
	 * @param element the element
	 */
	public XmlElement(Element element) {
		super();
		this.element = element;
		setXmlString(element.toString());
	}

	/**
	 * Instantiates a new xml element.
	 *
	 * element
	 * xml string
	 *
	 * @param element the element
	 * @param xmlString the xml string
	 */
	public XmlElement(Element element, String xmlString) {
		super();
		setElement(element);
		setXmlString(xmlString);
	}

	/**
	 * element.
	 *
	 * new
	 * 			element
	 *
	 * @param element the new
	 * 			element
	 */
	public void setElement(Element element) {
		this.element = element;
	}

	/**
	 * xml string.
	 *
	 * new
	 * 			xml string
	 *
	 * @param xmlString the new
	 * 			xml string
	 */
	public void setXmlString(String xmlString) {
		this.xmlString = xmlString;
	}

	/**
	 * element.
	 *
	 * element
	 *
	 * @return the element
	 */
	public Element getElement() {
		return element;
	}

	/**
	 * xml string.
	 *
	 * xml string
	 *
	 * @return the xml string
	 */
	public String getXmlString() {
		return xmlString;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see framework.config.ElementInterface#toXML()
	 */
	@Override
	public String toXML() {
		return xmlString;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("XmlElement [element=%s, xmlString=%s]", element, xmlString);
	}

}
