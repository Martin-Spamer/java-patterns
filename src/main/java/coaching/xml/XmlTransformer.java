
package coaching.xml;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * XML Transformer class.
 */
public class XmlTransformer {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlTransformer.class);

    /** A Document Builder Factory. */
    private final DocumentBuilderFactory dbf = DocumentBuilderFactory
        .newInstance();

    /**
     * Instantiates a new xml transformer.
     *
     * @throws Exception the exception
     */
    public XmlTransformer() throws Exception {
        super();
        final DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
        final StringBuilder stringBuilder = new StringBuilder()
            .append("<row>")
            .append(" <name>Alice</name>")
            .append(" <id>1</id>")
            .append(" <data>sender</data>")
            .append("</row>");
        final InputStream inputStream = new ByteArrayInputStream(
                stringBuilder.toString().getBytes());
        final Document document = documentBuilder.parse(inputStream);
        final Node rootElement = document.getDocumentElement();
        final String nodeAsString = XmlTransformer.nodeToString(rootElement);
        LOG.info(nodeAsString);
    }

    /**
     * Node to string.
     *
     * @param node the node
     * @return the string
     * @throws TransformerException
     */
    private static String nodeToString(final Node node)
            throws TransformerException {
        final StringWriter stringWriter = new StringWriter();
        final TransformerFactory transformerFactory = TransformerFactory
            .newInstance();
        transformerFactory
            .setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

        final Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer
            .transform(new DOMSource(node), new StreamResult(stringWriter));
        return stringWriter.toString();
    }
}
