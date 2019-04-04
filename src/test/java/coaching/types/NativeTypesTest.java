
package coaching.types;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Class showing usage of native types.
 */
@Slf4j
public final class NativeTypesTest {

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
