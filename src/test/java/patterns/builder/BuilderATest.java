package patterns.builder;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BuilderATest {

	@Test
	public void testBuild() {
		final BuilderA builderA = new BuilderA();
		assertNotNull(builderA);
	}

}
