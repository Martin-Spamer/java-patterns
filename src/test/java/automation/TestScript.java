package automation;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.*;

/**
 * TestScript Class.
 */
public class TestScript {

	private static final Logger LOG = LoggerFactory.getLogger(TestScript.class);

	/**
	 * Unit Test to case.
	 */
	@Test
	public void testCase() {
		final Model model = new Model();
		assertNotNull(model);
		assertNotNull(model.given().when().then());
		LOG.info("{}", model.toString());
	}

}
