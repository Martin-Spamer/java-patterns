
package coaching.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class PicoDaemon.
 */
public class PicoDaemon implements Runnable {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(PicoDaemon.class);

    /** The keep running. */
    private volatile boolean keepRunning = true;

    /**
     * Default Constructor.
     */
    public PicoDaemon() {
        LOG.info("{} loaded...", this.getClass().getSimpleName());
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        LOG.info("{} running...", this.getClass().getSimpleName());
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(8888);

            while (keepRunning) {
                final Socket accept = serverSocket.accept();
                final RequestHandler clientRequest = new RequestHandler(accept);
                final Thread clientThread = new Thread(clientRequest);
                clientThread.start();
            }
        } catch (final IOException e) {
            LOG.error(e.toString(), e);
        } finally {
            try {
                LOG.info("closing server socket");
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (final IOException e) {
                LOG.error(e.toString(), e);
            }
        }
        LOG.info("{} is stopping.....", this.getClass().getSimpleName());
    }

    /**
     * Stop.
     */
    public synchronized void stop() {
        keepRunning = false;
    }

}
