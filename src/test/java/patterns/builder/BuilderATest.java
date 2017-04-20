package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BuilderATest {

	private static final Logger LOG = LoggerFactory.getLogger(BuilderATest.class);

	@Test
	public void testBuild() {
		final BuilderA builderA = new BuilderA();
		assertNotNull(builderA);
	}

}
