
package coaching.idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConstantsTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(ConstantsTest.class);

    @Test
    public void test() {
        LOG.info("{}", Constants.COUNTRY_CODE);
        LOG.info("{}", Constants.COUNTRY_NAME);
        LOG.info("{}", Constants.CURRENCY_CODE);
        LOG.info("{}", Constants.CURRENCY_GLYPH);
        LOG.info("{}", Constants.CURRENCY_NAME);
        LOG.info("{}", Constants.LANGUAGE_CODE);
        LOG.info("{}", Constants.LANGUAGE_NAME);
    }

}
