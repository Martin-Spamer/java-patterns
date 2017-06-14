
package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The BuilderTest Class.
 */
public class BuilderTest {

	private static final Logger LOG = LoggerFactory.getLogger(BuilderTest.class);

	/**
	 * Unit Test to build one.
	 */
	@Test
	public void testBuildOne() {
		final BuilderOne instance = new BuilderOne();
		assertNotNull(instance);
		LOG.info("{}", instance.toString());
	}

	/**
	 * Unit Test to build two.
	 */
	@Test
	public void testBuildTwo() {
		final BuilderTwo instance = new BuilderTwo();
		assertNotNull(instance);
		LOG.info("{}", instance.toString());
	}

}
