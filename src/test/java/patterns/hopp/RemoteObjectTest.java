
package patterns.hopp;

import org.junit.Test;

import static org.junit.Assume.assumeNotNull;

/**
 * RemoteObjectTest class.
 */
public final class RemoteObjectTest {

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
