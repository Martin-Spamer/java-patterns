
package coaching.resources;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import static org.junit.Assert.assertNotNull;

public class XmlResourceLoaderTest {

    private static final String CONFIGURATION_XML = "Configuration.xml";
    private static final String DATABASE_XML = "database.xml";
    private static final String CONFIGURATION_MISSING = "Missing.xml";
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlResourceLoaderTest.class);

    @Test
    public void testGetDatabaseXml() throws Exception {
        final Document xmlResource = XmlResourceLoader
            .getXmlResource(DATABASE_XML);
        assertNotNull(xmlResource);
        LOG.info("{}", xmlResource.getDoctype());
        LOG.info("{}", xmlResource.getXmlEncoding());
        LOG.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    @Test
    public void testGetConfigurationXml() throws Exception {
        final Document xmlResource = XmlResourceLoader
            .getXmlResource(CONFIGURATION_XML);
        assertNotNull(xmlResource);
        LOG.info("{}", xmlResource.getDoctype());
        LOG.info("{}", xmlResource.getXmlEncoding());
        LOG.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingConfiguration() throws Exception {
        XmlResourceLoader.getXmlResource(CONFIGURATION_MISSING);
    }
}
