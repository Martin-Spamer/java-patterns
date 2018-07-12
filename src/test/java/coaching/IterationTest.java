
package coaching;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

/**
 * Examples of a iteration (looping) programming instructions.
 */
public class IterationTest {

    /** provides logging. */
    private static final Logger LOG = LoggerFactory.getLogger(IterationTest.class);

    /**
     * The <code>for()</code> loop statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleFor() {
        LOG.info("testExampleFor");
        final int max = 0;
        int count = 0;

        LOG.debug("for(i = 0; i > {} ; i--)", max);
        for (int i = 0; i < max; i++) {
            count++;
        }

        LOG.info("loop count = {} ", count);
        assertEquals(0, count);
    }

    /**
     * The <code>for()</code> loop statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleForCountDown() {
        LOG.info("testExampleFor");
        final int start = 10;
        final int end = 10;
        int count = 0;

        LOG.debug("for(i={}; i > {} ; i--)", start, end);
        for (int i = start; i > end; i--) {
            count++;
        }

        LOG.debug("loop count = {} ", count);
        assertEquals(0, count);
    }

    /**
     * The <code>while(not false)</code> statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleWhileNotFalse() {
        LOG.info("testExampleFor");
        boolean loop;
        loop = false;
        int count = 0;

        LOG.debug("while({})", loop);
        while (loop) {
            count++;
            loop = false;
        }

        LOG.debug("loop count = {} ", count);
        assertEquals(0, count);
    }

    /**
     * The <code>while(true)</code> statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleWhileTrue() {
        LOG.info("testExampleFor");
        boolean exit = false;
        int count = 0;

        LOG.debug("while({})", exit);
        while (!exit) {
            count++;
            exit = true;
        }
        LOG.debug("loop count = {} ", count);
        assertEquals(1, count);
    }

    /**
     * The <code>do { ... } while(true)</code> statement is an example of an
     * iteration.
     *
     * Q) How many times will the code be executed?
     */
    @Test
    public void testExampleDoWhileTrue() {
        LOG.info("testExampleFor");
        boolean loop = true;
        int count = 0;

        LOG.debug("do while({})", loop);
        do {
            count++;
            loop = true;
        } while (!loop);

        LOG.debug("loop count = {} ", count);
        assertEquals(1, count);
    }

    /**
     * The <code>do { ... } while(true)</code> statement is an example of an
     * iteration.
     *
     * Q) How many times will the code be executed?
     */
    @Test
    public void testExampleDoWhileFalse() {
        LOG.info("testExampleFor");
        boolean exit = false;
        int count = 0;

        LOG.debug("do while({})", exit);
        do {
            count++;
            exit = true;
        } while (!exit);

        LOG.debug("loop count = {} ", count);
        assertEquals(1, count);
    }

}
