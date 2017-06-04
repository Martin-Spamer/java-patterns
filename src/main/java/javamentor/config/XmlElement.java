/**
 *  @title       Element.java
 *  @description TODO
 *	Created      16-Aug-2004
 *
 **/

package javamentor.config;

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
	 */
	public XmlElement(Element element) {
		super();
		this.element = element;
		setXmlString(element.toString());
	}

	/**
	 * Instantiates a new xml element.
	 */
	public XmlElement(Element element, String xmlString) {
		super();
		setElement(element);
		setXmlString(xmlString);
	}

	public void setElement(Element element) {
		this.element = element;
	}

	public void setXmlString(String xmlString) {
		this.xmlString = xmlString;
	}

	public Element getElement() {
		return this.element;
	}

	public String getXmlString() {
		return this.xmlString;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see framework.config.ElementInterface#toXML()
	 */
	@Override
	public String toXML() {
		return this.xmlString;
	}

	@Override
	public String toString() {
		return String.format("XmlElement [element=%s, xmlString=%s]", this.element, this.xmlString);
	}

}
