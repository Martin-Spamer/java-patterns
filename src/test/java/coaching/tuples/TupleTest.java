
package coaching.tuples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

/**
 * Unit test for Tuple Class.
 */
@Slf4j
public final class TupleTest {

    private static final String RIGHT = "Right";
    private static final String LEFT = "Left";

    /**
     * The Point Class.
     */
    public final class Point extends Tuple<Float, Float> {
    }

    /**
     * Unit Test to point.
     */
    @Test
    public void testPoint() {
        final Point point = new Point();
        assertNotNull(point);
    }

    /**
     * Unit Test to object tuple.
     */
    @Test
    public void testObjectTuple() {
        final Tuple<Object, Object> tuple = new Tuple<>();
        assertNotNull(tuple);
    }

    /**
     * Unit Test to float tuple.
     */
    @Test
    public void testFloatTuple() {
        final Tuple<Float, Float> tuple = new Tuple<>();
        assertNotNull(tuple);
    }

    /**
     * Unit Test to string tuple.
     */
    @Test
    public void testStringTuple() {
        final Tuple<String, String> tuple = new Tuple<>();
        assertNotNull(tuple);
    }

    /**
     * Test tuple.
     */
    @Test
    public void testTuple() {
        final TupleInterface<String, String> tuple = new Tuple<>();
        assertNotNull(tuple);
        tuple.setLeft(LEFT);
        tuple.setRight(RIGHT);
        assertEquals(LEFT, tuple.getLeft());
        assertEquals(RIGHT, tuple.getRight());
    }

    /**
     * Test tuple LR.
     */
    @Test
    public void testTupleLR() {
        final TupleInterface<String, String> tuple = new Tuple<>(LEFT, RIGHT);
        assertNotNull(tuple);
        assertEquals(LEFT, tuple.getLeft());
        assertEquals(RIGHT, tuple.getRight());
    }

}
