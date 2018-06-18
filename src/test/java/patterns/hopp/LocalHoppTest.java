
package patterns.hopp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assume.assumeNotNull;

import org.junit.Test;

/**
 * class LocalHoppTest.
 */
public class LocalHoppTest {

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
     * Test type.
     *
     * @throws Exception the exception
     */
    @Test
    public void testType() {
        assertNotNull(LocalHopp.class);
    }

    /**
     * Test remote method.
     *
     * @throws Exception the exception
     */
    @Test
    public void testRemoteMethod() {
        final LocalHopp localHopp = new LocalHopp();
        assumeNotNull("Value cannot be null", localHopp);
        localHopp.remoteMethod();
    }

    /**
     * Test local method.
     *
     * @throws Exception the exception
     */
    @Test
    public void testLocalMethod() {
        final LocalHopp localHopp = new LocalHopp();
        assumeNotNull("Value cannot be null", localHopp);
        localHopp.localMethod();
    }

}
