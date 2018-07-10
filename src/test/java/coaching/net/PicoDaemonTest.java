
package coaching.net;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

public class PicoDaemonTest {

    private static final Logger LOG = LoggerFactory.getLogger(PicoDaemonTest.class);

    @Test
    public void testPicoDaemon() {
        PicoDaemon picoDaemon = new PicoDaemon();
        assertNotNull(picoDaemon);
        LOG.info(picoDaemon.toString());
    }

}
