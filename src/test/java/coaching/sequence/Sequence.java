package coaching.sequence;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sequence {
	private static final Logger LOG = LoggerFactory.getLogger(Sequence.class);

	@Test
	public void testSequence() {
		final int x = 1;
		final int y = 1;
		final int z = x + y;
		LOG.info("{} = {} + {}", z, x, y);
	}

}
