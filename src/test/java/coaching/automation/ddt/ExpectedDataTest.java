
package coaching.automation.ddt;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Unit tests for ExpectedData class.
 */
@Ignore("Work-in-Progress")
public final class ExpectedDataTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(ExpectedDataTest.class);

    @Test
    public void testExpectedData() throws Exception {
        ExpectedData.fromCsv();
        ExpectedData.fromXml();
        ExpectedData.fromJson();
    }

    /**
     * Unit test to on platform.
     *
     * @throws Exception the exception
     */
    @Test
    public void testOnPlatform() throws Exception {
        ExpectedData expectedData;

        expectedData = new ExpectedData("local");
        assertNotNull(expectedData);
        LOG.info(expectedData.toString());

        expectedData = ExpectedData.platform("local");
        assertNotNull(expectedData);
        LOG.info(expectedData.toString());

        // String tagged = expectedData.getTagged("@foo");
        // assertNull(tagged);
        // assertNull(expectedData.getTagged("@bar"));
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
