
package patterns.hopp;

import org.junit.Test;

import static org.junit.Assume.assumeNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * RemoteObjectProxy class tests.
 */
@Slf4j
public final class RemoteObjectProxyTest {

    /**
     * Unit test of typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final RemoteObjectProxy remoteObjectProxy = new RemoteObjectProxy();
        assumeNotNull(remoteObjectProxy);

        // When
        remoteObjectProxy.localMethod();

        // Then
        assumeNotNull(remoteObjectProxy);
    }

    /**
     * Unit test to remote method a$.
     */
    @Test
    public void testRemoteMethod() {
        final RemoteObjectProxy remoteObjectProxy = new RemoteObjectProxy();
        assumeNotNull(remoteObjectProxy);
        remoteObjectProxy.remoteMethod();
    }

    /**
     * Unit test to remote method proxy.
     */
    @Test
    public void testRemoteMethodProxy() {
        final RemoteObjectProxy remoteObjectProxy = new RemoteObjectProxy();
        assumeNotNull(remoteObjectProxy);
        remoteObjectProxy.remoteMethodProxy();
    }

}
