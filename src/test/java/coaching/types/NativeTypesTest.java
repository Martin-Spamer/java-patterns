
package coaching.types;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Class showing usage of native types.
 */
public final class NativeTypesTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(NativeTypesTest.class);

    /**
     * Unit Test to display.
     */
    @Test
    public void testDisplay() {
        final NativeTypes nativeTypes = new NativeTypes();
        assertNotNull(nativeTypes);
        nativeTypes.display();
    }

}
