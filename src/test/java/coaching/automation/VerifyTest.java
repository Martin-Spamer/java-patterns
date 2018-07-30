
package coaching.automation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test class for Verify.
 */
public class VerifyTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(VerifyTest.class);

    /**
     * Unit test to verify that.
     */
    @Test
    public void testVerifyThat() {
        Verify.that(true).isTrue();
        Verify.that(false).isFalse();
        Verify.that(1).equalTo(1);
        Verify.that(1).equalTo(0);
        Verify.that(1L).equalTo(1);
        Verify.that(1L).equalTo(0);
    }

}
