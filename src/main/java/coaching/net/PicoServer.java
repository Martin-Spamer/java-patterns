
package coaching.net;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PicoServer class.
 */
public final class PicoServer {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PicoServer.class);

    /** The pico daemon. */
    final PicoDaemon picoDaemon = new PicoDaemon();

    /**
     * Default Constructor.
     */
    public PicoServer() {
        super();
        final Thread thread = new Thread(picoDaemon, "picoDaemon");
        thread.start();
    }

}
