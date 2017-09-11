
package coaching;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * An example of a Sequence of programming instructions.
 */
public class Sequence {
	private static final Logger LOG = LoggerFactory.getLogger(Sequence.class);

	/**
	 * Unit Test to show a sequence of programming instructions.
	 */
	@Test
	public void testExampleSequence() {
		final int x = 1;
		final int y = 1;
		final int z = x + y;
		LOG.info("{} = {} + {}", z, x, y);
	}

}
