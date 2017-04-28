package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderTest {

	private static final Logger LOG = LoggerFactory.getLogger(BuilderTest.class);

	@Test
	public void testBuildOne() {
		final BuilderOne instance = new BuilderOne();
		assertNotNull(instance);
		LOG.info("{}", instance.toString());
	}

	@Test
	public void testBuildTwo() {
		final BuilderTwo instance = new BuilderTwo();
		assertNotNull(instance);
		LOG.info("{}", instance.toString());
	}

}
