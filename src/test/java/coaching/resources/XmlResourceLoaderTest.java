
package coaching.resources;

import org.junit.Test;
import org.w3c.dom.Document;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for XmlResourceLoader.
 */
@Slf4j
public class XmlResourceLoaderTest {

    private static final String RESOURCE_XML = "Configuration.xml";
    private static final String DATABASE_XML = "database.xml";
    private static final String CONFIGURATION_MISSING = "Missing.xml";

    /**
     * Unit test to get database xml.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetDatabaseXml() throws Exception {
        final Document xmlResource = XmlResourceLoader.getXmlDocument(DATABASE_XML);
        assertNotNull(xmlResource);
        log.info("{}", xmlResource.getDoctype());
        log.info("{}", xmlResource.getXmlEncoding());
        log.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    /**
     * Unit test to get configuration xml.
     *
     * @throws Exception the exception
     */
    @Test
    public void testGetConfigurationXml() throws Exception {
        final Document xmlResource = XmlResourceLoader.getXmlDocument(RESOURCE_XML);
        assertNotNull(xmlResource);
        log.info("{}", xmlResource.getDoctype());
        log.info("{}", xmlResource.getXmlEncoding());
        log.info("\n{}", XmlResourceLoader.xmlToString(xmlResource));
    }

    /**
     * Unit test to missing configuration.
     *
     * @throws Exception the exception
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingConfiguration() throws Exception {
        XmlResourceLoader.getXmlDocument(CONFIGURATION_MISSING);
    }
}
