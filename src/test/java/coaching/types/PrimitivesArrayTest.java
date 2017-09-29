
package coaching.types;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * The PrimitivesArrayTest Class.
 */
public class PrimitivesArrayTest {

	/**
	 * Unit Test to display.
	 */
	@Test
	public void testDisplay() {
		final PrimitivesArray primitivesArray = new PrimitivesArray();
		assertNotNull("Value cannot be null",primitivesArray);
		primitivesArray.display();
	}

}
