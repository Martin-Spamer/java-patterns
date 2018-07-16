
package coaching.resources;

import java.io.InputStream;
import java.io.StringWriter;

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

import static org.junit.Assert.fail;

public final class XmlResourceLoader {

    private static final Logger LOG = LoggerFactory
        .getLogger(XmlResourceLoader.class);

    private XmlResourceLoader() {
        fail("Use static methods");
    }

    public static Document getXmlResource(final String resourceName) {
        InputStream stream = ResourceLoader.getStream(resourceName);
        try {
            final DocumentBuilder builder = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder();
            return builder.parse(stream);
        } catch (final Exception exception) {
            String message = String
                .format("Failed to parse resource %s", resourceName);
            LOG.error(message, exception);
            throw new ResourceNotLoadedException(message, exception);
        }
    }

    private static String convertNodeToHtml(final Node node)
            throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter sw = new StringWriter();
        t.transform(new DOMSource(node), new StreamResult(sw));
        return sw.toString();
    }

    public static String xmlToString(final Document xmlResource)
            throws Exception {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer t = tf.newTransformer();
        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        StringWriter sw = new StringWriter();
        DOMSource xmlSource = new DOMSource(xmlResource);
        StreamResult outputTarget = new StreamResult(sw);
        t.transform(xmlSource, outputTarget);
        return sw.toString();
    }
}
