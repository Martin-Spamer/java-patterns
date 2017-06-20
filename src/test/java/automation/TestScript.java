package automation;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		model.given().when().then();
		assertNotNull(model);
		LOG.info("{}", model.toString());
	}

}
