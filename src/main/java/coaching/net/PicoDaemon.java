
package coaching.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A Pico Daemon class.
 * A Daemon is a piece of code that sits idling, until a specific event of
 * condition occurs.
 * It will then process it task, before returning to an idling state or
 * stopping.
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
            LOG.info("serverSocket = {} ", serverSocket);

            while (keepRunning) {
                final Socket accept = serverSocket.accept();
                LOG.info("accept  = {} ", accept);
                final RequestHandler clientRequest = new RequestHandler(accept);
                final Thread clientThread = new Thread(clientRequest);
                clientThread.start();
                LOG.info(".");
            }
        } catch (final IOException e) {
            LOG.error(e.getLocalizedMessage(), e);
        } finally {
            try {
                LOG.info("closing server socket");
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (final IOException e) {
                LOG.error(e.getLocalizedMessage(), e);
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

    @Override
    public String toString() {
        return String
            .format("%s [keepRunning=%s]",
                    this.getClass().getSimpleName(),
                    keepRunning);
    }
}
