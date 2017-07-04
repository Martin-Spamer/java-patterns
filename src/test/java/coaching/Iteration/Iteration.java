package coaching.Iteration;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Iteration {
	private static final Logger LOG = LoggerFactory.getLogger(Iteration.class);

	@Test
	public void testFor() {
		final int start = 1;
		final int end = 10;
		for (int i = start; i == end; i++) {
			LOG.info("for loop one {}", i);
		}
		for (int i = start; i <= end; i++) {
			LOG.info("for loop two {}", i);
		}
		for (int i = start; i < end + 1; i++) {
			LOG.info("for loop three {}", i);
		}
	}

	@Test
	public void testFor0() {
		final int max = 0;
		for (int i = 0; i < max; i++) {
			LOG.info("{}", i);
		}
	}

	@Test
	public void testForCountDown() {
		final int start = 10;
		final int end = 10;
		for (int i = start; i > end; i--) {
			LOG.info("{}", i);
		}
	}

	@Test
	public void testWhileFalse() {
		boolean loop;
		loop = false;
		while (loop) {
			LOG.info("process");
		}
	}

	@Test
	public void testWhileNotExit() {
		boolean exit = false;
		while (exit) {
			LOG.info("process");
			exit = true;
		}
	}

	@Test
	public void testDoWhile() {
		LOG.info("{}");
		boolean exit = false;
		do {
			LOG.info("process");
			exit = true;
		} while (!exit);
	}

}
