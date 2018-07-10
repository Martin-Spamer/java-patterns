
package coaching.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class RequestProxy implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(RequestProxy.class);
    private volatile boolean keepRunning = true;
    private static int connectionsCount;
    private int connectionId = 0;
    private Socket clientSocket = null;

    public RequestProxy(final Socket clientSocket) {
        connectionId = connectionsCount++;
        LOG.error("handling connection : {}", connectionId);
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        final int localport = 8888;
        ServerSocket listeningSocket = null;
        final byte[] request = new byte[4096];
        final byte[] reply = new byte[4096];

        try {
            listeningSocket = new ServerSocket(localport);

            while (keepRunning) {
                Socket clientSocket = null;
                Socket serverSocket = null;

                try {
                    clientSocket = listeningSocket.accept();
                    final InputStream clientRequestStream = clientSocket.getInputStream();
                    final OutputStream clientResponseStream = clientSocket.getOutputStream();

                    final String remoteHost = "127.0.0.1";
                    final int remotePort = 80;
                    serverSocket = new Socket(remoteHost, remotePort);
                    final OutputStream serverRequestStream = serverSocket.getOutputStream();
                    final InputStream serverResponseStream = serverSocket.getInputStream();

                    new Thread() {
                        @Override
                        public void run() {
                            int bytesRead;
                            try {
                                while ((bytesRead = clientRequestStream.read(request)) != -1) {
                                    clientResponseStream.write(request, 0, bytesRead);
                                    clientResponseStream.flush();
                                }
                            } catch (final IOException e) {
                                LOG.error(e.toString());
                            }
                        }
                    };

                    new Thread() {
                        @Override
                        public void run() {
                            int bytesRead;
                            try {
                                while ((bytesRead = serverResponseStream.read(reply)) != -1) {
                                    serverRequestStream.write(reply, 0, bytesRead);
                                    serverRequestStream.flush();
                                }
                            } catch (final IOException e) {
                                LOG.error(e.toString());
                            }
                        }
                    };

                } catch (final Exception e) {
                    LOG.error(e.toString());
                }
            }
        } catch (final Exception e) {
            LOG.error(e.toString());
        }
    }
}
