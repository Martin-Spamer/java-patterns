package patterns.adapter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The TargetTest Class.
 */
public class TargetTest {

	private static final Logger LOG = LoggerFactory.getLogger(TargetTest.class);

	/**
	 * Unit Test to request.
	 */
	@Test
	public void testRequest() {
		final TargetAdapter targetAdapter = new TargetAdapter();
		assertNotNull("Value cannot be null",targetAdapter);
		LOG.info("{}", targetAdapter.toString());
	}

}
