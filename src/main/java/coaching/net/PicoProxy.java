
package coaching.net;

import java.net.Socket;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * PicoProxy class.
 */
public final class PicoProxy {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(NetInfo.class);

    /**
     * Instantiates a new pico proxy.
     */
    public PicoProxy() {
        super();
        new PicoProxyDaemon();
    }

    /**
     * PicoProxyDaemon Class.
     */
    public class PicoProxyDaemon extends Thread {

        /**
         * Instantiates a new pico proxy daemon.
         */
        public PicoProxyDaemon() {
            super();
        }

        /* (non-Javadoc)
         * @see java.lang.Thread#run()
         */
        @Override
        public void run() {
            boolean exit = false;

            // ServerSocket serverSocket = new ServerSocket( 8888 ) ;

            while (!exit) {
                final Socket client = null;
                final Socket server = null;
                exit = true;
            }
        }
    }

    /**
     * main method.
     *
     * arguments
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        LOG.trace(System.getProperties().toString());
        LOG.debug("args[] = {}", Arrays.toString(args));
        new PicoProxy();
    }
}
