package javamentor.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PrimitivesArrayTest {

	@Test
	public void testDisplay() {
		final PrimitivesArray primitivesArray = new PrimitivesArray();
		assertNotNull(primitivesArray);
		primitivesArray.display();
	}

}
