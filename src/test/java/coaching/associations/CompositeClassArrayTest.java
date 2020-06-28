
package coaching.associations;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * class CompositeClassArrayTest.
 */



@Slf4j
public final class CompositeClassArrayTest {

    /**
     * Unit Test to composite class array.
     */
    @Test
    public void testCompositeClassArray() {
        final CompositeClassArray compositeClassArray = new CompositeClassArray();
        assertNotNull(compositeClassArray);
        log.info(compositeClassArray.toString());
    }

}
