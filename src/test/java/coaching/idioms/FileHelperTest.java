
package coaching.idioms;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileHelperTest {

    private static final Logger LOG = LoggerFactory
        .getLogger(FileHelperTest.class);

    @Test
    public void testToStringString() throws Exception {
        LOG.info("{}", FileHelper.getAsString("LICENSE"));
    }

}
