
package coaching.net;

import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * The Class RequestProxyTest.
 */
public class RequestProxyTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(RequestProxyTest.class);

    /**
     * Unit test to request proxy.
     *
     * @throws Exception the exception
     */
    @Ignore("Work-in-progress")
    @Test
    public void testRequestProxy() throws Exception {
        final ServerSocket serverSocket = new ServerSocket(8888);
        final Socket socket = serverSocket.accept();
        RequestProxy requestProxy = new RequestProxy(socket);
        assertNotNull(requestProxy);
        socket.close();
        serverSocket.close();
        LOG.info(requestProxy.toString());
    }

}
