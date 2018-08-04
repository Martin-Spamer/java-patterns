
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

    /** provides logging. */
    private static final Logger LOG = LoggerFactory
        .getLogger(NativeTypesArrayTest.class);

    /**
     * Unit Test to display array.
     */
    @Test
    public void testDisplayMatrix() {
        LOG.info("testDisplayMatrix");
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        primitivesArray.displayMatrix();
    }

    /**
     * Unit Test to display array.
     */
    @Test
    public void testDisplayEmptyMatrix() {
        LOG.info("testDisplayEmptyMatrix");
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        primitivesArray.displayEmptyMatrix();
    }

    /**
     * Unit Test to display array.
     */
    @Test
    public void testIterateArray() {
        LOG.info("testIterateArray");
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        primitivesArray.iterateArray();
    }
}
