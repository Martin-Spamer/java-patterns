
package coaching.xml;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class XmlTransformer {
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlTransformer.class);
    final DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

    public XmlTransformer() throws Exception {
        super();

        final DocumentBuilder db = dbf.newDocumentBuilder();
        final StringBuilder s = new StringBuilder()
            .append("<row>")
            .append(" <name>Alice</name>")
            .append(" <id>1</id>")
            .append(" <data>sender</data>")
            .append("</row>");

        final InputStream is = new ByteArrayInputStream(
                s.toString().getBytes());

        final Document d = db.parse(is);

        final Node rootElement = d.getDocumentElement();

        LOG.info(XmlTransformer.nodeToString(rootElement));
    }

    private static String nodeToString(final Node node) throws Exception {
        StringWriter sw = new StringWriter();
        Transformer t = TransformerFactory.newInstance().newTransformer();

        t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.transform(new DOMSource(node), new StreamResult(sw));

        return sw.toString();
    }
}
