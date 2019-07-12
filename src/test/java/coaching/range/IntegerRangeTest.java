
package coaching.range;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;



@Slf4j
public class IntegerRangeTest {

    /**
     *  provides logging.
     */

    @Test
    public void testIntegerRange() {
        assertNotNull(new IntegerRange(0, 0));
        assertNotNull(new IntegerRange(0, 0, 0));
        log.info("{}", new IntegerRange(Integer.MIN_VALUE, Integer.MIN_VALUE));
        log.info("{}", new IntegerRange(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    /**
     * test IntegerRange object.
     */
    @Test
    public void testRangeOf() {
        assertNotNull(IntegerRange.of(0, 0));
        assertNotNull(IntegerRange.of(0, 1));
        assertNotNull(IntegerRange.of(1, 1));
        Range actual = IntegerRange.of(1, 3);
        assertNotNull(actual);
        log.info("{}", actual);
        Range expected = IntegerRange.of(1, 3, 1);
        assertNotNull(expected);
        log.info("{}", expected);
        assertEquals(expected.toString(), actual.toString());
    }

    /**
     * test IntegerRange object.
     */
    @Test
    public void testIntegerRangeIncludes() {
        IntegerRange range1to3 = new IntegerRange(1, 3);
        assertTrue(range1to3.includes(1));
        assertTrue(range1to3.includes(2));
        assertTrue(range1to3.includes(3));
        assertFalse(range1to3.includes(0));
        assertFalse(range1to3.includes(4));
    }

    /**
     * test IntegerRange object.
     */
    @Test
    public void testRangeIncludes() {
        assertTrue(IntegerRange.of(0, 0).includes(0));
        assertTrue(Range.of(0, 1).includes(0));
        assertTrue(Range.of(0, 1).includes(1));
        assertTrue(Range.of(1, 1).includes(1));
        assertTrue(Range.of(1, 3, 1).includes(Range.of(1, 3, 1)));
        assertFalse(Range.of(0, 0).includes(1));
    }

    /**
     * test IntegerRange object.
     */
    @Test
    public void testIntegerRangeExcludes() {
        IntegerRange range1to3 = new IntegerRange(1, 3);
        assertTrue(range1to3.excludes(0));
        assertTrue(range1to3.excludes(4));
        assertFalse(range1to3.excludes(1));
        assertFalse(range1to3.excludes(2));
        assertFalse(range1to3.excludes(3));
    }

    /**
     * test IntegerRange object.
     */
    @Test
    public void testRangeExcludes() {
        assertTrue(Range.of(0, 0).excludes(1));
        assertTrue(Range.of(0, 1).excludes(2));
        assertTrue(Range.of(1, 1).excludes(0));
        assertTrue(Range.of(1, 1).excludes(2));
        assertFalse(Range.of(1, 1).excludes(1));
    }

}
