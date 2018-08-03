
package coaching.net;

import java.net.ServerSocket;
import java.net.Socket;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit tests for the RequestProxy class.
 */
@Ignore("work-in-progress low-priority")
public final class RequestProxyTest {

    /** Provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(RequestProxyTest.class);

    /**
     * Unit test to request proxy.
     *
     * @throws Exception the exception
     */
    @Test
    public void testRequestProxy() throws Exception {
        final ServerSocket serverSocket = new ServerSocket(8888);
        final Socket socket = serverSocket.accept();
        final RequestProxy requestProxy = new RequestProxy(socket);
        assertNotNull(requestProxy);
        LOG.info(requestProxy.toString());
        socket.close();
        serverSocket.close();
    }

}
