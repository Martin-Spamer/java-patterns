
package coaching.types;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.arrays.NativeTypesArray;

/**
 * Unit Tests for Primitives Arrays.
 */
public final class NativeTypesArrayTest {

    /** LOG 			constant. */
    private static final Logger LOG = LoggerFactory
        .getLogger(NativeTypesArrayTest.class);

    /**
     * Unit Test to display array.
     */
    @Test
    public void testDisplayNativeArray() {
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        LOG.info("{}", primitivesArray);

        primitivesArray.display();
    }

    /**
     * Unit Test to display array.
     */
    @Test
    public void testDisplayMatrix() {
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        LOG.info("{}", primitivesArray);

        primitivesArray.displayMatrix();
    }

    /**
     * Unit Test to display array.
     */
    @Test
    public void testIterateArray() {
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        LOG.info("{}", primitivesArray);

        primitivesArray.iterateArray();
    }
}
