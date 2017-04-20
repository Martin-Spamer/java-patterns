package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderBTest {

	private static final Logger LOG = LoggerFactory.getLogger(BuilderBTest.class);

	@Test
	public void testBuild() {
		final BuilderB builderB = new BuilderB();
		assertNotNull(builderB);
	}

}
