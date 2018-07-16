
package coaching.resources;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import static org.junit.Assert.assertNotNull;

public class XmlResourceLoaderTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(XmlResourceLoaderTest.class);

    @Test
    public void testGetDatabaseXml() throws Exception {
        Document xmlResource = XmlResourceLoader.getXmlResource("database.xml");
        assertNotNull(xmlResource);
        LOG.info("{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    @Test
    public void testGetConfigurationXml() throws Exception {
        Document xmlResource = XmlResourceLoader
            .getXmlResource("Configuration.xml");
        assertNotNull(xmlResource);
        LOG.info("{}", XmlResourceLoader.xmlToString(xmlResource));
    }
}
