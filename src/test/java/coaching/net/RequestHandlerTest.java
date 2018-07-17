
package coaching.net;

import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the RequestHandler class.
 */
@Ignore("work-in-progress low-priority")
public final class RequestHandlerTest {

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
        socket.close();
        serverSocket.close();
    }

}
