package coaching;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Examples of a iteration (looping) programming instructions.
 * The Iteration Class.
 */
public class IterationTest {
	private static final Logger LOG = LoggerFactory.getLogger(IterationTest.class);

	/**
	 * Unit Test to example for.
	 */
	@Test
	public void testExampleFor() {
		LOG.info("testFor");
		final int start = 1;
		final int end = 10;

		for (int i = start; i == end; i++) {
			LOG.info("loop until {} == {}", i, end);
		}

		for (int i = start; i <= end; i++) {
			LOG.info("loop until {} <= {}", i, end);
		}

		for (int i = start; i < end + 1; i++) {
			LOG.info("loop until {} < {}", i, end);
		}
		assertTrue(true);
	}

	/**
	 * Unit Test to example for 0.
	 */
	@Test
	public void testExampleFor0() {
		LOG.info("testFor0 {}");
		final int max = 0;

		for (int i = 0; i < max; i++) {
			LOG.info("loop until {} < {}", i, max);
		}

		assertTrue(true);
	}

	/**
	 * Unit Test to example for count down.
	 */
	@Test
	public void testExampleForCountDown() {
		LOG.info("testForCountDown");
		final int start = 10;
		final int end = 10;
		for (int i = start; i > end; i--) {
			LOG.info("{} > {}", i, end);
		}

		assertTrue(true);
	}

	/**
	 * Unit Test to example while false.
	 */
	@Test
	public void testExampleWhileFalse() {
		LOG.info("testWhileFalse");
		boolean loop;
		loop = false;
		while (loop) {
			LOG.info("while({})", loop);
		}
		assertTrue(true);
	}

	/**
	 * Unit Test to example while not exit.
	 */
	@Test
	public void testExampleWhileNotExit() {
		LOG.info("testWhileNotExit");
		boolean exit = false;
		while (exit) {
			LOG.info("while({})", exit);
			exit = true;
		}
		assertTrue(true);
	}

	/**
	 * Unit Test to example do while.
	 */
	@Test
	public void testExampleDoWhile() {
		LOG.info("testDoWhile");
		boolean exit = false;
		do {
			LOG.info("do while({})", exit);
			exit = true;
		} while (!exit);
		assertTrue(true);
	}
}
