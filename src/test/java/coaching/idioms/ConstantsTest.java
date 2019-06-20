
package coaching.idioms;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test class for Constants.
 */


/** The Constant 			log. */
@Slf4j
public class ConstantsTest {

    /**
     * Unit test to.
     */
    @Test
    public void testConstants() {
        log.info("COUNTRY_CODE : {}", Constants.COUNTRY_CODE);
        log.info("COUNTRY_NAME : {}", Constants.COUNTRY_NAME);
        log.info("CURRENCY_GLYPH : {}", Constants.CURRENCY_GLYPH);
        log.info("CURRENCY_CODE : {}", Constants.CURRENCY_CODE);
        log.info("CURRENCY_NAME : {}", Constants.CURRENCY_NAME);
        log.info("LANGUAGE_CODE : {}", Constants.LANGUAGE_CODE);
        log.info("LANGUAGE_NAME : {}", Constants.LANGUAGE_NAME);
    }

}
