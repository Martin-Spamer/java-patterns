
package coaching.config;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test xml configuration class.
 */
public class XmlConfigTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(XmlConfigTest.class);

    /**
     * Unit Test xml configuration.
     */
    @Test
    public void testXmlConfig() {
        final XmlProperties instance = new XmlProperties();
        assertNotNull(instance);
        LOG.debug("{}", instance.toString());
    }

    /**
     * Unit Test xml configuration string.
     */
    @Test
    public void testXmlConfigString() {
        final XmlProperties instance = new XmlProperties("Configuration.xml");
        assertNotNull(instance);
        LOG.debug("{}", instance.toString());
    }

}
