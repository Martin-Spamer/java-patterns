
package patterns.hopp;

import org.junit.Test;

import static org.junit.Assume.assumeNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class LocalHoppTest.
 */


@Slf4j
public final class LocalHoppTest {

    /**
     * Unit test to typical usage.
     */
    @Test
    public void testTypicalUsage() {
        // Given
        final LocalHopp localHopp = new LocalHopp();
        assumeNotNull(localHopp);

        // When
        localHopp.localMethod();

        // Then
    }

    /**
     * Test remote method.
     */
    @Test
    public void testRemoteMethod() {
        final LocalHopp localHopp = new LocalHopp();
        assumeNotNull(localHopp);
        localHopp.remoteMethod();
    }

    /**
     * Test local method.
     */
    @Test
    public void testLocalMethod() {
        final LocalHopp localHopp = new LocalHopp();
        assumeNotNull(localHopp);
        localHopp.localMethod();
    }

}
