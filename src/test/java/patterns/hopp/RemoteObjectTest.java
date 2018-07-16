
package patterns.hopp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assume.assumeNotNull;

/**
 * RemoteObjectTest class.
 */
public final class RemoteObjectTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(RemoteObjectProxy.class);

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final RemoteObject remoteObject = new RemoteObject();
        assumeNotNull(remoteObject);

        // When
        remoteObject.remoteMethod();

        // Then
    }

    /**
     * Unit test to remote method a$.
     */
    @Test
    public void testRemoteMethod() {
        final RemoteObject remoteObject = new RemoteObject();
        assumeNotNull(remoteObject);
        remoteObject.remoteMethod();
    }

    /**
     * Unit test to local method a$.
     */
    @Test
    public void testLocalMethod() {
        final RemoteObject remoteObject = new RemoteObject();
        assumeNotNull(remoteObject);
        remoteObject.localMethod();
    }

}
