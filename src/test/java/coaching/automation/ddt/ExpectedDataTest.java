
package coaching.automation.ddt;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Unit tests for ExpectedData class.
 */
public final class ExpectedDataTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(ExpectedDataTest.class);

    @Test
    public void testExpectedDataFromCsv() throws Exception {
        ExpectedData fromCsv = ExpectedData.fromCsv();
        assertNotNull(fromCsv);
        LOG.info("{}", fromCsv);
    }

    @Test
    public void testExpectedDataFromXml() throws Exception {
        ExpectedData fromXml = ExpectedData.fromXml();
        assertNotNull(fromXml);
        LOG.info("{}", fromXml);
    }

    @Test
    public void testExpectedDataFromJson() throws Exception {
        ExpectedData fromJson = ExpectedData.fromJson();
        assertNotNull(fromJson);
        LOG.info("{}", fromJson);
    }

    /**
     * Unit test to default platform domain language.
     *
     * @throws Exception the exception
     */
    @Test
    public void testDefaultPlatformDomainLanguage() throws Exception {
        assertNotNull(ExpectedData.debugString(),
                ExpectedData.withTag("@AUTHORISED"));
        assertNotNull(ExpectedData.withTag("@UNAUTHORISED"));
        assertNotNull(ExpectedData.withCharacteristic("@AUTHORISED"));
        assertNotNull(ExpectedData.withCharacteristic("@UNAUTHORISED"));
        assertNull(ExpectedData.withTag("@tag"));

        assertNotNull(ExpectedData.allWithTag("@AUTHORISED"));
        assertNotNull(ExpectedData.allWithTag("@UNAUTHORISED"));
        assertNull(ExpectedData.allWithTag("@tag"));
    }

}
