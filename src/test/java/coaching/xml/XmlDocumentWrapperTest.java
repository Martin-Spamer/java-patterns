
package coaching.xml;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.resources.ResourceNotLoadedException;

/**
 * Unit tests for XmlConfig class.
 */
public final class XmlDocumentWrapperTest {

    /** FILENAME 			constant. */
    private static final String FILENAME = "database";
    
    /** FILENAME_XML 			constant. */
    private static final String FILENAME_XML = FILENAME + ".xml";
    
    /** MISSING_XML 			constant. */
    private static final String MISSING_XML = "missing.xml";

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlDocumentWrapperTest.class);

    /**
     * Unit test to xml config string.
     */
    @Test
    public void testXmlConfigString() {
        final XmlDocumentWrapper xml = new XmlDocumentWrapper(FILENAME);
        assertNotNull(xml);
        LOG.info(xml.toString());
    }

    /**
     * Unit test to xml config xml string.
     */
    @Test
    public void testXmlConfigXmlString() {
        final XmlDocumentWrapper xml = new XmlDocumentWrapper(FILENAME_XML);
        assertNotNull(xml);
        LOG.info(xml.toString());
    }

    /**
     * Unit test to missing xml config.
     */
    @Test(expected = ResourceNotLoadedException.class)
    public void testMissingXmlConfig() {
        final XmlDocumentWrapper xmlConfig = new XmlDocumentWrapper(
                MISSING_XML);
        assertNotNull(xmlConfig);
        LOG.info(xmlConfig.toString());
    }

}
