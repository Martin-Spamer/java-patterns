
package coaching.xml;

import java.io.InputStream;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import coaching.resources.ResourceLoader;

/**
 * Unit test class for XmlDocumentUsage.
 */
@Ignore("work-in-progress")
public class XmlDocumentUsageTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(XmlDocumentUsageTest.class);

    /**
     * Unit test to load xml from stream.
     */
    @Test
    public void testLoadXmlFromStream() {
        XmlDocumentUsage xml = new XmlDocumentUsage();
        assertNotNull(xml);
        InputStream stream = ResourceLoader.getStream("POM.XML");
        xml.loadXmlFromStream(stream);
        fail("Not yet implemented");
    }

}
