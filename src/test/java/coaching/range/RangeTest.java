
package coaching.range;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RangeTest {

    /** provides logging */
    private static final Logger log = LoggerFactory.getLogger(RangeTest.class);

    @Test
    public void testRange() {
        assertNotNull(new Range(0, 0));
        assertNotNull(new Range(0, 0, 0));
    }

    @Test
    public void testRangeOf() {
        assertNotNull(Range.of(0, 0));
        assertNotNull(Range.of(0, 1));
        assertNotNull(Range.of(1, 1));
        Range actual = Range.of(1, 3);
        assertNotNull(actual);
        log.info("{}", actual);
        Range expected = Range.of(1, 3, 1);
        assertNotNull(expected);
        log.info("{}", expected);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testRangeIncludes() {
        assertTrue(Range.of(0, 0).includes(0));
        assertTrue(Range.of(0, 1).includes(0));
        assertTrue(Range.of(0, 1).includes(1));
        assertTrue(Range.of(1, 1).includes(1));
        assertTrue(Range.of(1, 3, 1).includes(Range.of(1, 3, 1)));
        assertFalse(Range.of(0, 0).includes(1));
    }

    @Test
    public void testRangeExcludes() {
        assertTrue(Range.of(0, 0).excludes(1));
        assertTrue(Range.of(0, 1).excludes(2));
        assertTrue(Range.of(1, 1).excludes(0));
        assertTrue(Range.of(1, 1).excludes(2));
        assertFalse(Range.of(1, 1).excludes(1));
    }

    @Test
    public void testRangeAsArray() {
        int[] range = Range.asArray(0, 0);
        assertTrue(range.length == 1);
        log.info("Range : {}", range);
        for (long i : range) {
            log.info("\t{}", i);
        }

        range = Range.asArray(0, 1);
        assertTrue(range.length == 2);
        log.info("Range : {}", range);
        for (long i : range) {
            log.info("\t{}", i);
        }

        range = Range.asArray(1, 1);
        assertTrue(range.length == 1);
        log.info("Range : {}", range);
        for (long i : range) {
            log.info("\t{}", i);
        }

        range = Range.asArray(1, 3);
        assertTrue(range.length == 3);
        log.info("Range : {}", range);
        for (long i : range) {
            log.info("\t{}", i);
        }

        // log.info("Range : {}", Range.of(0L, 0L));
        // log.info("Range : {}", Range.of(1, 10));
        // log.info("Range : {}", Range.of(2, 256, 2));
        // log.info("Range : {}", Range.of(1, 10));
        // log.info("Range : {}", Range.of(2, 256, 2));
    }

}
