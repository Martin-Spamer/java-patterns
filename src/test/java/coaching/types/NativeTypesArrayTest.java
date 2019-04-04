
package coaching.types;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

import coaching.arrays.NativeTypesArray;
import lombok.extern.slf4j.Slf4j;

/**
 * Unit Tests for Primitives Arrays.
 */
@Slf4j
public final class NativeTypesArrayTest {

    /**
     * Unit Test to display array.
     */
    @Test
    public void testDisplayMatrix() {
        log.info("testDisplayMatrix");
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        primitivesArray.displayMatrix();
    }

    /**
     * Unit Test to display array.
     */
    @Test
    public void testDisplayEmptyMatrix() {
        log.info("testDisplayEmptyMatrix");
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        primitivesArray.displayEmptyMatrix();
    }

    /**
     * Unit Test to display array.
     */
    @Test
    public void testIterateArray() {
        log.info("testIterateArray");
        final NativeTypesArray primitivesArray = new NativeTypesArray();
        assertNotNull(primitivesArray);
        primitivesArray.iterateArray();
    }
}
