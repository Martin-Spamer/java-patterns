
package coaching.net;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PicoServer class.
 */
public class PicoServer {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PicoServer.class);

    final PicoDaemon picoDaemon = new PicoDaemon();

    public PicoServer() {
        super();
        final Thread thread = new Thread(picoDaemon, "picoDaemon");
        thread.start();
    }

    public static void main(final String[] args) {
        LOG.trace("System properties = {}", System.getProperties().toString());
        LOG.debug("args = {}", Arrays.toString(args));
        new PicoServer();
    }

}
