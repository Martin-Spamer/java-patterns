
package coaching.tuples;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test the Box class.
 */
public final class BoxTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(BoxTest.class);

    /**
     * Test box object.
     */
    @Test
    public void testBoxObject() {
        final Box<Object> box = new Box<Object>();
        assertNotNull(box);
        LOG.info(box.toString());
    }

    /**
     * Test box string.
     */
    @Test
    public void testBoxString() {
        final Box<String> box = new Box<String>();
        assertNotNull(box);
        LOG.info(box.toString());
    }

}
