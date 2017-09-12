package coaching;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An example of a Sequence of programming instructions.
 * The Sequence Class.
 */
public class SequenceTest {
	private static final Logger LOG = LoggerFactory.getLogger(SequenceTest.class);

	/**
	 * Unit Test to show a sequence of programming instructions.
	 */
	@Test
	public void testExampleSequence() {
		final int x = 1;
		final int y = 1;
		final int z = x + y;
		LOG.info("{} = {} + {}", z, x, y);
		assertEquals(2, x);
	}

}
