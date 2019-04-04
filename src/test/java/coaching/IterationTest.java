
package coaching;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

import lombok.extern.slf4j.Slf4j;

/**
 * Examples of a iteration (looping) programming instructions.
 */
@Slf4j
public final class IterationTest {

    /**
     * The <code>for()</code> loop statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleFor() {
        log.info("testExampleFor");
        final int max = 0;
        int count = 0;

        log.debug("for(i = 0; i > {} ; i--)", max);
        for (int index = 0; index < max; index++) {
            count++;
        }

        log.info("loop count = {} ", count);
        assertEquals(0, count);
    }

    /**
     * The <code>for()</code> loop statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleForCountDown() {
        log.info("testExampleFor");
        final int start = 10;
        final int end = 10;
        int count = 0;

        log.debug("for(i={}; i > {} ; i--)", start, end);
        for (int index = start; index > end; index--) {
            count++;
        }

        log.debug("loop count = {} ", count);
        assertEquals(0, count);
    }

    /**
     * The <code>while(not false)</code> statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleWhileNotFalse() {
        log.info("testExampleFor");
        boolean loop;
        loop = false;
        int count = 0;

        log.debug("while({})", loop);
        while (loop) {
            count++;
            loop = false;
        }

        log.debug("loop count = {} ", count);
        assertEquals(0, count);
    }

    /**
     * The <code>while(true)</code> statement is an example of iteration.
     *
     * Q) How many times will the log code be executed?
     */
    @Test
    public void testExampleWhileTrue() {
        log.info("testExampleFor");
        boolean exit = false;
        int count = 0;

        log.debug("while({})", exit);
        while (!exit) {
            count++;
            exit = true;
        }
        log.debug("loop count = {} ", count);
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
        log.info("testExampleFor");
        boolean loop = true;
        int count = 0;

        log.debug("do while({})", loop);
        do {
            count++;
            loop = true;
        } while (!loop);

        log.debug("loop count = {} ", count);
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
        log.info("testExampleFor");
        boolean exit = false;
        int count = 0;

        log.debug("do while({})", exit);
        do {
            count++;
            exit = true;
        } while (!exit);

        log.debug("loop count = {} ", count);
        assertEquals(1, count);
    }

}
