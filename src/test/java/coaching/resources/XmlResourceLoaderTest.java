
package coaching.resources;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test class for XmlResourceLoader.
 */
public class XmlResourceLoaderTest {

    /** CONFIGURATION_XML constant. */
    private static final String CONFIGURATION_XML = "Configuration.xml";

    /** DATABASE_XML constant. */
    private static final String DATABASE_XML = "database.xml";

    /** CONFIGURATION_MISSING constant. */
    private static final String CONFIGURATION_MISSING = "Missing.xml";

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlResourceLoaderTest.class);

    /**
     * Unit test to get database xml.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetDatabaseXml() throws Exception {
        final Document xmlResource = XmlResourceLoader
            .getXmlResource(DATABASE_XML);
        assertNotNull(xmlResource);
        LOG.info("{}", xmlResource.getDoctype());
        LOG.info("{}", xmlResource.getXmlEncoding());
        LOG.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    /**
     * Unit test to get configuration xml.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetConfigurationXml() throws Exception {
        final Document xmlResource = XmlResourceLoader
            .getXmlResource(CONFIGURATION_XML);
        assertNotNull(xmlResource);
        LOG.info("{}", xmlResource.getDoctype());
        LOG.info("{}", xmlResource.getXmlEncoding());
        LOG.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    /**
     * Unit test to missing configuration.
     *
     * @throws Exception the exception
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingConfiguration() throws Exception {
        XmlResourceLoader.getXmlResource(CONFIGURATION_MISSING);
    }
}
