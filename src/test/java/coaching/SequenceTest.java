
package coaching;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * A <i>Sequence</i> of instructions is one of the most basic idioms in
 * programming.
 *
 * In a Sequence, one programming instruction follows another.
 */
public final class SequenceTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(SequenceTest.class);

    /**
     * Example of a simple sequence of programming instructions.
     */
    @Test
    public void testSimpleSequenceExample() {
        final int x = 1;
        final int y = 1;
        final int z = x + y;
        LOG.info("{} = {} + {}", z, x, y);
        assertEquals(2, z);
    }

    /**
     * Example of a sequence of function calls.
     */
    @Test
    public void testFunctionSequence() {
        foo();
        bar();
    }

    /**
     * Example of a sequence of function calls.
     */
    @Test
    public void testAnotherFunctionSequence() {
        bar(foo());
    }

    /**
     * foo function.
     *
     * @return true
     */
    boolean foo() {
        LOG.info("foo()");
        return true;
    }

    /**
     * bar function.
     *
     * @return true
     */
    boolean bar() {
        LOG.info("bar()");
        return true;
    }

    boolean bar(final boolean bar) {
        if (bar == true) {
            LOG.info("the bar function of run");
        }
        return bar;
    }

    int add(final int x, final int y) {
        return x + y;
    }

}
