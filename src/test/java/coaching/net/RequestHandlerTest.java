
package coaching.net;

import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class RequestHandlerTest {

    @Ignore("Work-in-progress")
    @Test
    public void testRequestHandler() throws Exception {
        final ServerSocket serverSocket = new ServerSocket(8888);
        final Socket socket = serverSocket.accept();
        RequestHandler requestHandler = new RequestHandler(socket);
        assertNotNull(requestHandler);
        socket.close();
        serverSocket.close();
    }

}
