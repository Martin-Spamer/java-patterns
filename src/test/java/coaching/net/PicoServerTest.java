
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class PicoServerTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory
        .getLogger(PicoServerTest.class);

    @Test
    public void testPicoServer() {
        final PicoServer picoServer = new PicoServer();
        assertNotNull(picoServer);
        LOG.info("{}", picoServer);
    }

}
