
package coaching.config;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * A UnitTest for AbstractConfiguration objects.
 */
public class AbstractXmlConfigTest {

    /** provide logging. */
    private static final Logger LOG = LoggerFactory.getLogger(AbstractXmlConfigTest.class);

    /**
     * Mock Configuration.
     */
    public class TestXmlConfig extends AbstractXmlConfig {
    }

    /**
     * Missing Configuration.
     */
    public class MissingXmlConfig extends AbstractXmlConfig {
    }

    /**
     * Invalid Configuration.
     */
    public class InvalidXmlConfig extends AbstractXmlConfig {
    }

    /**
     * Unit Test for test abstract Configuration.
     */
    @Test
    public void testAbstractXmlConfig() {
        LOG.debug("testAbstractXmlConfig");
        final AbstractXmlConfig mockConfig = new TestXmlConfig();
        assertNotNull(mockConfig);
        LOG.debug(mockConfig.toString());

        assertNull(mockConfig.getProperty("missing-key"));
        assertNotNull(mockConfig.getProperty("key"));
        assertNotNull(mockConfig.getProperty("key", "defaultValue"));
        LOG.debug(mockConfig.toString());
    }

    /**
     * Unit test to missing configuration file.
     */
    @Test
    public void testMissingXmlConfig() {
        LOG.debug("testMissingXmlConfig");
        final AbstractXmlConfig missingConfig = new MissingXmlConfig();
        assertNotNull(missingConfig);
        LOG.debug(missingConfig.toString());
    }

    /**
     * Unit test to invalid configuration file.
     */
    @Test
    public void testInvalidXmlConfig() {
        LOG.debug("testInvalidConfig");
        final AbstractXmlConfig invalidConfig = new InvalidXmlConfig();
        assertNotNull(invalidConfig);
        LOG.debug(invalidConfig.toString());
    }

}
