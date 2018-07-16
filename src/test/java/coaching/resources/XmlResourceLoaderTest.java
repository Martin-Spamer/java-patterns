
package coaching.resources;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;

import static org.junit.Assert.assertNotNull;

public class XmlResourceLoaderTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(XmlResourceLoaderTest.class);

    @Test
    public void testGetDatabaseXml() throws Exception {
        Document xmlResource = XmlResourceLoader.getXmlResource("database.xml");
        assertNotNull(xmlResource);
        DocumentType doctype = xmlResource.getDoctype();
        String xmlEncoding = xmlResource.getXmlEncoding();
        LOG.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    @Test
    public void testGetConfigurationXml() throws Exception {
        Document xmlResource = XmlResourceLoader
            .getXmlResource("Configuration.xml");
        assertNotNull(xmlResource);
        DocumentType doctype = xmlResource.getDoctype();
        String xmlEncoding = xmlResource.getXmlEncoding();
        LOG.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    @Test
    public void testMissingConfiguration() throws Exception {
        Document xmlResource = XmlResourceLoader
            .getXmlResource("Configuration.missing");
        assertNotNull(xmlResource);
        DocumentType doctype = xmlResource.getDoctype();
        String xmlEncoding = xmlResource.getXmlEncoding();
        LOG.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }
}
