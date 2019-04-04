
package coaching;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

import lombok.extern.slf4j.Slf4j;

/**
 * A <i>Sequence</i> of instructions is one of the most basic idioms in
 * programming.
 *
 * In a Sequence, one programming instruction follows another.
 */
@Slf4j
public final class SequenceTest {

    /**
     * Example of a simple sequence of programming instructions.
     */
    @Test
    public void testSimpleSequenceExample() {
        final int x = 1;
        final int y = 1;
        final int z = x + y;
        log.info("{} = {} + {}", z, x, y);
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
        log.info("foo()");
        return true;
    }

    /**
     * bar function.
     *
     * @return true
     */
    boolean bar() {
        log.info("bar()");
        return true;
    }

    boolean bar(final boolean bar) {
        if (bar == true) {
            log.info("the bar function of run");
        }
        return bar;
    }

    int add(final int x, final int y) {
        return x + y;
    }

}
