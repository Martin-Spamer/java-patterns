
package coaching.idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test class for FileHelper.
 */
public class FileHelperTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(FileHelperTest.class);

    /**
     * Unit test to to string string.
     *
     * @throws Exception the exception
     */
    @Test
    public void testToStringString() throws Exception {
        LOG.info("{}", FileHelper.getAsString("LICENSE"));
    }

}
