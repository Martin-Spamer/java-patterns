
package automation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.xml.XmlConfig;

/**
 * XmlConfigTest Class.
 */
public class XmlConfigTest {

    private static final Logger LOG = LoggerFactory.getLogger(XmlConfigTest.class);

    @Test
    public void testXmlConfig() {
        final XmlConfig xmlConfig = new XmlConfig();
        assertNotNull(xmlConfig);
        LOG.info(xmlConfig.toString());
    }

    @Test
    public void testXmlConfigString() {
        final XmlConfig xmlConfig = new XmlConfig("XmlConfig");
        assertNotNull(xmlConfig);
        LOG.info(xmlConfig.toString());
    }

    @Test
    public void testXmlConfigXmlString() {
        final XmlConfig xmlConfig = new XmlConfig("XmlConfig.xml");
        assertNotNull(xmlConfig);
        LOG.info(xmlConfig.toString());
    }

    @Test
    public void testMissingXmlConfig() {
        final XmlConfig xmlConfig = new XmlConfig("missing.xml");
        assertNotNull(xmlConfig);
        LOG.info(xmlConfig.toString());
    }

}
