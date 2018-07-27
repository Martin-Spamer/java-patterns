
package coaching.automation.ddt;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Unit tests for PlatformData class.
 */
@Ignore("Work-in-Progress")
public final class PlatformDataTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(PlatformDataTest.class);

    /**
     * Unit test to on platform.
     *
     * @throws Exception the exception
     */
    @Test
    public void testOnPlatform() throws Exception {
        PlatformData expectedData;

        expectedData = new PlatformData("local");
        assertNotNull(expectedData);
        LOG.info(expectedData.toString());

        expectedData = PlatformData.platform("local");
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
        assertNotNull(PlatformData.withTag("@AUTHORISED"));
        assertNotNull(PlatformData.withTag("@UNAUTHORISED"));
        assertNotNull(PlatformData.withCharacteristic("@AUTHORISED"));
        assertNotNull(PlatformData.withCharacteristic("@UNAUTHORISED"));
        assertNull(PlatformData.withTag("@tag"));

        assertNotNull(PlatformData.allWithTag("@AUTHORISED"));
        assertNotNull(PlatformData.allWithTag("@UNAUTHORISED"));
        assertNull(PlatformData.allWithTag("@tag"));
    }

}
