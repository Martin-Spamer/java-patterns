package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BuilderBTest {

	@Test
	public void testBuild() {
		final BuilderB builderB = new BuilderB();
		assertNotNull(builderB);
	}

}
