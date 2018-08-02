
package coaching.net;

import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the RequestHandler class.
 */
@Ignore("work-in-progress low-priority")
public final class RequestHandlerTest {

    /** provides logging */
    private static final Logger LOG = LoggerFactory.getLogger(RequestHandlerTest.class);

    /**
     * Unit test to request handler.
     *
     * @throws Exception the exception
     */
    @Test
    public void testRequestHandler() throws Exception {
        final ServerSocket serverSocket = new ServerSocket(8888);
        final Socket socket = serverSocket.accept();
        final RequestHandler requestHandler = new RequestHandler(socket);
        assertNotNull(requestHandler);
        LOG.info(requestHandler.toString());
        socket.close();
        serverSocket.close();
    }

}
