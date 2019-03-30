
package coaching.idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test class for Constants.
 */
public class ConstantsTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(ConstantsTest.class);

    /**
     * Unit test to.
     */
    @Test
    public void testConstants() {
        LOG.info("COUNTRY_CODE : {}", Constants.COUNTRY_CODE);
        LOG.info("COUNTRY_NAME : {}", Constants.COUNTRY_NAME);
        LOG.info("CURRENCY_GLYPH : {}", Constants.CURRENCY_GLYPH);
        LOG.info("CURRENCY_CODE : {}", Constants.CURRENCY_CODE);
        LOG.info("CURRENCY_NAME : {}", Constants.CURRENCY_NAME);
        LOG.info("LANGUAGE_CODE : {}", Constants.LANGUAGE_CODE);
        LOG.info("LANGUAGE_NAME : {}", Constants.LANGUAGE_NAME);
    }

}
