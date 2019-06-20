
package coaching.tuples;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test the Box class.
 */


/** The Constant 			log. */
@Slf4j
public final class BoxTest {

    /**
     * Test box object.
     */
    @Test
    public void testBoxObject() {
        final Box<Object> box = new Box<Object>();
        assertNotNull(box);
        log.info(box.toString());
    }

    /**
     * Test box string.
     */
    @Test
    public void testBoxString() {
        final Box<String> box = new Box<String>();
        assertNotNull(box);
        log.info(box.toString());
    }

}
