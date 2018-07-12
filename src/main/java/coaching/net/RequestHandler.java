
package coaching.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class RequestHandler.
 */
class RequestHandler implements Runnable {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(RequestHandler.class);

    /** The exit. */
    private volatile boolean exit = false;

    /** The connections count. */
    private static int connectionsCount;

    /** The connection id. */
    private int connectionId = 0;

    /** The client socket. */
    private Socket clientSocket;

    /**
     * The Constructor.
     *
     * @param clientSocket the client socket
     */
    public RequestHandler(final Socket clientSocket) {
        super();
        LOG.info("handling connection {}", clientSocket);
        this.clientSocket = clientSocket;
        connectionId = connectionsCount++;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        PrintWriter printWriter = null;
        BufferedReader bufferedReader = null;
        try {
            printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
            InputStream inStream = clientSocket.getInputStream();
            InputStreamReader reader = new InputStreamReader(inStream);
            bufferedReader = new BufferedReader(reader);
            String inputLine, outputLine;
            while (!exit) {
                inputLine = bufferedReader.readLine();
                if (inputLine == null) {
                    exit = true;
                } else {
                    outputLine = String.format("%s\n", inputLine);
                    printWriter.write(outputLine);
                    printWriter.flush();
                }
            }

            if (printWriter != null) {
                printWriter.close();
                printWriter = null;
                if (bufferedReader != null) {
                    bufferedReader.close();
                    bufferedReader = null;
                    if (clientSocket != null) {
                        LOG.debug("closing connection : {}", connectionId);
                        clientSocket.close();
                        clientSocket = null;
                    }
                }
            }
        } catch (final IOException e) {
            LOG.error(e.toString());
        }
    }
}
