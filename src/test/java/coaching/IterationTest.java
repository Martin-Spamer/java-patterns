package coaching;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Examples of a iteration (looping) programming instructions.
 */
public class IterationTest {
	private static final Logger LOG = LoggerFactory.getLogger(IterationTest.class);

	/**
	 * The <code>for()</code> loop statement is an example of iteration.
	 *
	 * Q) How many times will the log code be executed?
	 */
	@Test
	public void testExampleFor() {
		final int max = 0;

		for (int i = 0; i < max; i++) {
			LOG.info("loop until {} < {}", i, max);
		}
	}

	/**
	 * The <code>for()</code> loop statement is an example of iteration.
	 *
	 * Q) How many times will the log code be executed?
	 */
	@Test
	public void testExampleForCountDown() {
		final int start = 10;
		final int end = 10;

		for (int i = start; i > end; i--) {
			LOG.info("{} > {}", i, end);
		}
	}

	/**
	 * The <code>while(not false)</code> statement is an example of selection.
	 *
	 * Q) How many times will the log code be executed?
	 */
	@Test
	public void testExampleWhileNotFalse() {
		boolean loop;
		loop = false;

		while (loop) {
			LOG.info("while({})", loop);
		}
	}

	/**
	 * The <code>while(true)</code> statement is an example of selection.
	 */
	@Test
	public void testExampleWhileTrue() {
		boolean exit = false;

		while (!exit) {
			LOG.info("while({})", exit);
			exit = true;
		}
	}

	/**
	 * The <code>do { ... } while(true)</code> statement is an example of selection.
	 *
	 * Q) How many times will the log code be executed?
	 */
	@Test
	public void testExampleDoWhile() {
		boolean exit = false;

		do {
			LOG.info("do while({})", exit);
			exit = true;
		} while (!exit);
	}

}
