
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

    /** The pico daemon. */
    final PicoDaemon picoDaemon = new PicoDaemon();

    /**
     * The Constructor.
     */
    public PicoServer() {
        super();
        final Thread thread = new Thread(picoDaemon, "picoDaemon");
        thread.start();
    }

    /**
     * The main method.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        LOG.trace("System properties = {}", System.getProperties().toString());
        LOG.debug("args = {}", Arrays.toString(args));
        new PicoServer();
    }

}
